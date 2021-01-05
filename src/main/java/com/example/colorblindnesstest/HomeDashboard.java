package com.example.colorblindnesstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;

public class HomeDashboard extends AppCompatActivity {
    GridLayout mygrid;
    Animation frombottom;

    public void openWhatCB(View view)
    {
        startActivity(new Intent(getApplicationContext(), WhatCB.class));
        finish();
    }

    public void openTypesOfCB(View view)
    {
        startActivity(new Intent(getApplicationContext(), TypesOfCB.class));
        finish();
    }
    public void openCureCB(View view)
    {
        startActivity(new Intent(getApplicationContext(), CureCB.class));
        finish();
    }
    public void openTest1(View view)
    {
        startActivity(new Intent(getApplicationContext(), Test1.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        mygrid = findViewById(R.id.myGrid);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        mygrid.startAnimation(frombottom);
    }
}
