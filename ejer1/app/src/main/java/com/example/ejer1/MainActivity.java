package com.example.ejer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        miBoton = (Button)findViewById(R.id.btnLanzar);
        miBoton.setOnClickListener(new View.OnClickListener()
        @Override
        public void OnClick(View v){
        Toast.makeText(getApplicationContext(), "Se ha cargado", Toast.LENGTH_LONG.show();
        }
      });
      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);}
      fab.setOnClickListener ((view) (
              Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).abow();
      });

