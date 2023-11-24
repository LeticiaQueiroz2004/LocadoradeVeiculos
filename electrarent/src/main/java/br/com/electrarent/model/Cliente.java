package br.com.electrarent.model;

import java.sql.Date;

public class Cliente {
    private int idCliente;
    private String nmCliente;
    private String email;
    private String nacionalidade;
    private Date dtNascimento;
    private String rg;
    private String cpf;
    private String telefone;
    private String endereco;
    private String cep;
    private String bairro;
    private String cidade;
    private String complemento;
    private int fkUsuario;

    public Cliente() {
    }

    public Cliente(String nmCliente, String email, String nacionalidade, Date dtNascimento, String rg, String cpf, String telefone, String endereco, String cep, String bairro, String cidade, String complemento, int fkUsuario) {
        this.nmCliente = nmCliente;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.dtNascimento = dtNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.fkUsuario = fkUsuario;
    }

    public int getIdCliente() {return idCliente;}
    public String getNmCliente() {return nmCliente;}
    public String getEmail() {return email;}
    public String getNacionalidade() {return nacionalidade;}
    public Date getDtNascimento() {return dtNascimento;}
    public String getRg() {return rg;}
    public String getCpf() {return cpf;}
    public String getTelefone() {return telefone;}
    public String getEndereco() {return endereco;}
    public String getCep() {return cep;}
    public String getBairro() {return bairro;}
    public String getCidade() {return cidade;}
    public String getComplemento() {return complemento;}
    public int getFkUsuario() {return fkUsuario;}
}