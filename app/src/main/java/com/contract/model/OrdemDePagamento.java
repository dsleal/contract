package com.contract.model;

import java.util.Date;

public class OrdemDePagamento {
    public int codigo;
    public Date data;
    public double valor;
    public Prestador prestador;
    public OrdemDeServico ordemDeServico;

    public OrdemDePagamento() {
    }

    public OrdemDePagamento(int codigo, Date data, double valor, Prestador prestador, OrdemDeServico ordemDeServico) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.prestador = prestador;
        this.ordemDeServico = ordemDeServico;
    }

    public OrdemDePagamento incluir(OrdemDeServico ordemDeServico){
        return null;
    }
    public OrdemDePagamento alterar(int codigo){
        return null;
    }
    public OrdemDePagamento consultar(int codigo){
        return null;
    }
    public OrdemDePagamento cancelar(int codigo){
        return null;
    }



    public int getCodigo() {
        return codigo;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public OrdemDeServico getOrdemDeServico() {
        return ordemDeServico;
    }

    public void setOrdemDeServico(OrdemDeServico ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }
}
