package mercado.model;

public interface CarrinhoState {
    CarrinhoState novoPedido();
    
    CarrinhoState desistePedido();
    
    CarrinhoState adicionaItem(String item);
    
    CarrinhoState removeItem(String item);
    
    CarrinhoState finalizaPedido();
}
