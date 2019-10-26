package com.contract.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.contract.R;

public class Main extends AppCompatActivity {

    ImageButton imgCliente;
    ImageButton imgPrestador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCliente = (ImageButton) findViewById(R.id.imgCliente);

        imgCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main.this, "Cliente", Toast.LENGTH_LONG).show();
                //startActivity(new Intent(this, UsersLista));
                Intent intent = new Intent(getApplicationContext(), UsersLista.class);
                startActivity(intent);
            }
        });

        imgPrestador= (ImageButton) findViewById(R.id.imgPrestador);

        imgPrestador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main.this, "Prestador", Toast.LENGTH_LONG).show();
            }
        });

    }
}
