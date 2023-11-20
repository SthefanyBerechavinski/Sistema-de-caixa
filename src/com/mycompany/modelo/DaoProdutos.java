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
    
    public Boolean inserir(int id, int codigo, String nome, double preco, double acrescimo, double novopreco){
        try{
            sql = "INSERT INTO PRODUTOS(ID, CODIGO, NOME, PRECO, ACRESCIMO, NOVOPRECO) VALUES(?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            getStatement().setInt(1, id);
            getStatement().setInt(2, codigo);
            getStatement().setString(3, nome);
            getStatement().setDouble(4, preco);
            getStatement().setDouble(5, acrescimo);
            getStatement().setDouble(6, novopreco);
            
            getStatement().executeUpdate();
            
            return true;
        
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    
    }
    public Boolean alterar(int id, int codigo2, String nome2, double preco2, double acrescimo2, double novopreco2){
        try{
            sql = "UPDATE PRODUTOS SET CODIGO = ?, NOME = ?, PRECO = ?, ACRESCIMO = ?, NOVOPRECO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            getStatement().setInt(6, id);
            getStatement().setInt(1, codigo2);
            getStatement().setString(2, nome2);
            getStatement().setDouble(3, preco2);
            getStatement().setDouble(4, acrescimo2);
            getStatement().setDouble(5, novopreco2);
            
            getStatement().executeUpdate();
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PRODUTOS WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
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
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
                "FROM                    " +
                "PRODUTOS P              ";
            
            setStatement(getConexao().prepareStatement(sql));
            setResultado(getStatement().executeQuery());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPorID(int id){
        try{
            sql =
                "SELECT                  " +
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.ID = ?      ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
    public ResultSet listarPorCodigo(int codigo){
        try{
            sql =
                "SELECT                  " +
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
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
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
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
                "P.ID AS ID,             " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
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
    public ResultSet listarPorAcrescimo(Double acrescimo){
        try{
            sql = 
                "SELECT                  " +
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
                "FROM                    " +
                "PRODUTOS P              " +
                "WHERE P.ACRESCIMO = ?    ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, acrescimo);
            
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
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
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
                "P.ID AS ID,              " +
                "P.CODIGO AS CODIGO,      " +
                "P.NOME AS NOME,          " +
                "P.PRECO AS PRECO,        " +
                "P.ACRESCIMO AS ACRESCIMO, " +
                "P.NOVOPRECO AS NOVOPRECO " +
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
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PRODUTOS";
            
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
