package com.example.hp.calculadora29;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //tendrias inicializar todas las variables
    ImageButton cero;
    ImageButton num1;
    ImageButton num2;
    ImageButton num3;
    ImageButton num4;
    ImageButton num5;
    ImageButton num6;
    ImageButton num7;
    ImageButton num8;
    ImageButton num9;
    ImageButton BorrarT;
    ImageButton BOR;
    ImageButton suma;
    ImageButton resta;
    ImageButton multiplicar;
    ImageButton dividir;
    TextView michi;
    TextView resultado;

    String juntarNumeros = "";

    int op = 0;
    int aux; //1->suma, 2->resta, 3->mul, 4->div


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.cero);
        num1 = findViewById(R. id.num1);
        num2 = findViewById(R. id.num2);
        num3 = findViewById(R. id.num3);
        num4 = findViewById(R. id.num4);
        num5 = findViewById(R. id.num5);
        num6 = findViewById(R. id.num6);
        num7 = findViewById(R. id.num7);
        num8 = findViewById(R. id.num8);
        num9 = findViewById(R. id.num9);
        BorrarT = findViewById(R. id.BorrarT);
        BOR = findViewById(R. id.BOR);
        suma = findViewById(R. id.suma);
        resta = findViewById(R. id.resta);
        multiplicar = findViewById(R. id.multiplicar);
        dividir = findViewById(R. id.dividir);
        michi = findViewById(R. id.michi);
        resultado = findViewById(R. id.resultado);

    }

    public void juntandoNumeros(View v)
    {
        switch (v.getId())
        {
            case R.id.cero:
                juntarNumeros = juntarNumeros + 0;
                break;
            case R.id.num1:
                juntarNumeros = juntarNumeros + 1;
                break;
            case R.id.num2:
                juntarNumeros = juntarNumeros + 2;
                break;
            case R.id.num3:
                juntarNumeros = juntarNumeros + 3;
                break;
            case R.id.num4:
                juntarNumeros = juntarNumeros + 4;
                break;
            case R.id.num5:
                juntarNumeros = juntarNumeros + 5;
                break;
            case R.id.num6:
                juntarNumeros = juntarNumeros + 6;
                break;
            case R.id.num7:
                juntarNumeros = juntarNumeros + 7;
                break;
            case R.id.num8:
                juntarNumeros = juntarNumeros + 8;
                 break;
            case R.id.num9:
                juntarNumeros = juntarNumeros + 9;
                break;
            case R.id.suma:
                op = op + Integer.parseInt(juntarNumeros);
                aux = 1;
                juntarNumeros = "";
                break;
            case R.id.resta:
                op = op - Integer.parseInt(juntarNumeros);
                juntarNumeros = "";
                aux = 2;
                break;
            case R.id.multiplicar:
                op = op * Integer.parseInt(juntarNumeros);
                juntarNumeros = "";
                aux = 3;
                break;
            case R.id.dividir:
                op = op / Integer.parseInt(juntarNumeros);
                juntarNumeros = "";
                aux = 4;
                break;
            case R.id.BorrarT:
                op = 0;
                juntarNumeros = "";
                resultado.setText("");
                break;

        }
        michi.setText(juntarNumeros);
    }

    public void mostrarResultado(View v) //ok
    {
       /* switch (aux)
        {
            case 1:
                op = op + Integer.parseInt(juntarNumeros);
                break;
            case 2:
                op = op - Integer.parseInt(juntarNumeros);
                break;
            case 3:
                op = op * Integer.parseInt(juntarNumeros);
                break;
            case 4:
                op = op / Integer.parseInt(juntarNumeros);
                break;
        }*/

        resultado.setText(""+op);
    }
}
