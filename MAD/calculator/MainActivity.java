package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    TextView tv;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,equal,clear;
    String op,val=null;
    Double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        tv = findViewById(R.id.tv);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                tv.setText(val+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                a = Double.parseDouble(val);
                val = null;
                tv.setText(null);
                op = "+";
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                a = Double.parseDouble(val);
                val = null;
                tv.setText(null);
                op = "*";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                a = Double.parseDouble(val);
                val = null;
                tv.setText(null);
                op = "/";
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                a = Double.parseDouble(val);
                val = null;
                tv.setText(null);
                op = "-";
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = null;
                tv.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val = tv.getText().toString();
                b = Double.parseDouble(val);
                switch(op){
                    case "+":
                        c = a+b;
                        break;
                    case "-":
                        c = a-b;
                        break;
                    case "*":
                        c = a*b;
                        break;
                    case "/":
                        c = a/b;
                        break;
                    default:
                        break;
                }
                tv.setText(String.valueOf(c));
            }
        });

    }

}
