package model;

import java.util.Date;

public class Aluguel {
    private int idAluguel;
    private String numeroVendedor;
    private Date dataRetirada;
    private Date dataDevolucao;
    private double valorTotal;
    private double valorTaxa;
    private int pagamentoId;
    private int veiculoId;
    private int clienteId;

    public Aluguel(int idAluguel, String numeroVendedor, Date dataRetirada, Date dataDevolucao, double valorTotal, double valorTaxa, int pagamentoId, int veiculoId, int clienteId) {
    this.idAluguel = idAluguel;
    this.numeroVendedor = numeroVendedor;
    this.dataDevolucao = dataDevolucao;
    this.dataRetirada = dataRetirada;
    this.valorTotal = valorTotal;
    this.valorTaxa = valorTaxa;
    this.pagamentoId = pagamentoId;
    this.veiculoId = veiculoId;
    this.clienteId = clienteId;
    }

    public Aluguel() {

    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public String getNumeroVendedor() {
        return numeroVendedor;
    }

    public void setNumeroVendedor(String numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public int getPagamentoId() {
        return pagamentoId;
    }

    public void setPagamentoId(int pagamentoId) {
        this.pagamentoId = pagamentoId;
    }

    public int getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
