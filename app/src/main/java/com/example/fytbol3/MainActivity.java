package com.example.fytbol3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView3);

        Button startFallingButton = (Button) findViewById(R.id.button);

        final Animation fallingAnimation = AnimationUtils.loadAnimation(this,
                R.anim.falling);

        startFallingButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                mImageView.startAnimation(fallingAnimation);
            }
        });
    }
}