package model;

public class Usuario {
    private int idUsuario;
    private String email;
    private String senha;
    private String telefone;
    private String nome;
    private String sobrenome;


    public Usuario(String senha, String nome, String email, String telefone, String sobrenome) {
        this.senha= senha;
        this.nome= nome;
        this.email = email;
        this.telefone = telefone;
        this.sobrenome = sobrenome;
    }

    public Usuario(String senha, String email) {
        this.senha= senha;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
