package com.swaffytech.buttontutorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //button click function first android working button w000t!
    public void clicked(View v){
        Log.i("Info", "The button has been clicked!");
    }

}