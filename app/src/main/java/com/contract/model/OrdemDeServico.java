package com.contract.model;

import java.util.Date;

public class OrdemDeServico {
    public int codigo;
    public Date data;
    public String descricao;
    public int statusServico;
    public double valor;

    public OrdemDeServico() {
    }

    public OrdemDeServico(int codigo, Date data, String descricao, int statusServico, double valor) {
        this.codigo = codigo;
        this.data = data;
        this.descricao = descricao;
        this.statusServico = statusServico;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public OrdemDeServico gerar(SolicitacaoDeServico solicitacaoDeServico){
        return null;
    }

    public OrdemDeServico consultar(int codigo){
        return null;
    }

    public OrdemDeServico reavaliar(int codigo){
        return null;
    }

    public OrdemDeServico recusar(int codigo){
        return null;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(int statusServico) {
        this.statusServico = statusServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
