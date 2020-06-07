package mercado.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> carrinhoCompras;
    
    public Carrinho(){
        this.carrinhoCompras = new ArrayList();
    }
        
    public boolean adicionarItem(Produto produto){
        return this.carrinhoCompras.add(produto);
    }
    
    public boolean removerItem(Produto produto){
        if(this.carrinhoCompras.isEmpty()){
            return false;
        }
        return this.carrinhoCompras.remove(produto);
    }
    
    public boolean finalizarCompra(Produto produto){
        if(this.carrinhoCompras.isEmpty()){
            return false;
        }
        
        for(int i = 0; i < this.carrinhoCompras.size(); i++){
            this.carrinhoCompras.get(i).setQtdEstoque(this.carrinhoCompras.get(i).getQtdEstoque()-1);
        }
        
        return true;
    }
}
