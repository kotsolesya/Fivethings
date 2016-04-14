package com.example.olesya.fivethings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.reflect.Field;

public class LastActivity extends AppCompatActivity {
    String statusFromRadioGroup;
    String nameUser;
    String textCheckboxWasHelpful;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
      // встановлення ActionBar кнопки home і відгук
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_home);
      //  обробка RadioGroup
       RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_who_are_you);
        /*RadioButton rbu =(RadioButton)findViewById(R.id.radio_btn_junior);
        rbu.getId();
        rbu.setChecked(true);
        statusFromRadioGroup = rbu.getText().toString();*/
         checkRadioGroup(radioGroup);


      // кнопка Підсумок
        setSubmitButton();

        Log.i("TAG", "Create_Last");


    }


    /*
    обробка RadioGroup
     */
    private void checkRadioGroup(RadioGroup radioGroup) {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton =  (RadioButton) group.findViewById(checkedId);

                switch (checkedId) {
                    case -1:
                        statusFromRadioGroup = "no status";
                        break;
                    case R.id.radio_btn_junior:
                        statusFromRadioGroup = radioButton.getText().toString();
                        break;
                    case R.id.radio_btn_middle:
                        statusFromRadioGroup = radioButton.getText().toString();
                        break;
                    case R.id.radio_btn_senior:
                        statusFromRadioGroup = radioButton.getText().toString();
                        break;

                    default:
                        break;
                }
            }
        });

    }


    /*
     * setSubmitButton for button Submit, create resume
       @param builder для діалогового вікна, що підсумовує відповіль для користувача після натиснення кнопки Submit
     */
    private void setSubmitButton() {
        Button btnFirst = (Button) findViewById(R.id.btn_submit);
        if(statusFromRadioGroup==null) statusFromRadioGroup="Junior Developer";

        // обробчик клікання кнопки
        if (btnFirst != null) {
            btnFirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // Log.i("TAG", statusFromRadioGroup);
                    EditText editTextName = (EditText) findViewById(R.id.editText_name);
                    nameUser = editTextName.getText().toString();
                    if(TextUtils.isEmpty(nameUser)) {
                        editTextName.setError("please enter your name");
                        return;
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(LastActivity.this);
                    builder.setTitle("Thank you ," + nameUser + ", for your time!")
                            .setMessage("You are " + statusFromRadioGroup + ".\n"+ checkCheckboxWasHelpful() )
                            .setCancelable(false)
                            .setNegativeButton("ОК",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });
                    AlertDialog alert = builder.create();
                    alert.show();


                }
            });
        }

    }

private String checkCheckboxWasHelpful(){
    //  обробка CheckBox
    String text =new String();
    CheckBox checkboxWasHelpful = (CheckBox)findViewById(R.id.checkBox_was_helpful);
    if (checkboxWasHelpful.isChecked() )
    {
        text = " I am happy, that this application is useful";
    }
    else {
        text = " Don't judge me too harshly:)";
    }
    return text;
}

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "Stop_Last");
    }

    /*
    для кнопки додому, на головну активність
    @param  android.R.id.home іконка домик лоя повернення на головну
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
