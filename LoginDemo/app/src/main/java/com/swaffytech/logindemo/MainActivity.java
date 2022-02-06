package com.swaffytech.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){
        EditText username = (EditText) findViewById(R.id.userField);
        EditText password = (EditText) findViewById(R.id.passField);
        Log.i("Login", "Login Attempt Using Credentials:");
        Log.i("Login","Username: " + username.getText().toString());
        Log.i("Login","Password: " + password.getText().toString());
    }

}