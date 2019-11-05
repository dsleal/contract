package com.contract.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.contract.R;

public class SubMenuCliente extends AppCompatActivity {

    ImageButton imgServices;
    ImageButton imgNewService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_cliente);

        imgServices = (ImageButton) findViewById(R.id.imgServices);

        imgServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UsersLista.class);
                //Intent intent = new Intent(getApplicationContext(), SolicitacaoLista.class);
                startActivity(intent);
            }
        });

        imgNewService= (ImageButton) findViewById(R.id.imgNewService);

        imgNewService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewService.class);
                startActivity(intent);
                //Toast.makeText(Main.this, "Prestador", Toast.LENGTH_LONG).show();
            }
        });

    }
}


