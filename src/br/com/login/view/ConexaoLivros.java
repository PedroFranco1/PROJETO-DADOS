package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoLivros {

public static void main(String[] args) {
    


    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciador_de_livros", "root", "sql1234");
        ResultSet rsCliente= conexao.createStatement().executeQuery("select*from livros");
        while (rsCliente.next()) {
            System.out.println("ID: " + rsCliente.getInt("id_livro"));
            System.out.println("Nome: " + rsCliente.getString("nome"));
            System.out.println("Autor: " + rsCliente.getString("autor"));
            System.out.println("Gênero: " + rsCliente.getString("genero"));         
  }
    } catch (ClassNotFoundException ex) {
        System.out.println("driver do banco não localizado.");
    } catch (SQLException ex) {
        System.out.println("Houve um erro ao acessar o banco:"+ ex.getMessage());
    }
}


}