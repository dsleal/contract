package com.contract.activities;



import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import com.contract.R;
import com.contract.adapter.AdapterCliente;
import com.contract.boostrap.APIClient;
import com.contract.model.Users;
import com.contract.resource.UserResource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class UsersLista extends AppCompatActivity {
    public TextView txtNome;
    public TextView txtEmail;
    public List<Users> lista = new ArrayList<>();
    public ListView minhaLista;
    public List<Users> listUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_lista);

        /*Pega a referencia do ENDPOINT e do converter(gson)
         * */
        Retrofit retrofit = APIClient.getClient();

        //Faz o 'bind' da instância do retrofit com interface
        //que contém as operações (GET,POST,PUT,DELETE)
        UserResource userResource = retrofit.create(UserResource.class);

        //Faz a chamada do serviço
        Call<List<Users>> get = userResource.get();

        get.enqueue(new Callback<List<Users>>() {

            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                //ENTRADA DE DADOS

                minhaLista = findViewById(R.id.lista);
                listUsers = response.body();

                for(Users user :  listUsers){
                    Users u = new Users(user.getName(), user.getEmail());
                    lista.add(u);
                }

                AdapterCliente clienteAdapter = new AdapterCliente(getApplicationContext(), lista);
                minhaLista.setAdapter(clienteAdapter);

            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                minhaLista = findViewById(R.id.lista);
            }
        });


        }}
