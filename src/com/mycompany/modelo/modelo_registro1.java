/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author sthefany.1921
 */
public class modelo_registro1 {
    private int codigo;
    private String nome;
    private float preco;
    private float acrescimo;

    public modelo_registro1() {
    }

    public modelo_registro1(int codigo, String nome, float preco, float acrescimo) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.acrescimo = acrescimo;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }

    @Override
    public String toString() {
        return "modelo_registro{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", acrescimo=" + acrescimo + '}';
    }
    
    
    
}
