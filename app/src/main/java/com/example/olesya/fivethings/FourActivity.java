package com.example.olesya.fivethings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;

import java.lang.reflect.Field;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_thing);
        onClickFirstThings();
         onClickSecondThings();
        onClickThreeThings();
      //  onClickFourThings();
        onClickFiveThings();
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_home);
        getOverflowMenu();
        Log.i("TAG", "Create_4");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "Stop_4");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bar_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    /*
    для кнопки додому, на головну активність
    @param  android.R.id.home іконка домик лоя повернення на головну
    @param R.id.action_feedback для показу LastActivity з підсумком
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            }
            case R.id.action_feedback: {
                Intent intent = new Intent(this, LastActivity.class);
                startActivity(intent);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void getOverflowMenu() {

        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if(menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    onClickFirstThings для виклику першої причини FirstThings
     */
    private void onClickFirstThings() {
        Button onClickFirst = (Button) findViewById(R.id.btn_first_thing);
        onClickFirst.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(FourActivity.this, FirstThingActivity.class);
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
                Intent intent = new Intent(FourActivity.this, SecondThingActivity.class);
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
                Intent intent = new Intent(FourActivity.this, ThreeActivity.class);
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
                Intent intent = new Intent(FourActivity.this, FourActivity.class);
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
                Intent intent = new Intent(FourActivity.this, FiveActivity.class);
                startActivity(intent);
            }
        });
    }
}
