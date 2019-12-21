package com.example.bibliotecaprueba3;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LibrosAct extends AppCompatActivity {

    private Spinner spn;
    private TextView tv;
    private EditText et1, et2;
    private String[] precio = new String[]{"5000", "12000", "25000","40500","28500","45500"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros);

        spn = (Spinner)findViewById(R.id.spn);
        tv = (TextView)findViewById(R.id.tv);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        Bundle local = getIntent().getExtras();

        String[] listaLibros = local.getStringArray("libros");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, listaLibros);

        spn.setAdapter(adapt);
    }

    public void Calcular(View v)
    {
        if(spn.getSelectedItem().equals("Farenheit"))
        {
            String valor = precio[0];
            int stock = Integer.parseInt(et1.getText().toString());
            int costo = Integer.parseInt(et2.getText().toString());
            int valorLibro = Integer.parseInt(valor);
            int resultado = stock * valorLibro + costo;

            tv.setText("Stock disponible: "+ stock + "\n" + "Precio final: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Revival"))
        {
            String valor = precio[1];

            int stock = Integer.parseInt(et1.getText().toString());
            int costo = Integer.parseInt(et2.getText().toString());
            int valorLibro = Integer.parseInt(valor);

            int resultado = stock * valorLibro + costo;

            tv.setText("Stock disponible: " + stock + "\n" + "Precio Final: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Tesla"))
        {

            String valor = precio[2];

            int stock = Integer.parseInt(et1.getText().toString());
            int costo = Integer.parseInt(et2.getText().toString());
            int valorLibro = Integer.parseInt(valor);

            int resultado = stock * valorLibro + costo;

            tv.setText("Stock disponible: " +stock+ "\n" + "Precio final es: "+ resultado);
        }
    }
}
