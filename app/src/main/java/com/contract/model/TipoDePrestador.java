package com.contract.model;

import java.util.List;

public class TipoDePrestador {
    public int codigo;
    public String descricao;
    public boolean desativado;

    public TipoDePrestador() {
    }

    public TipoDePrestador(int codigo, String descricao, boolean desativado) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.desativado = desativado;
    }

    public TipoDePrestador incluir(TipoDePrestador tipoDePrestador){
        return null;
    }
    public TipoDePrestador editar(int codigo){
        return null;
    }
    public List<TipoDePrestador> listar(){
        return null;
    }
    public void excluir(int codigo){
        
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDesativado() {
        return desativado;
    }

    public void setDesativado(boolean desativado) {
        this.desativado = desativado;
    }
}
