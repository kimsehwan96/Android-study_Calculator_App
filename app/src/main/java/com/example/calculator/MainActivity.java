package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Calculator cal = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void putNum(View view) {
        TextView textview = (TextView) findViewById(R.id.textView);
        if (view.getId() == R.id.btn1) {
            this.cal.putStringBuffer("1");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn2){
            this.cal.putStringBuffer("2");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn3){
            this.cal.putStringBuffer("3");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn4){
            this.cal.putStringBuffer("4");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn5){
            this.cal.putStringBuffer("5");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn6){
            this.cal.putStringBuffer("6");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn7){
            this.cal.putStringBuffer("7");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn8){
            this.cal.putStringBuffer("8");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn9){
            this.cal.putStringBuffer("9");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btn0){
            this.cal.putStringBuffer("0");
            textview.setText(this.cal.getStringBuffer());
        }
        else if (view.getId() == R.id.btndot){
            this.cal.putStringBuffer(".");
            textview.setText(this.cal.getStringBuffer());
        }

        else {
            textview.setText("No input");
        }
    }

    public void command(View view) {
        TextView textview_second = (TextView) findViewById(R.id.textView);
        if (view.getId() == R.id.btnAC) {
            this.cal.resetBuffer();
            textview_second.setText(this.cal.getStringBuffer());
        }

        else {
            if (this.cal.getStringBuffer() != ""){

                if (view.getId() == R.id.btnplus) {
                    this.cal.setCommand(1);
                    this.cal.putNumberBuffer();
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btnminus) {
                    this.cal.setCommand(2);
                    this.cal.putNumberBuffer();
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btnmul){
                    this.cal.setCommand(3);
                    this.cal.putNumberBuffer();
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btndiv) {
                    this.cal.setCommand(4);
                    this.cal.putNumberBuffer();
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btnequal) {
                    this.cal.calculate();
                    textview_second.setText(this.cal.getCalculateResult());

                }

            }
            else {
                if (view.getId() == R.id.btnplus) {
                    this.cal.setCommand(1);
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btnminus) {
                    this.cal.setCommand(2);
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btnmul){
                    this.cal.setCommand(3);
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btndiv) {
                    this.cal.setCommand(4);
                    textview_second.setText(this.cal.getStringBuffer());
                }
                else if (view.getId() == R.id.btnequal) {
                    this.cal.calculate();
                    textview_second.setText(this.cal.getCalculateResult());

                }
            }
        }


    }
}
