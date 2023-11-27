package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirCliente {

    public static void main(String[] args) {
 
        String nome = "Mariana";
        String sexo = "F";
        int idade = 22;
        String generoFavorito1 = "Animação";
        String generoFavorito2 = "Aventura";
        String senha = "5643457";

        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciador_de_livros", "root", "sql1234")) {
            String sql = "INSERT INTO clientes (nome, sexo, idade, genero_favorito1, genero_favorito2, senha) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

                stmt.setString(1, nome);
                stmt.setString(2, sexo);
                stmt.setInt(3, idade);
                stmt.setString(4, generoFavorito1);
                stmt.setString(5, generoFavorito2);
                stmt.setString(6, senha);

                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Novo cliente inserido com sucesso!");
                } else {
                    System.out.println("Nenhuma linha afetada. Falha ao inserir o cliente.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Houve um erro ao acessar o banco: " + ex.getMessage());
        }
    }
}