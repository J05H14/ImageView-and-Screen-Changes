package com.example.jlazaro.imageview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by J.Lazaro on 11/5/2017.
 */

public class SecondScreen extends AppCompatActivity {

    private static final String TAG = "SecondScreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        Log.d(TAG, "onCreate: sec screen");

        ImageView secondImage = (ImageView) findViewById(R.id.secondImage);
        int imageResource = getResources().getIdentifier("@drawable/puzzdroid2", null, this.getPackageName());
        secondImage.setImageResource(imageResource);

        Button btnEvolve = (Button) findViewById(R.id.btnLast);

        btnEvolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked evolve");

                Intent intent = new Intent(SecondScreen.this, ThirdScreen.class);
                startActivity(intent);
            }
        });
    }
}
