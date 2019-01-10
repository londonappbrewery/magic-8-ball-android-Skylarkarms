package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.Ask_Button);

        final ImageView magicBall;

        magicBall = (ImageView) findViewById(R.id.Magic_Ball);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Magic 8Ball", "Ze question has been asked");

                Random randomNumberGenerator;
                randomNumberGenerator = new Random();

                int number;
                number = randomNumberGenerator.nextInt(5);

                Log.d("Magic 8Ball", "The random answer is:" + number);
                magicBall.setImageResource(ballArray[number]);

            }
        });


    }
}
