/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author sthefany.1921
 */
public class ModProdutos {
    private int id;
    private int codigo;
    private String nome;
    private double preco;
    private double acrescimo;
    private double novopreco;

    public ModProdutos() {
    }

    public ModProdutos(int id, int codigo, String nome, double preco, double acrescimo, double novopreco) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.acrescimo = acrescimo;
        this.novopreco = novopreco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public double getNovopreco() {
        return novopreco;
    }

    public void setNovopreco(double novopreco) {
        this.novopreco = novopreco;
    }

    @Override
    public String toString() {
        return "ModProdutos{" + "id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", acrescimo=" + acrescimo + ", novopreco=" + novopreco + '}';
    }
    
    

    

    
    
    
    
}
