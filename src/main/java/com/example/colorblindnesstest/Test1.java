package com.example.colorblindnesstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Test1 extends AppCompatActivity {


    TestData td;
    public void btn1Click(View view)
    {
        TestData.index++;
        ImageView imageView = findViewById(R.id.myImageView);
        imageView.setBackgroundResource(td.imageViews[TestData.index]);
        Button btn = findViewById(R.id.btn1);
        btn.setText(td.button1Text[TestData.index]);
        btn = findViewById(R.id.btn2);
        btn.setText(td.button2Text[TestData.index]);
        btn = findViewById(R.id.btn3);
        btn.setText(td.button3Text[TestData.index]);
        //finding ans
    }
    public void btn2Click(View view)
    {
        TestData.index++;
        ImageView imageView = findViewById(R.id.myImageView);
        imageView.setBackgroundResource(td.imageViews[TestData.index]);
        Button btn = findViewById(R.id.btn1);
        btn.setText(td.button1Text[TestData.index]);
        btn = findViewById(R.id.btn2);
        btn.setText(td.button2Text[TestData.index]);
        btn = findViewById(R.id.btn3);
        btn.setText(td.button3Text[TestData.index]);
        //finding ans
    }
    public void btn3Click(View view)
    {
        TestData.index++;
        ImageView imageView = findViewById(R.id.myImageView);
        imageView.setBackgroundResource(td.imageViews[TestData.index]);
        Button btn = findViewById(R.id.btn1);
        btn.setText(td.button1Text[TestData.index]);
        btn = findViewById(R.id.btn2);
        btn.setText(td.button2Text[TestData.index]);
        btn = findViewById(R.id.btn3);
        btn.setText(td.button3Text[TestData.index]);
        //finding sna
    }
    public void btn4Click(View view)
    {
        TestData.index++;
        ImageView imageView = findViewById(R.id.myImageView);
        imageView.setBackgroundResource(td.imageViews[TestData.index]);
        Button btn = findViewById(R.id.btn1);
        btn.setText(td.button1Text[TestData.index]);
        btn = findViewById(R.id.btn2);
        btn.setText(td.button2Text[TestData.index]);
        btn = findViewById(R.id.btn3);
        btn.setText(td.button3Text[TestData.index]);
        //finding ans
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TestData.index  = 0;

        td = new TestData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        ImageView imageView = findViewById(R.id.myImageView);
        imageView.setBackgroundResource(td.imageViews[TestData.index]);
    }
}
