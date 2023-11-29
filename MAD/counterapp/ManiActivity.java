package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }
    public void increment(View view) {
        count++;
        display.setText(Integer.toString(count));
    }
    public void decrement(View view) {
        count--;
        display.setText(Integer.toString(count));
    }
    public void reset(View view) {
        count = 0;
        display.setText(Integer.toString(count));
    }
}


