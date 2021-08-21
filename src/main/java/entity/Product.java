/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author vagne
 */
public class Product {

    private int codigo;
    private String nome;
    private String descricao;
    private int quantidadeDisponivel;
    private double precoCusto;
    private double precoVenda;
    private int magemLucro;
    private Date ultimoReajuste;

     public Product(int codigo, String nome, String descricao, int quantidadeDisponivel, double precoCusto, double precoVenda, int magemLucro, Date ultimoReajuste) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.magemLucro = magemLucro;
        this.ultimoReajuste = ultimoReajuste;
    }
    
      public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getMagemLucro() {
        return magemLucro;
    }

    public void setMagemLucro(int magemLucro) {
        this.magemLucro = magemLucro;
    }

    public Date getUltimoReajuste() {
        return ultimoReajuste;
    }

    public void setUltimoReajuste(Date ultimoReajuste) {
        this.ultimoReajuste = ultimoReajuste;
    }
}

