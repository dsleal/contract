package com.contract.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.contract.R;
import com.contract.activities.Cliente;
import com.contract.model.Users;

import java.util.List;

public class AdapterCliente extends BaseAdapter {


    Context context;
    List<Users> colecao;
    LayoutInflater inflter;

    public AdapterCliente(final Context applicationContext,
                         final List<Users> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }

    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Users parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.activity_itens,                            viewGroup, false);
        }

        Users users = parsetItem(i);

        TextView campoNome, campoEmail;

        campoNome = view.findViewById(R.id.txtName);
        campoEmail = view.findViewById(R.id.txtEmail);

        campoNome.setText(users.getName());
        campoEmail.setText(users.getEmail());

        return view;
    }
}
