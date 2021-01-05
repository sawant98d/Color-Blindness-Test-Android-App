package com.example.colorblindnesstest;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WhatCB extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    SliderAdapter sliderAdapter;

    public int[] slide_images = {
            R.drawable.defination,
            R.drawable.symptoms,
            R.drawable.treatement
    };
    public String[] slide_headings = {
            "What is ColorBlindness ?",
            "What are the symptoms of it ?",
            "Specialist of Color Blindness"
    };
    public String[] slide_desciption = {
            "Color blindness occurs when you are unable to see colors in a normal way. It is also known as color deficiency.\n" +
                    " Color blindness often happens when someone cannot distinguish between certain colors",
            "The symptoms include:\n" +
                    "trouble seeing colors and the brightness of colors in the usual way;\n" +
                    "inability to tell the difference between shades of the same or similar colors. This happens most with red and green, or blue and yellow.",
            "Optometrist who diagnoses and treats vision changes\n" +
                    "Ophthalmologist who specialises in eye diesases."
    };





    private TextView [] mDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_c_b);

        mSlideViewPager = findViewById(R.id.myViewPager);
        mDotLayout = findViewById(R.id.myLinearLayout);
        sliderAdapter = new SliderAdapter(this, slide_images, slide_headings, slide_desciption);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator();
    }

    public void addDotsIndicator()
    {
        mDots = new TextView[3];
        for(int i = 0; i < mDots.length; i++)
        {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(22);
            mDots[i].setTextColor(getResources().getColor(R.color.cardview_shadow_start_color));
            mDotLayout.addView(mDots[i]);
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), HomeDashboard.class));
        finish();
    }
}
