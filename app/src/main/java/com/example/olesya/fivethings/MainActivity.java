package com.example.olesya.fivethings;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickFirstThings();

    }

    private void onClickFirstThings() {
        /*
        находим елементи,  кнопку
        @param btnFirst об'єкт кнопка і до неї метод що запускає іншу activity
        @param btn_first_thing кнопка що переходить на first thing
         */
        Button btnFirst = (Button) findViewById(R.id.btn_first_thing);

       // обработчик нажатия
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FirstThingActivity.class));
            }
        });


    }
}



