package com.example.bibliotecaprueba3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GitHubAct extends AppCompatActivity {
    private Spinner sp;
    private TextView tv;
    private String[] libros = new String[]{"Farenheith", "Revival", "El Alquimista","El Poder","Despertar"};
    private String[] precio = new String[]{"7000", "22000", "45000","88000","156000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub);

        sp = (Spinner)findViewById(R.id.spn);
        tv = (TextView)findViewById(R.id.tv);

        Bundle local = getIntent().getExtras();

        String[] libros= local.getStringArray("libros");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, libros);

        sp.setAdapter(adapt);

        if(sp.getSelectedItem().equals("Farenheith"))
        {
            String valor = precio[0];
            tv.setText("El valor del libro Farenheith es: "+valor);
        }
        if(sp.getSelectedItem().equals("Revival"))
        {
            String valor = precio[1];
            tv.setText("El valor del libro Revival es: "+valor);
        }
        if(sp.getSelectedItem().equals("El Alquimista"))
        {
            String valor = precio[2];
            tv.setText("El valor del libro El Alquimista es: "+valor);
        }
        if(sp.getSelectedItem().equals("El Poder"))
        {
            String valor = precio[3];
            tv.setText("El valor del libro El Poder es: "+valor);
        }
        if(sp.getSelectedItem().equals("Despertar"))
        {
            String valor = precio[4];
            tv.setText("El valor del libro Despertar es: "+valor);
        }
    }
}
