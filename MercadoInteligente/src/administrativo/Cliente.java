package administrativo;

import compra.*;

//Classe implementada por João Thalis
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    private List<Pedido> pedidos;
    private CarrinhoCompras carrinho;

    public Cliente(String CPF, String nome, String telefone, String login, String senha) {
        super(CPF, nome, telefone, login, senha);
        pedidos = new ArrayList<Pedido>();
    }
    
    public void adicionarCarrinho(CarrinhoCompras carrinho){
        this.carrinho = carrinho;
    }

    public CarrinhoCompras getCarrinho() {
        return carrinho;
    }
}
