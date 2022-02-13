/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import prototipo.ConnectionFactory;
import prototipo.Produto;

/**
 *
 * @author win
 */
public class ProdutoDao {
    private Connection connection;
    int id;
    String nome;
    int preco;
    float cod_barra;
    String fornecedor;
    int custo;
    
    public ProdutoDao(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Produto produto){ 
        String sql = "INSERT INTO Produto(nome,preco,cod_barra,fornecedor,custo,quantidade) VALUES(?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getPreco());
            stmt.setString(3, produto.getCod_barra());
            stmt.setString(4, produto.getFornecedor());
            stmt.setString(5, produto.getCusto());
            stmt.setString(6, produto.getQuantidade());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
}
    
    

   
}
