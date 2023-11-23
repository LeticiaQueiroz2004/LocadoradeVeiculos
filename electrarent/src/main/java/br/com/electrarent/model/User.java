package br.com.electrarent.model;

public class User {

    private String primeiroNome;

    private  String sobrenome;

    private String telefone;

    private String email;
    private String senha;

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public User(String primeiroNome, String sobrenome, String telefone, String email, String senha) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {return email;}

    public String getSenha() {
        return senha;
    }

    public String getPrimeiroNome() {return primeiroNome;}

    public String getSobrenome() {return sobrenome;}

    public String getTelefone() {return telefone;}
}
