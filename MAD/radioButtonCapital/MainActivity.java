package com.example.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button button = findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1) {
                    RadioButton radioButton = findViewById(id);
                    String state = radioButton.getText().toString();
                    String capital = getCapital(state);
                    showToast("The capital of " + state + " is " + capital);
                } else {
                    showToast("Please select a state");
                }
            }
        });
    }

    private String getCapital(String state) {
        switch (state) {
            case "Kerala":
                return "Trivandrum";
            case "Karnataka":
                return "Bangalore";
            case "Tamil Nadu":
                return "Chennai";
            default:
                return "Unknown";
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
