package com.example.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1, num2, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //atribuindo ações aos botões
        Button btnsoma          = findViewById(R.id.btnsoma);
        Button btnsubtrai       = findViewById(R.id.btnsubtrai);
        Button btnmultiplica    = findViewById(R.id.btnmultplica);
        Button btndivide        = findViewById(R.id.btndivide);

        //atribuindo ações aos views

        TextView tv_resultado   =   findViewById(R.id.tv_resultado);
        EditText et_valor1      =   findViewById(R.id.et_valor1);
        EditText et_valor2      =   findViewById(R.id.et_valor2);

        //atribuindo ações aos eventos de botões e variáveis

       btnsoma.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res  = num1 + num2;
                tv_resultado.setText(String.valueOf(res));

            }
        });
        btnsubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res  = num1 - num2;
                tv_resultado.setText(String.valueOf(res));

            }
        });

        btnmultiplica.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 * num2;
                tv_resultado.setText(String.valueOf(res));

            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                res = num1 / num2;
                tv_resultado.setText(String.valueOf(res));


            }
        });
    }
}