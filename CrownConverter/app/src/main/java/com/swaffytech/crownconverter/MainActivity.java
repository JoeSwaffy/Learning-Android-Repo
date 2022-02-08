package com.swaffytech.crownconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View v){
        EditText userInput = (EditText) findViewById(R.id.inputUSD);
        Double USDAmount = Double.parseDouble(userInput.getText().toString());
        Double KRAmount = USDAmount * 7.8;
        String KROutput = String.format("%.2f", KRAmount);
        Toast.makeText(this, "That would be " +KROutput+" Swedish Crowns (Kronor KR)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}