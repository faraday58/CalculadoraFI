package com.example.calculadorafi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtv_disp_opera;
    TextView txtv_disp_resultado;
    Button btnClear;
    String texto_opera;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtv_disp_opera = findViewById(R.id.txtv_disp_opera);
        txtv_disp_resultado = findViewById(R.id.txtv_disp_resultado);
        btnClear = findViewById(R.id.btn_clear);
        txtv_disp_opera.setText("");
        txtv_disp_resultado.setText("");

        btnClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                try
                {
                    texto_opera="";
                    txtv_disp_opera.setText(texto_opera);
                }catch ( IndexOutOfBoundsException error) {
                    Log.d("Clear", "No se puede eliminar más ");
                }

                return false;
            }
        });
    }
    public void onClick(View v)
    {
        int seleccion= v.getId();
        texto_opera= txtv_disp_opera.getText().toString();
        n=texto_opera.length();

        switch (seleccion){
            case R.id.btn_uno:
                texto_opera+= "1";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_dos:
                texto_opera+="2";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_tres:
                texto_opera+= "3";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_cuatro:
                texto_opera+="4";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_cinco:
                texto_opera+= "5";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_seis:
                texto_opera+="6";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_siete:
                texto_opera+= "7";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_ocho:
                texto_opera+="8";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_nueve:
                texto_opera+= "9";
                txtv_disp_opera.setText(texto_opera);
                break;
            case R.id.btn_clear:
                try
                {
                    texto_opera=texto_opera.substring(0,n-1);
                    txtv_disp_opera.setText(texto_opera);
                }catch ( IndexOutOfBoundsException error) {
                    Log.d("Clear", "No se puede eliminar más ");
                }
                break;
        }



    }

}

