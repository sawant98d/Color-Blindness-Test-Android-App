package com.example.colorblindnesstest;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TypesOfCB extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    SliderAdapter sliderAdapter;

    public int[] slide_images = {
            R.drawable.redgreen,
            R.drawable.blueyellow,
            R.drawable.complete
    };
    public String[] slide_headings = {
            "Red-green color blindness",
            "Blue Yellow color blindness",
            "Complete color blindness"
    };
    public String[] slide_desciption = {
            "The most common type of color blindness makes it hard to tell the difference between red and green.\n" +
                    "\n" +
                    "There are 4 types of red-green color blindness:\n" +
                    "\n" +
                    "Deuteranomaly is the most common type of red-green color blindness. It makes green look more red. This type is mild and doesn’t usually get in the way of normal activities.\n" +
                    "Protanomaly makes red look more green and less bright. This type is mild and usually doesn’t get in the way of normal activities.\n" +
                    "Protanopia and deuteranopia both make you unable to tell the difference between red and green at all.",

            "This less-common type of color blindness makes it hard to tell the difference between blue and green, and between yellow and red.\n" +
                    "\n" +
                    "There are 2 types of blue-yellow color blindness:\n" +
                    "\n" +
                    "Tritanomaly makes it hard to tell the difference between blue and green, and between yellow and red.\n" +
                    "Tritanopia makes you unable to tell the difference between blue and green, purple and red, and yellow and pink. It also makes colors look less bright.",

            "If you have complete color blindness, you can’t see colors at all. This is also called monochromacy, and it’s quite uncommon. Depending on the type, you may also have trouble seeing clearly and you may be more sensitive to light."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_c_b);


        mSlideViewPager = findViewById(R.id.myViewPager);
        mDotLayout = findViewById(R.id.myLinearLayout);
        sliderAdapter = new SliderAdapter(this, slide_images, slide_headings, slide_desciption);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator();
    }

    private TextView [] mDots;

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
