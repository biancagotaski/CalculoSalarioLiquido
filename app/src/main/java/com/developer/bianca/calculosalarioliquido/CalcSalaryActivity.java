package com.developer.bianca.calculosalarioliquido;

import android.content.Intent;
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

    double salarioLiquido;
    double salarioBruto;
    int numDependentes;
    double pensaoAlimenticia;
//    double planoSaude;
//    double outrosDescontos;

    private double VALOR_FIXO  = 189.59;

    double rendaFixa1 = 1659.38;
    double rendaFixa2 = 1659.39;
    double rendaFixa3 = 2765.66;
    double rendaFixa4 = 2765.67;
    double rendaFixa5 = 5531.31;
    double rendaFixa6 = 5531.31;

    double desconto;

    String exibirValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_salary);

        salarioBrutoField = findViewById(R.id.salario_bruto);
        numDependentesField = findViewById(R.id.num_dependentes);
        pensaoAlimenticiaField = findViewById(R.id.pensao_alimenticia);
        planoSaudeField = findViewById(R.id.plano_saude);
        outrosDescontosField = findViewById(R.id.outros_descontos);

        if(salarioBrutoField.getText().toString().equals("")){
            salarioBrutoField.setError("Campo obrigatório. Use o ponto ao invés da vírgula.");
        }
    }

    public void Calcular(View view) {

        double valorDoDesconto = Double.parseDouble(salarioBrutoField.getText().toString());
        double valorArredondado = Math.round(salarioLiquido);
        exibirValor = Double.toString(valorArredondado);

        salarioLiquido = (salarioBruto - inss(valorDoDesconto) - irpf(valorDoDesconto) - pensaoAlimenticia - numDependentes) * VALOR_FIXO;

        Intent intent = new Intent(CalcSalaryActivity.this, ResultActivity.class);
        intent.putExtra("result", exibirValor);
        startActivity(intent);
    }

    public double inss(double valor){
        if(valor <= rendaFixa1){
            return desconto = 8/100;
        }
        if(valor >= rendaFixa2 || valor <= rendaFixa3){
            return desconto = 9/100;
        }
        if(valor >= rendaFixa4 || valor <= rendaFixa5){
            return desconto = 11/100;
        }
        if(valor >= rendaFixa6){
            return desconto = 608.44;
        }
        return desconto;
    }

    public double irpf(double valor2){
        double aliquota = 0;

        if(valor2 <= 1903.98){
            return aliquota = 0;
        }
        if(valor2 >= 1903.99 || valor2 <= 2862.65){
            return aliquota = (7.5)/100;
        }
        if(valor2 >= 2826.66 || valor2 <= 3751.05){
            return aliquota = 15/100;
        }
        if(valor2 >= 3751.06 || valor2 <= 4664.68){
            return aliquota = (22.5)/100;
        }
        if(valor2 >= 4664.68){
            return aliquota = (27.5)/100;
        }
        return aliquota;
    }
}
