package com.contract.model;

import java.util.Date;
import java.util.List;

public class Prestador {
    public String nome;
    public Date dataDeNascimento;
    public String identidade;
    public String cnpj_cpf;
    public String email;
    public String endereco;
    public String telefone;
    public String codigo_banco;
    public String agencia;
    public String conta;
    public TipoDePrestador tipodePrestador;

    public Prestador() {
    }

    public Prestador(String nome, Date dataDeNascimento, String identidade, String cnpj_cpf, String email, String endereco, String telefone, String codigo_banco, String agencia, String conta, TipoDePrestador tipodePrestador) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.identidade = identidade;
        this.cnpj_cpf = cnpj_cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codigo_banco = codigo_banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipodePrestador = tipodePrestador;
    }

    public Prestador incluir(Prestador prestador){
        return null;
    }
    public Prestador editar(Prestador prestador){
        return null;
    }
    public List<Prestador> listar(){
        return null;
    }
    public void excluir(int codigo){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodigo_banco() {
        return codigo_banco;
    }

    public void setCodigo_banco(String codigo_banco) {
        this.codigo_banco = codigo_banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
