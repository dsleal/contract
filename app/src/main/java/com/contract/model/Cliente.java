package com.contract.model;

import java.util.Date;
import java.util.List;

public class Cliente {

    public int id;
    public String nome;
    public Date dataDeNascimento;
    public String identidade;
    public String cnpj_cpf;
    public String email;
    public String endereco;
    public String telefone;

    public Cliente() {
    }

    public Cliente incluir(){
        return null;
    }

    public Cliente editar(){
        return null;
    }

    public List<Cliente> listar(){
        return null;
    }

    public void excluir(int codigo){
    }





    public Cliente(int id, String nome, Date dataDeNascimento, String identidade, String cnpj_cpf, String email, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.identidade = identidade;
        this.cnpj_cpf = cnpj_cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
