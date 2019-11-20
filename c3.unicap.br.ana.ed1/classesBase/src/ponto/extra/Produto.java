/*
String código,
String descricao,
String fornecedor,
Double preco,
Int qtd

to string() 
compareTo()
*/
package ponto.extra;

public class Produto implements Comparable <Produto> {
    private String codigo;
    private String descricao, fornecedor;
    private double preco;
    private int qtd;
    
    public Produto(String value){
        this.codigo = value;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setDescricao(String value){
        this.descricao = value;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setFornecedor(String value){
        this.fornecedor = value;
    }
    
    public String getFornecedor(){
        return this.fornecedor;
    }
    
    public void setPreco(double value){
        this.preco = value;
    }
    
    public Double getPreco(){
        return this.preco;
    }
    
    public void setQtd(int value){
        this.qtd = value;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    @Override
    public String toString(){
        return "{Código: "+this.codigo+", Descrição: "+this.descricao+
                ", Fornecedor: "+this.fornecedor+", Preço: "+this.preco+
                ", Quantidade: "+this.qtd+"}\n";
    }
    @Override
    public int compareTo(Produto value){
        return this.codigo.compareTo(value.codigo);
    }
}
