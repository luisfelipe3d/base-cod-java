/*
Lista 5
Almir
15.Faça um programa que obtenha o destino do passageiro, que obtenha
a informação se a viagem inclui retorno (ida e volta) e 
então determine o preço da passagem de acordo com a tabela a seguir:
Região Norte ; Ida = 500 ; Ida e Volta = 900
Região Nordeste ; Ida = 380 ; Ida e volta = 650
Região sul ; Ida = 350 ; Ida e volta  = 600

 */
package lista5;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao, preco=0;
        char c;
        
        System.out.print("Deseja viajar para qual destino: \n"
                + "1. Região Norte.\n"
                + "2. Região Nordeste.\n"
                + "3. Região Sul.\n"
                + "Escolha uma opção: ");
        opcao = in.nextInt();
        //Caso usuário digite errado encerra o programa
        if (opcao >= 1 && opcao <= 3){
        System.out.print("Passagem inclui retorno (S/N) :  ");
        c = in.next().charAt(0);
            if (c == 'S')
                if (opcao == 1)
                    preco = 900;
                else if (opcao == 2)
                    preco = 650;
                else
                    preco = 600;
        
            else if (c == 'N')
                if (opcao == 1)
                    preco = 500;
                else if (opcao == 2)
                    preco = 380;
            else
                preco = 350;
            System.out.println("Valor da passagem: R$"+preco);
        } else
              System.out.println("Opção inválida.");
        
        }  
    }

