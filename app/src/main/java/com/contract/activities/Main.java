package com.contract.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.contract.R;

public class Main extends AppCompatActivity {

    ImageButton imgClient;
    ImageButton imgProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClient = (ImageButton) findViewById(R.id.imgClient);

        imgClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main.this, "Cliente", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), SubMenuCliente.class);
                startActivity(intent);
            }
        });

        imgProvider= (ImageButton) findViewById(R.id.imgProvider);

        imgProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main.this, "Prestador", Toast.LENGTH_LONG).show();
            }
        });


    }
    public void acessoRestrito(View view) {
        startActivity(new Intent(this,SubMenuRestrito.class));
    }


}
