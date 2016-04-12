package com.example.olesya.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_thing);
        onClickFirstThings();
        onClickSecondThings();
        onClickThreeThings();
        onClickFourThings();
        onClickFiveThings();
        Log.i("TAG", "Create_5");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "Stop_5");
    }
    /*
    onClickFirstThings для виклику першої причини FirstThings
     */
    private void onClickFirstThings() {
        Button onClickFirst = (Button) findViewById(R.id.btn_first_thing);
        onClickFirst.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(FiveActivity.this, FirstThingActivity.class);
                startActivity(intent);
            }
        });
    }

    /*
    onClickSecondThings для виклику другої причини SecondThings
     */
    private void onClickSecondThings() {
        Button onClickSecond = (Button) findViewById(R.id.btn_second_thing);
        onClickSecond.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(FiveActivity.this, SecondThingActivity.class);
                startActivity(intent);
            }
        });

    }

    /*
       onClickThreeThings для виклику третьої причини
        */
    private void onClickThreeThings() {
        Button onClickThree = (Button) findViewById(R.id.btn_three_thing);
        onClickThree.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(FiveActivity.this, ThreeActivity.class);
                startActivity(intent);
            }
        });
    }

    /*
        onClickFourThings для виклику четвертої причини
         */
    private void onClickFourThings() {
        Button onClickFour = (Button) findViewById(R.id.btn_four_thing);
        onClickFour.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(FiveActivity.this, FourActivity.class);
                startActivity(intent);
            }
        });
    }
  /*
        onClickFiveThings для виклику п'ятої причини
         */

    private void onClickFiveThings() {
        Button onClickFive = (Button) findViewById(R.id.btn_five_thing);
        onClickFive.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(FiveActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
