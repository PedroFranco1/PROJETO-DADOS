package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirLivro {

    public static void main(String[] args) {

        String nome = "50 tons de cinza";
        String autor = "E. L. James";
        String genero = "Drama";


        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gerenciador_de_livros", "root", "sql1234")) {

            String sql = "INSERT INTO Livros (nome,autor,genero) VALUES (?, ?, ?)";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                
                stmt.setString(1, nome);
                stmt.setString(2, autor);
                stmt.setString(3, genero);

                
                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Novo Livro inserido com sucesso!");
                } else {
                    System.out.println("Nenhuma linha afetada. Falha ao inserir o Livro.");
                }
            }
            catch (Exception ex) {
                System.out.println("Driver do banco não localizado." + ex.getMessage());
            } 
        }
            catch (SQLException ex) {
            System.out.println("Houve um erro ao acessar o banco: " + ex.getMessage());
        }
    }
}