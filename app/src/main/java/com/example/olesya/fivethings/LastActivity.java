package com.example.olesya.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.reflect.Field;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_home);


        //setSubmitButton();
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_who_are_you);
        checkRadioGroup(radioGroup);
        Log.i("TAG", "Create_Last");
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

    /*
    обробка RadioGroup
     */
    private void checkRadioGroup(RadioGroup radioGroup) {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case -1:
                        Toast.makeText(getApplicationContext(), "No choice", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_btn_junior:
                        Toast.makeText(getApplicationContext(), "junior", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_btn_middle:
                        Toast.makeText(getApplicationContext(), "middle", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_btn_senior:
                        Toast.makeText(getApplicationContext(), "senior", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        break;
                }
            }
        });
    }

    /*
     * setSubmitButton for button Submit, create resume

     */
    /*private void setSubmitButton() {


    }*/
}
