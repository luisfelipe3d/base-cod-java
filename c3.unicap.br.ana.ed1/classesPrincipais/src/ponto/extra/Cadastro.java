/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto.extra;
import java.util.Scanner;

public class Cadastro {
    
    private Tree <Produto> arv;
    
    public Cadastro(){
        arv = new Tree();
    }
    
    public void cadastrar(String value){
        Produto aux = buscar(value);
        if(aux != null){
            System.out.println("Código já cadastrado.");
        }else{
            Scanner in = new Scanner(System.in);
            String descricao, fornecedor;
            Produto p = new Produto(value);
            double preco;
            int estoque;
            
            System.out.print("Descrição: ");
            descricao = in.nextLine();
            p.setDescricao(descricao);

            System.out.print("Fornecedor: ");
            fornecedor = in.nextLine();
            p.setFornecedor(fornecedor);

            do{
                System.out.print("Preço: ");
                preco = in.nextDouble();
                if(preco <= 0){
                    System.out.print("Preço inválido. Por favor digite novamente!\n"
                            + "Preço: ");
                    preco = in.nextDouble();
                }
                p.setPreco(preco);
            }while(preco <= 0);

            do{
                System.out.print("Estoque: ");
                estoque = in.nextInt();
                if(estoque <=0){
                    System.out.print("Estoque inválido. Digite novamente!\n"
                            + "Estoque: ");
                    estoque = in.nextInt();
                }
                p.setQtd(estoque);
            }while(estoque <=0);
            arv.insert(p);
        }//fim else
    }// fim cadastrar
    
    public void exibirTodos(){
        arv.emOrdem();
    }
    
    private Produto buscar(String cod){
        Produto p = new Produto(cod);
        Produto aux = arv.find(p);
        return aux;            
    }
    
    public void exibirProduto(String cod){
        Produto p = buscar(cod);
        if(p != null){
            System.out.println(p);
        }else{
            System.out.println("Produto não encontrado. - ExibirProduto");
        }
    }
    
    public void alterarPreco(String cod){
        Scanner in = new Scanner(System.in);
        Produto p = buscar(cod);
        double novoPreco;
        if(p != null){
            System.out.print("Novo preço: ");
            novoPreco = in.nextDouble();
            p.setPreco(novoPreco);
        }else{
            System.out.println("Produto não encontrado. - AlterarPreco");
        }
    }//fim alterarPreco
    
    public void alterarEstoque(String cod){
        Scanner in = new Scanner(System.in);
        Produto p = buscar(cod);
        int qtd;
        if(p != null){
            System.out.print("Nova quantidade: ");
            qtd = in.nextInt();
            p.setQtd(qtd);
        }else{
            System.out.println("Produto não encontrado. - AlterarEstoque");
        }
    }//fim alterarEstoque
    
    public void remover(String cod){
        Produto p = buscar(cod);
        if(p != null){
            arv.remove(p);
            System.out.println("Produto removido.");
        }else{
            System.out.println("Produto não encontrado. - Remover");
        }
    }
}
