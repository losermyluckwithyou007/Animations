package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view){

        Log.i("info", "imageView Tapped");

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        if(bartIsShowing){

            bartIsShowing = false;

            imageView2.animate().alpha(0).setDuration(2000);

            imageView3.animate().alpha(1).setDuration(2000);
        } else {

            bartIsShowing = true;

            imageView2.animate().alpha(1).setDuration(1000);

            imageView3.animate().alpha(0).setDuration(1000);


        }




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}