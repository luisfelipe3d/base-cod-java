package mercado.model;

public class Produto {    
    private int codigo;
    private String nome;
    private String marca;
    private String descricao;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, String marca, String descricao, double preco, int qtdEstoque) {
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }
    
    public int getQtdEstoque(){
        return this.qtdEstoque;
    }

    @Override
    public String toString() {
        return "\n" + "Código: " + codigo + "\n" + "Nome: " + nome + "\n" + "Marca: " + marca + "\n"
                + "Descrição: " + descricao + "\n" + "Preço: " + preco + "\n";
    }
}
