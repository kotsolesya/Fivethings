package com.example.olesya.fivethings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lesichka on 25.03.2016.
 */
public class SecondThingActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondthing);
        onClickNextThings();
        onClickPrevThings();
    }
    private void onClickNextThings() {
        Button onClickNext = (Button) findViewById(R.id.btn_next);
        onClickNext.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(SecondThingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onClickPrevThings() {
        Button onClickPrev = (Button) findViewById(R.id.btn_prev);

        onClickPrev.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(SecondThingActivity.this, FirstThingActivity.class);
                startActivity(intent);
            }
        });

    }
}
