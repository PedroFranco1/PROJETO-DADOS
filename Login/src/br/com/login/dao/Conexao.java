/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;

/**
 *
 * @author pedfr
 */


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {

    public Connection getConnection() throws SQLException{
    Connection conexao= DriverManager.getConnection("jdbc:postgresql://localhost:1412/projeto", "postgres", "p14122001");
    return conexao;
        
        
    }
    
}
