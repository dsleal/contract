package com.contract.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.contract.R;
import com.contract.boostrap.APIClient;
import com.contract.model.Servico;
import com.contract.model.Users;
import com.contract.resource.ServicoResource;
import com.contract.resource.UserResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SolicitacaoLista extends AppCompatActivity {
    public ListView listaTeste;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao_lista);

        /*Pega a referencia do ENDPOINT e do converter(gson)
         * */
        Retrofit retrofit = APIClient.getClient();

        //Faz o 'bind' da instância do retrofit com interface
        //que contém as operações (GET,POST,PUT,DELETE)
        ServicoResource servicoResource = retrofit.create(ServicoResource.class);

        //Faz a chamada do serviço
        Call<List<Servico>> get = servicoResource.get();

        get.enqueue(new Callback<List<Servico>>() {
            @Override
            public void onResponse(Call<List<Servico>> call, Response<List<Servico>> response) {

                //Se deu certo executa este método
                listaTeste = findViewById(R.id.lista);
                List<Servico> listServico = response.body();

                //PROCESSAMENTO
                //Convertendo a lista em um List<HashMap<String,String>
                //para o simpleAdapter
                List<String> colecaoArrayAdapter = new ArrayList<>();

                List<HashMap<String, String>> colecao = new ArrayList<>();

                //criando colecao para o adapter
                for (Servico s : listServico) {

                    HashMap<String, String> map = new HashMap<>();
                    map.put("id", s.getId() + " ");
                    //map.put("valorTotal", s.getValorTotal());
                    //map.put("numeroServicos", s.getNumeroServicos();
                    map.put("descricao", s.getDescricao());

                    colecao.add(map);
                    colecaoArrayAdapter.add(s.getDescricao());
                }

                //Fazer o mapeamento da colecao com o layout do item
                String[] de = {"id", "descricao"};
                int[] para = {R.id.txtId, R.id.txtDescricao};

                //SAIDA
                listaTeste = findViewById(R.id.lista);

                //SIMPLE ADAPTER
                SimpleAdapter adapter =
                        new SimpleAdapter(getApplicationContext(), colecao,
                                R.layout.activity_itens_servico, de, para);

                listaTeste.setAdapter(adapter);

                //Professor não consegui popular a tela
                //Por esse motivo não coloquei todos os campos, montei a estrutura que pensei que seria correta.
                //Diogo Leal

            }

            @Override
            public void onFailure(Call<List<Servico>> call, Throwable t) {
                listaTeste = findViewById(R.id.lista);

            }
        });
    }
}
