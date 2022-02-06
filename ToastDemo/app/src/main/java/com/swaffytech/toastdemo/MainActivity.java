package com.swaffytech.toastdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View v){
        EditText name = (EditText) findViewById(R.id.nameField);
        Toast.makeText(this, "Hello " +name.getText().toString(), Toast.LENGTH_LONG).show();
    }

}