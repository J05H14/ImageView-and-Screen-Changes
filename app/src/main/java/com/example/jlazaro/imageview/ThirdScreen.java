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

public class ThirdScreen extends AppCompatActivity {

    private static final String TAG = "ThirdScreen";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_screen);

        Log.d(TAG, "onCreate: started");

        ImageView secondImage = (ImageView) findViewById(R.id.thridImage);
        int imageResource = getResources().getIdentifier("@drawable/puzzdroid", null, this.getPackageName());
        secondImage.setImageResource(imageResource);

        Button btnEvolve = (Button) findViewById(R.id.btnFirst);

        btnEvolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked evolve");

                Intent intent = new Intent(ThirdScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
