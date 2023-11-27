package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoClientes {

public static void main(String[] args) {
    


    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciador_de_livros", "root", "sql1234");
        ResultSet rsCliente= conexao.createStatement().executeQuery("select*from clientes");
        while (rsCliente.next()) {
            System.out.println("ID: " + rsCliente.getInt("id_cliente"));
            System.out.println("Nome: " + rsCliente.getString("nome"));
            System.out.println("Sexo: " + rsCliente.getString("sexo"));
            System.out.println("Idade: " + rsCliente.getInt("idade"));
            System.out.println("Gênero Favorito 1: " + rsCliente.getString("genero_favorito1"));
            System.out.println("Gênero Favorito 2: " + rsCliente.getString("genero_favorito2"));          
        }
    } catch (ClassNotFoundException ex) {
        System.out.println("driver do banco não localizado.");
    } catch (SQLException ex) {
        System.out.println("Houve um erro ao acessar o banco:"+ ex.getMessage());
        
    }
    
}



}