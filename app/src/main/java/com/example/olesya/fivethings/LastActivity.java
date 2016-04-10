package com.example.olesya.fivethings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        //setSubmitButton();
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup_who_are_you);
        checkRadioGroup(radioGroup);
        Log.i("TAG", "Create_Last");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "Stop");
    }

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
