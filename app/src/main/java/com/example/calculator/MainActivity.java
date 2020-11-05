package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator cal = new Calculator();

        Num = (EditText) findViewById(R.id.NumberField);
    }

    public void PutNum(View view) {
        Num.setText("1");
        System.out.println("Button 1 Clicked !!!!!!!");
    }
}
