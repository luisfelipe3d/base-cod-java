/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto.extra;

import java.util.Scanner;
import ponto.extra.Cadastro;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Produto p;
        String codigo;
        Cadastro cad = new Cadastro();
        int op;
        
        do{
            System.out.print("***Menu***\n"
                    + "1. Cadastro\n"
                    + "2. Exibir Produto\n"
                    + "3. Alterar Preço\n"
                    + "4. Alterar Estoque\n"
                    + "5. Listar Todos\n"
                    + "6. Remover\n"
                    + "0. Sair\n"
                    + "Opção: ");
            op = in.nextInt(); in.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("Código para cadastrar o novo produto: ");
                    codigo = in.nextLine();
                    cad.cadastrar(codigo);
                    break;
                case 2:
                    System.out.print("Informe o código do produto a ser exibido: ");
                    codigo = in.nextLine();
                    cad.exibirProduto(codigo);
                    break;
                case 3:
                    System.out.print("Alterar Preço. Código: ");
                    codigo = in.nextLine();
                    cad.alterarPreco(codigo);
                    break;
                case 4:
                    System.out.print("Alterar Estoque. Código: ");
                    codigo = in.nextLine();
                    cad.alterarEstoque(codigo);
                    break;
                case 5:
                    System.out.println("Exibindo todos....");
                    cad.exibirTodos();
                    break;
                case 6:
                    System.out.print("Remover produto. Código: ");
                    codigo = in.nextLine();
                    cad.remover(codigo);
                    break;
                case 0:
                    System.out.println("Fim programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(op != 0);
    }
}
