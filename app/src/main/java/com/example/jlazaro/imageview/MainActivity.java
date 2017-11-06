package com.example.jlazaro.imageview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started");

        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);

        int imageResource = getResources().getIdentifier("@drawable/puzzdroid1", null, this.getPackageName());
        firstImage.setImageResource(imageResource);

        Button btnEvolve = (Button) findViewById(R.id.btnNext);

        btnEvolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked evolve");
                
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);
            }
        });
    }
}
