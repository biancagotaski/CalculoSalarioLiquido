package com.developer.bianca.calculosalarioliquido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultView = findViewById(R.id.view_result);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            String getResult =(String) bundle.get("result");
            resultView.setText(getResult);
        }
    }
}
