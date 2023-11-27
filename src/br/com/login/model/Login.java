/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.model;

/**
 *
 * @author pedfr
 */
public class Login {
    
    private String nome, senha, idade, sexo, genero;

    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public void cadastrar(String nome,String senha,String idade,String sexo,String genero){
        this.nome= nome;
        this.senha= senha;
        this.idade= idade;
        this.sexo= sexo;
        this.genero= genero;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
