/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2.q2.aplicacao;
import lista2.q2.classesBase.Produto;
import lista2.q2.classesPrincipais.LSE;
import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int op;
        LSE listaProdutos = new LSE();
        String codigo;
        do{
            System.out.print("1 - Inserir novo produto no inicio da lista.\n"
                    + "2 - Inserir novo produto no final da lista.\n"
                    + "3 - Remover o primeiro produto da lista.\n"
                    + "4 - Remover o último produto da lista.\n"
                    + "5 - Exibir todos os produtos da lista\n"
                    + "6 - Exibir os dados de um produto da lista.\n"
                    + "7 - Alterar os dados de um produto da lista.\n"
                    + "8 - Remover um produto da lista.\n"
                    + "0 - Sair do programa.\n"
                    + "Opção: ");
            op = in.nextInt(); in.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("Código do produto(Inicio): "); 
                    codigo = in.nextLine();
                    listaProdutos.inserirInicio(cadastroProduto(codigo));
                    System.out.println("Produto cadastrado.(INICIO)");
                    break;
                case 2:
                    System.out.println("Código do produto(Final): ");
                    codigo = in.nextLine();
                    listaProdutos.inserirFinal(cadastroProduto(codigo));
                    System.out.println("Produto cadastrado.(FINAL)");
                    break;
                case 3:
                    System.out.println("Remover o primeiro produto.");
                    listaProdutos.removerInicio();
                    break;
                case 4:
                    System.out.println("Remover o último produto.");
                    listaProdutos.removerFinal();
                    break;
                case 5:
                    listaProdutos.listarProdutos();
                    break;
                case 6:
                    if(listaProdutos.isEmpty()){
                        System.out.println("Lista vazia.(Exibir Produto)");
                    }else{
                        System.out.print("Código do produto: ");
                        codigo = in.nextLine();
                        listaProdutos.exibirProduto(codigo);
                    }
                    break;
                case 7:
                    if(listaProdutos.isEmpty()){
                        System.out.println("Lista vazia.(Alterar Produto)");
                    }else{
                        System.out.print("Informe o código do produto: ");
                        codigo = in.nextLine();
                        alterarPreco(codigo);
                    }
                    break;
                case 8:
                    if(listaProdutos.isEmpty()){
                        System.out.println("Lista vazia.(Aplicacao)");
                    }else{
                        System.out.println("Código para remoção: ");
                        codigo = in.nextLine();
                        listaProdutos.removerProduto(codigo);    
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            
        }while(op != 0);
    }
    
    public static Produto cadastroProduto(String codigo){
        Scanner in = new Scanner(System.in);
        Produto aux = new Produto (codigo);
        double preco;
        int qtd;
        String descricao;
        
        System.out.print("Descrição: ");
        descricao = in.nextLine();
        aux.setDescricao(descricao);
        
        do{
            System.out.print("Preço: ");
            preco = in.nextDouble();
            aux.setPreco(preco);
        }while(preco < 0);
        
        do{
            System.out.print("Quantidade: ");
            qtd = in.nextInt();
            aux.setQuantidade(qtd);
        }while(qtd < 0);
        
        return aux;
    }
    
    public static void alterarPreco(String codigo){
        Scanner in = new Scanner(System.in);
        int op, estoque;
        double preco;
        Produto aux = new Produto(codigo);
        do{
            System.out.print("1 - Alterar preço. \n"
                    + "2 - Alterar estoque. \n"
                    + "3 - Alterar preço e estoque. \n"
                    + "Opção: ");
            op = in.nextInt(); in.nextLine();
            switch(op){
                case 1:
                    System.out.print("Informe o preço do produto(1): ");
                    preco = in.nextDouble(); in.nextLine();
                    aux.setPreco(preco);
                    System.out.println("Preço atualizado.(1)");
                    return;
                case 2:
                    System.out.print("Informe a quantidade no estoque(2): ");
                    estoque = in.nextInt(); in.nextLine();
                    aux.setQuantidade(estoque);
                    System.out.println("Estoque atualizado.(2)");
                    return;
                case 3:
                    System.out.print("Informe o preço do produto(3): ");
                    preco = in.nextDouble(); in.nextLine();
                    System.out.print("Informe o estoque do produto(3): ");
                    estoque = in.nextInt();
                    aux.setPreco(preco);
                    aux.setQuantidade(estoque);
                    System.out.println("Preço e estoque atualizados.(3)");
                    return;
                default:
                    System.out.println("Opção inválida.");           
            }
        }while(op >= 0 && op < 4);
    }
}
