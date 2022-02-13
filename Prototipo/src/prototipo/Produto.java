/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

    public class Produto {
    int id;
    String nome;
    String preco;
    String cod_barra;
    String fornecedor;
    String custo;
    String quantidade;
    
    public int getId(){
      return id;
    }
    
    public void setId(int id){
       this.id = id;
    }
    
    public String getNome(){
      return nome; 
    }
    
    public void  setNome(String nome){
      this.nome = nome;
    }
    
public String getPreco(){
    return preco;
}

  public void  setPreco(String preco){
      this.preco = preco;
    }

  
  public String getCod_barra(){
    return cod_barra;
}

  public void  setCod_barra(String cod_barra){
      this.cod_barra = cod_barra;
    }
  
  public String getFornecedor(){
    return fornecedor;
}

  public void  setFornecedor(String fornecedor){
      this.fornecedor = fornecedor;
    }
  
   public String getCusto(){
    return custo;
}

  public void  setCusto(String custo){
      this.custo = custo;
    }
  
  public String getQuantidade(){
   return quantidade;
  }
  
  public void setQuantidade(String quantidade){
    this.quantidade = quantidade;
  }
  
 
}

