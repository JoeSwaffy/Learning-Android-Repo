package com.swaffytech.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //globals
    public boolean mortyShowing;
    public ImageView rick;
    public ImageView morty;

    public void swap(View v) {
        if (mortyShowing) {
            morty.animate().alpha(0).setDuration(2000);
            rick.animate().alpha(1).setDuration(2000);
            mortyShowing = false;
        }else{
            rick.animate().alpha(0).setDuration(2000);
            morty.animate().alpha(1).setDuration(2000);
            mortyShowing = true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        morty = (ImageView) findViewById(R.id.morty);
        rick = (ImageView) findViewById(R.id.rick);
        mortyShowing = true;
    }
}