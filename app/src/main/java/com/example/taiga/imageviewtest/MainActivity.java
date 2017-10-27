package com.example.taiga.imageviewtest;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int images[]={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.pan,};

    int page;

    ImageView topLeft;
    ImageView topRight;
    ImageView botLeft;
    ImageView botRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topLeft=(ImageView)findViewById(R.id.up_left);
        topRight=(ImageView)findViewById(R.id.up_right);
        botLeft=(ImageView)findViewById(R.id.bot_left);
        botRight=(ImageView)findViewById(R.id.bot_right);

        page=0;
    }

    public void back(View v){
        if(page!=0){
            page--;
            topLeft.setImageResource(images[(page*4)]);
            topRight.setImageResource(images[(page*4)+1]);
            botLeft.setImageResource(images[(page*4)+2]);
            botRight.setImageResource(images[(page*4)+3]);
        }
    }

    public void next(View v){
        page++;
        topLeft.setImageResource(images[(page*4)]);
        topRight.setImageResource(images[(page*4)+1]);
        botLeft.setImageResource(images[(page*4)+2]);
        botRight.setImageResource(images[(page*4)+3]);
    }
}
