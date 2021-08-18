/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
/**
 *
 * @author vagne
 */
public class Produto {

    private int codigo;
    private String nome;
    private String descricao;
    private String quantidadeDisponivel;
    private String precoCusto;
    private String precoVenda;
    private String magemLucro;
    private String ultimoReajuste;

     public Produto(int codigo, String nome, String descricao, String quantidadeDisponivel, String precoCusto, String precoVenda, String magemLucro, String ultimoReajuste) {
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

    public String getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(String quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getMagemLucro() {
        return magemLucro;
    }

    public void setMagemLucro(String magemLucro) {
        this.magemLucro = magemLucro;
    }

    public String getUltimoReajuste() {
        return ultimoReajuste;
    }

    public void setUltimoReajuste(String ultimoReajuste) {
        this.ultimoReajuste = ultimoReajuste;
    }
}

