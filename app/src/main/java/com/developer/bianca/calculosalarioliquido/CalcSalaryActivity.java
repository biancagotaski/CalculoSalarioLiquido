package com.developer.bianca.calculosalarioliquido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalcSalaryActivity extends AppCompatActivity {

    EditText salarioBrutoField;
    EditText numDependentesField;
    EditText pensaoAlimenticiaField;
    EditText planoSaudeField;
    EditText outrosDescontosField;

    double salarioBruto;
    int numDependentes;
    double pensaoAlimenticia;
    double planoSaude;
    double outrosDescontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_salary);

        salarioBrutoField = findViewById(R.id.salario_bruto);
        numDependentesField = findViewById(R.id.num_dependentes);
        pensaoAlimenticiaField = findViewById(R.id.pensao_alimenticia);
        planoSaudeField = findViewById(R.id.plano_saude);
        outrosDescontosField = findViewById(R.id.outros_descontos);
    }

    public void Calcular(View view) {
        
    }
}
