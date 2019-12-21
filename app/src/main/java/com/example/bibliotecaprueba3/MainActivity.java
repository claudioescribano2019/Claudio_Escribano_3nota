package com.example.bibliotecaprueba3;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private ProgressBar pb;
    private Button btn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        pb = (ProgressBar) findViewById(R.id.pb);
        btn = (Button) findViewById(R.id.btn);

        pb.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute(et1.getText().toString());
            }
        });
    }

    class Task extends AsyncTask<String, Void, String>
    {


        @Override
        protected void onPreExecute() {
            pb.setVisibility(View.VISIBLE);
            btn.setEnabled(false);
        }

        @Override
        protected String doInBackground(String... strings) {
            try
            {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(String s) {

            btn.setEnabled(true);
            pb.setVisibility(View.INVISIBLE);
            Toast.makeText(getBaseContext(), "Acceso satisfactorio",
                    Toast.LENGTH_LONG).show();


            String user = et1.getText().toString();
            String pass = et2.getText().toString();

            Intent i = new Intent(getBaseContext(), HomeAct.class);
            i.putExtra("Nombre", user);
            i.putExtra("Contraseña", pass);
            startActivity(i);

        }
    }
    public void Maps(View v) {
        Intent i = new Intent(this, MapsAct.class);
        startActivity(i);
    }
    public void GitHub(View v) {
        Intent i = new Intent(this, GitHubAct.class);
        startActivity(i);
    }
}

