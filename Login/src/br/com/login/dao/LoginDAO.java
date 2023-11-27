/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pedfr
 */


public class LoginDAO {
    
public void cadastrarUsuario(String nome, String senha) throws SQLException{
    Connection conexao= new Conexao().getConnection();
    String sql= "insert into login (nome, senha) values ('"+nome+"', '"+senha+"')";
    System.out.println(sql);
    PreparedStatement statment= conexao.prepareStatement(sql);
    statment.execute();
    conexao.close();
    
}

public void login(String nome, String senha) throws SQLException {
    Connection conexao= new Conexao().getConnection();
    String sql= "select nome, senha from login where nome= '"+nome+"' and senha= '"+senha+"'";
    System.out.println(sql);
    PreparedStatement statment= conexao.prepareStatement(sql);
    ResultSet rs = statment.executeQuery();
    
    if (rs.next()){
        
        System.out.println("Possui");
    } else {
        
        System.out.println("Não possui");
    }
    
    conexao.close();
    
    
}
}
