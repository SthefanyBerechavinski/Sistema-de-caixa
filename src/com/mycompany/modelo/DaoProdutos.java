/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import com.mycompany.ferramentas.BancoDeDados;
import java.sql.ResultSet;

/**
 *
 * @author sthefany.1921
 */
public class DaoProdutos extends BancoDeDados{
    
    private String sql;
    
    public Boolean inserir(int codigo, String nome, double preco, double acrescimo){
        try{
            sql = "INSERT INTO PRODUTOS(CODIGO, NOME, PRECO, ACRESCIMO) VALUES(?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, codigo);
            getStatement().setString(2, nome);
            getStatement().setDouble(3, preco);
            getStatement().setDouble(4, acrescimo);
            
            getStatement().executeUpdate();
            
            return true;
        
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    
    }
    public Boolean alterar(int codigo, String nome2, double preco2, double acrescimo2){
        try{
            sql = "UPDATE PRODUTOS SET NOME = ?, PRECO = ?, ACRESCIMO = ? WHERE CODIGO = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(4, codigo);
            getStatement().setString(1, nome2);
            getStatement().setDouble(2, preco2);
            getStatement().setDouble(3, acrescimo2);
            
            getStatement().executeUpdate();
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public Boolean excluir(int codigo){
        try{
            sql = "DELETE FROM PRODUTOS WHERE CODIGO = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, codigo);
            
            getStatement().executeUpdate();
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public ResultSet listarTodos(){
        try{
            sql =
                "SELECT                  " +
                "P.CODIGO AS CODIGO      " +
                "P.NOME AS NOME          " +
                "P.PRECO AS PRECO        " +
                "P.ACRESCIMO AS ACRESCIMO" +
                "FROM                    " +
                "PRODUTOS P              ";
            
            setStatement(getConexao().prepareStatement(sql));
            setResultado(getStatement().executeQuery());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPorCod(int codigo){
        try{
            sql =
                "SELECT                  " +
                "P.CODIGO AS CODIGO      " +
                "P.NOME AS NOME          " +
                "P.PRECO AS PRECO        " +
                "P.ACRESCIMO AS ACRESCIMO" +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.CODIGO = ?      ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, codigo);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                "SELECT                  " +
                "P.CODIGO AS CODIGO      " +
                "P.NOME AS NOME          " +
                "P.PRECO AS PRECO        " +
                "P.ACRESCIMO AS ACRESCIMO" +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.NOME = ?        ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(2, nome);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPorPreco(Double preco){
        try{
            sql = 
                "SELECT                  " +
                "P.CODIGO AS CODIGO      " +
                "P.NOME AS NOME          " +
                "P.PRECO AS PRECO        " +
                "P.ACRESCIMO AS ACRESCIMO" +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.PRECO = ?        ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPrecoMaiorQue(Double preco){
        try{
            sql = 
                "SELECT                  " +
                "P.CODIGO AS CODIGO      " +
                "P.NOME AS NOME          " +
                "P.PRECO AS PRECO        " +
                "P.ACRESCIMO AS ACRESCIMO" +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.PRECO > ?       ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPrecoMenorQue(Double preco){
        try{
            sql = 
                "SELECT                  " +
                "P.CODIGO AS CODIGO      " +
                "P.NOME AS NOME          " +
                "P.PRECO AS PRECO        " +
                "P.ACRESCIMO AS ACRESCIMO" +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.PRECO < ?       ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PRODUTO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
    
}
