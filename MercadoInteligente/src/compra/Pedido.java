package compra;

import java.util.ArrayList;
import java.util.List;

import estoque.Produto;

public class Pedido {

    private List<Produto> pedido;

    public Pedido(List<Produto> produtos) {
        this.pedido = (ArrayList<Produto>) produtos;
    }
}
