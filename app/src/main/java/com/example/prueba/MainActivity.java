package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    Float numero1 = 0f;
    Float numero2 = 0f;
    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
    }

    public void ceroBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("0");
        } else {
            tvResultado.setText(tvResultado.getText() + "0");
        }

    }

    public void unoBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("1");
        } else {
            tvResultado.setText(tvResultado.getText() + "1");
        }

    }

    public void dosBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("2");
        } else {
            tvResultado.setText(tvResultado.getText() + "2");
        }

    }

    public void tresBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("3");
        } else {
            tvResultado.setText(tvResultado.getText() + "3");
        }

    }

    public void cuatroBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("4");
        } else {
            tvResultado.setText(tvResultado.getText() + "4");
        }

    }

    public void cincoBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("5");
        } else {
            tvResultado.setText(tvResultado.getText() + "5");
        }

    }

    public void seisBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("6");
        } else {
            tvResultado.setText(tvResultado.getText() + "6");
        }

    }

    public void sieteBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("7");
        } else {
            tvResultado.setText(tvResultado.getText() + "7");
        }

    }

    public void ochoBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("8");
        } else {
            tvResultado.setText(tvResultado.getText() + "8");
        }

    }

    public void nueveBtn(View view) {
        if (tvResultado.getText().toString().equals("0")) {
            tvResultado.setText("9");
        } else {
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void divisionBtn(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador = "/";
        tvResultado.setText("/");

    }

    public void Multiplicar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador = "*";
        tvResultado.setText("*");

    }

    public void restaBtn(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador = "-";
        tvResultado.setText("-");

    }

    public void sumaBtn(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operador = "+";
        tvResultado.setText("+");

    }


    public void clearBtn(View view) {
        tvResultado.setText("0");
        numero1 = 0f;
        numero2 = 0f;
        operador = "";
    }

    public void igualBtn(View view) {
        numero2 = Float.parseFloat(tvResultado.getText().toString());


        //Sumar
        if (operador.equals ("+")){
            if(numero2 == 0f){
                tvResultado.setText("0");
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 + numero2;
                tvResultado.setText(result + "");
            }
        }else if (operador.equals("-")){
            float result = numero1 - numero2;
            tvResultado.setText(result + "");
        }else if (operador.equals("*")){
            float result = numero1 * numero2;
            tvResultado.setText(result + "");
        }else if (operador.equals("/")){
            float result = numero1 / numero2;
            tvResultado.setText(result + "");
        }

        numero1 = 0f;
        numero2 = 0f;
        operador = "";


    }
}