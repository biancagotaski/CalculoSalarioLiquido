package com.developer.bianca.calculosalarioliquido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    FileOutputStream fileOutputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startApplication(View view) {
        startActivity(new Intent(this, CalcSalaryActivity.class));
    }
}
