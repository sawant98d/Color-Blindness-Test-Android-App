package com.example.colorblindnesstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.Animation;




public class MainActivity extends AppCompatActivity {

    ImageView myImage;
    Button myButton;
    Animation btnAnimation, imgAnimation;

    public void btnGetStartedClick(View view)
    {
        startActivity(new Intent(getApplicationContext(), HomeDashboard.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImage = findViewById(R.id.mainImage);
        myButton = findViewById(R.id.btnGetStarted);

        imgAnimation = AnimationUtils.loadAnimation(this, R.anim.forimg);
        btnAnimation = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        myImage.startAnimation(imgAnimation);
        myImage.startAnimation(imgAnimation);
    }
}
