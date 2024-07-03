package com.example.bp3_intent_salman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTI =
                findViewById(R.id.ButtonTI);
        btnTI.setOnClickListener(this);

        Button btnSI =
                findViewById(R.id.ButtonSI);
        btnSI.setOnClickListener(this);

        Button btnMI =
                findViewById(R.id.ButtonMI);
        btnMI.setOnClickListener(this);

        Button btnDKV =
                findViewById(R.id.ButtonDKV);
        btnDKV.setOnClickListener(this);

        Button btnTS =
                findViewById(R.id.ButtonTS);
        btnTS.setOnClickListener(this);
    }

    @Override
    public void onClick(View V) {
        switch (V.getId()) {
            case R.id.ButtonTI:
                Intent moveIntent = new
                        Intent(MainActivity.this, TI.class);
                startActivity(moveIntent);
                break;
        }
        switch (V.getId()) {
            case R.id.ButtonSI:
                Intent dialPhoneIntent = new
                        Intent(MainActivity.this, SI.class);
                startActivity(dialPhoneIntent);
                break;
        }
        switch (V.getId()) {
            case R.id.ButtonMI:
                Intent dialPhoneIntent = new
                        Intent(MainActivity.this, MI.class);
                startActivity(dialPhoneIntent);
                break;
        }
        switch (V.getId()) {
            case R.id.ButtonDKV:
                Intent dialPhoneIntent = new
                        Intent(MainActivity.this, DKV.class);
                startActivity(dialPhoneIntent);
                break;
        }
        switch (V.getId()) {
            case R.id.ButtonTS:
                Intent dialPhoneIntent = new
                        Intent(MainActivity.this, TS.class);
                startActivity(dialPhoneIntent);
                break;
        }
    }
}