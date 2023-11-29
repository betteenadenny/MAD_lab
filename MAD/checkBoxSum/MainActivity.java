package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkbox1 = findViewById(R.id.checkbox1);
        final CheckBox checkbox2 = findViewById(R.id.checkbox2);
        final CheckBox checkbox3 = findViewById(R.id.checkbox3);
        final CheckBox checkbox4 = findViewById(R.id.checkbox4);
        final CheckBox checkbox5 = findViewById(R.id.checkbox5);
        final CheckBox checkbox6 = findViewById(R.id.checkbox6);
        final CheckBox checkbox7 = findViewById(R.id.checkbox7);
        final CheckBox checkbox8 = findViewById(R.id.checkbox8);
        final CheckBox checkbox9 = findViewById(R.id.checkbox9);

        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;

                // Check each checkbox and add its value to the sum if checked
                if (checkbox1.isChecked()) {
                    sum += 1;
                }
                if (checkbox2.isChecked()) {
                    sum += 2;
                }
                if (checkbox3.isChecked()) {
                    sum += 3;
                }
                if (checkbox4.isChecked()) {
                    sum += 4;
                }
                if (checkbox5.isChecked()) {
                    sum += 5;
                }
                if (checkbox6.isChecked()) {
                    sum += 6;
                }
                if (checkbox7.isChecked()) {
                    sum += 7;
                }
                if (checkbox8.isChecked()) {
                    sum += 8;
                }
                if (checkbox9.isChecked()) {
                    sum += 9;
                }
                // Display the sum in a toast message
                showToast("Sum: " + sum);
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
