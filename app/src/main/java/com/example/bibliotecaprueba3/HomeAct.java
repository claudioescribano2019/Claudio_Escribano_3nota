package com.example.bibliotecaprueba3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAct extends AppCompatActivity {

    private ViewFlipper vf;
    private int [] images = {R.drawable.a , R.drawable.b , R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        vf = (ViewFlipper)findViewById(R.id.slider);

        for(int i=0; i<images.length; i++)
        {
            Instrucciones(images[i]);
        }
    }
    public void Instrucciones (int i){
        ImageView view = new ImageView( this);
        view.setBackgroundResource(i);

        vf.addView(view);
        vf.setFlipInterval(2800);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void Informacion(View v) {
        Intent i = new Intent(this, InfoAct.class);
        startActivity(i);
    }

    String[] Libros = {"Farenheith", "Revival", "Tesla", "El Alquimista"};

    public void Libros(View view)
    {
        Intent i = new Intent(this, LibrosAct.class);
        i.putExtra("libros", Libros);
        startActivity(i);
    }

    public void Base (View view)
    {
        Intent i = new Intent(this, BaseAct.class);
        startActivity(i);
    }

    public void Seguridad (View view)
    {
        Intent i = new Intent(this, SecAct.class);
        startActivity(i);
    }
}
