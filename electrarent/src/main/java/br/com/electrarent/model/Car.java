package br.com.electrarent.model;

public class Car {

    private String id;
    private String name;
    private String image;
    private String placa;
    private String cor;
    private double vlDiaria;
    private double kmRodados;
    private int qtdPortas;
    private int qtdAcentos;

    public Car(String name) {
        this.name = name;
    }
    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Car(String id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Car(String id, String name, String image, String placa, String cor, double vlDiaria, double kmRodados, int qtdPortas, int qtdAcentos) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.placa = placa;
        this.cor = cor;
        this.vlDiaria = vlDiaria;
        this.kmRodados = kmRodados;
        this.qtdPortas = qtdPortas;
        this.qtdAcentos = qtdAcentos;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
    public String getPlaca() {return placa;}
    public String getCor() {return cor;}
    public double getVDiary() {return vlDiaria;}
    public double getKmRodados() {return kmRodados;}
    public int getQtdPortas() {return qtdPortas;}
    public int getQtdAcentos() {return qtdAcentos;}
}