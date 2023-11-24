package br.com.electrarent.model;

import java.sql.Date;

public class Aluguel {
    private int idAluguel;
    private int fkCliente;
    private int fkVeiculo;
    private Date dtRetirada;
    private Date dtDevolucao;
    private double vlTotal;
    private double vlTaxa;
    private int fkPagamento;
    private Date dtAluguel;

    public Aluguel() {
    }

    public Aluguel(int fkCliente, int fkVeiculo, Date dtRetirada, Date dtDevolucao, double vlTotal, double vlTaxa, int fkPagamento, Date dtAluguel) {
        this.fkCliente = fkCliente;
        this.fkVeiculo = fkVeiculo;
        this.dtRetirada = dtRetirada;
        this.dtDevolucao = dtDevolucao;
        this.vlTotal = vlTotal;
        this.vlTaxa = vlTaxa;
        this.fkPagamento = fkPagamento;
        this.dtAluguel = dtAluguel;
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public int getFkCliente() {
        return fkCliente;
    }

    public int getFkVeiculo() {
        return fkVeiculo;
    }

    public Date getDtRetirada() {
        return dtRetirada;
    }

    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public double getVlTaxa() {
        return vlTaxa;
    }

    public int getFkPagamento() {
        return fkPagamento;
    }

    public java.sql.Date getDtAluguel() {
        return dtAluguel;
    }
}