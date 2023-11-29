package com.example.myapplication;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);

                if (radioButton != null) {
                    String state = radioButton.getText().toString();
                    String capital = getCapital(state);

                    // Display Toast message
                    Toast.makeText(MainActivity.this, "The capital of " + state + " is " + capital, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private String getCapital(String state) {
        // Replace this with a method to get the capital based on the selected state
        // You can use a switch statement or a map to map states to their capitals
        switch (state) {
            case "Kerala":
                return "Trivandum";
            case "Karnataka":
                return "Bangalore";
            // Add more cases for other states as needed
            default:
                return "Unknown";
        }
    }
}
