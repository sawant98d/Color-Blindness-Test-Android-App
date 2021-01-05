package com.example.colorblindnesstest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {


    public Context context;
    public int[] slide_images ;
    public String[] slide_headings;
    public String[] slide_desciption;

    LayoutInflater layoutInflater;

    public SliderAdapter(Context context, int [] slide_images, String []slide_heading, String []slide_desciption)
    {
        this.context = context;
        this.slide_images = slide_images;
        this.slide_headings = slide_heading;
        this.slide_desciption = slide_desciption;
    }


    @Override
    public int getCount() {
        return slide_headings.length;
    }



    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slidelayout, container, false);

        ImageView slideImageView = view.findViewById(R.id.slideImage);
        TextView slideHeading = view.findViewById(R.id.slideHeading);
        TextView slideDescription = view.findViewById(R.id.slideDesc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_desciption[position]);
        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
