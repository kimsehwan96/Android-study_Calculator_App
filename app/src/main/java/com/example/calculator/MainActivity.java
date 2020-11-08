package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textview = (TextView) findViewById(R.id.textView);
    Button btn1 = (Button) findViewById(R.id.btn1);
    Button btn2 = (Button) findViewById(R.id.btn2);
    Button btn3 = (Button) findViewById(R.id.btn3);
    Button btn4 = (Button) findViewById(R.id.btn4);
    Button btn5 = (Button) findViewById(R.id.btn5);
    Button btn6 = (Button) findViewById(R.id.btn6);
    Button btn7 = (Button) findViewById(R.id.btn7);
    Button btn8 = (Button) findViewById(R.id.btn8);
    Button btn9 = (Button) findViewById(R.id.btn9);
    Button btn0 = (Button) findViewById(R.id.btn0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator cal = new Calculator();

    }

    public void putNum(View view) {
        /*
        if (view.getId() == R.id.btn1){
            textview.setText("1");
        }
        else if (view.getId() == R.id.btn2){
            textview.setText("2");
        }
        else {
            textview.setText("No input");
        }*/
    }
}
