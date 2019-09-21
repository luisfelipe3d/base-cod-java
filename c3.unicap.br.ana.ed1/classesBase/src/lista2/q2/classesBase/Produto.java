/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.q2.classesBase;

/**
 *
 * @author home
 */
public class Produto implements Comparable <Produto> {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public Produto(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String desc){
        this.descricao = desc;
    }
    
    public void setQuantidade(int qtd){
        if(this.quantidade < 0){
            this.quantidade = 0;
        }else{
            this.quantidade = qtd;
        }
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setPreco(double value){
        if(this.preco < 0){
            this.preco = 0;
        }else{
            this.preco = value;
        }
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    @Override
    public String toString(){
        return "{Código:"+this.codigo+", Descrição:"+this.descricao
                +", Quantidade:"+this.quantidade+", Preço:"+this.preco+"}\n";
    }
    
    @Override
    public int compareTo(Produto value){
        return this.codigo.compareTo(value.codigo);
    }
}
