package com.example.simpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etFirst, etSecond;
    private Button btnSum, btnSub;
    int first, second, result, principal, time, rate;
    private EditText etp, ett, etr;
    private Button btnSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        etp = findViewById(R.id.etp);
        ett = findViewById(R.id.ett);
        etr = findViewById(R.id.etr);

        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnSI = findViewById(R.id.btnSI);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());
                result = first + second;
                Toast.makeText(MainActivity.this, "The Sum is " + result, Toast.LENGTH_SHORT).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etFirst.getText().toString());
                second = Integer.parseInt(etSecond.getText().toString());
                result = first - second;
                Toast.makeText(MainActivity.this, "The Difference is " + result, Toast.LENGTH_SHORT).show();
            }
        });

        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal = Integer.parseInt(etp.getText().toString());
                time = Integer.parseInt(ett.getText().toString());
                rate = Integer.parseInt(etr.getText().toString());
                result = (principal * time * rate) / 100;
                Toast.makeText(MainActivity.this, "The Simple Interest is " + result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
