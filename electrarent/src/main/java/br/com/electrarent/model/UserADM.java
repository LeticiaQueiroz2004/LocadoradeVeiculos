package br.com.electrarent.model;

public class UserADM {

    private String email;
    private String senha;

    public UserADM(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
