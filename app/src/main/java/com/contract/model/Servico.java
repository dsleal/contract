package com.contract.model;

public class Servico {
    private long id;
    private float valorTotal;
    private int numeroServicos;
    private String descricao;


    public Servico() {
    }

    public Servico(long id, float valorTotal, int numeroServicos, String descricao) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.numeroServicos = numeroServicos;
        this.descricao = descricao;

    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroServicos() {
        return numeroServicos;
    }

    public void setNumeroServicos(int numeroServicos) {
        this.numeroServicos = numeroServicos;
    }
}
