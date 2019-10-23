package com.contract.model;

import java.util.Date;

public class SolicitacoDeServico {
    public int codigo;
    public Date dataInclusao;
    public int status;
    public Cliente cliente;

    public SolicitacoDeServico() {
    }

    public SolicitacoDeServico incluir(){
        return null;
    }

    public SolicitacoDeServico alterar(int codigo){
        return null;
    }

    public SolicitacoDeServico consultar(int codigo){
        return null;
    }

    public SolicitacoDeServico cancelar(int codigo){
        return null;
    }

    public SolicitacoDeServico(int codigo, Date dataInclusao, int status, Cliente cliente) {
        this.codigo = codigo;
        this.dataInclusao = dataInclusao;
        this.status = status;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
