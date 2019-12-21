package com.example.bibliotecaprueba3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecAct extends AppCompatActivity {

    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        btn = (Button) findViewById(R.id.btn);
        tv = (TextView)findViewById(R.id.tv);
    }

    public void Incidencia(View v)
    {
        tv.setText("Cryptographic Issues");
    }



    public void SegundaIncidencia (View v)
    {
        tv.setText("Process Control");
    }


}
