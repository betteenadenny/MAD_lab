package com.example.checkboxsum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        CheckBox checkbox2 = findViewById(R.id.checkbox2);
        CheckBox checkbox3 = findViewById(R.id.checkbox3);
        CheckBox checkbox4 = findViewById(R.id.checkbox4);
        CheckBox checkbox5 = findViewById(R.id.checkbox5);
        CheckBox checkbox6 = findViewById(R.id.checkbox6);
        CheckBox checkbox7 = findViewById(R.id.checkbox7);
        CheckBox checkbox8 = findViewById(R.id.checkbox8);
        CheckBox checkbox9 = findViewById(R.id.checkbox9);

        Button button = findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int sum = 0;
                if(checkbox1.isChecked()){
                    sum +=1;
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
                showToast("Sum: "+sum);
            }
        });
    }

    public void showToast(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
