package com.example.olesya.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickFirstThings();
        Log.i("TAG", "Create_Main");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG","Stop");
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



