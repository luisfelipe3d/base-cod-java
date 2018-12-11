/*
Faça um programa que apresente o menu a seguir:
Menu de opções
1 - Média Aritmética
2 - Média Ponderada
3 - Sair
Digite a opção:

Na opção 1: receber duas notas, calcular e imprimir a média aritmética
Na opção 2: receber três notas e seus respctivos pesos, calcular e imprimir a 
média ponderada
Na opção 3: Sair do programa.
Obs: verifique a possibilidade de opção inválida, mostrando uma mensagem.

 */
package prova1GQ;
import java.util.Scanner;

public class questao4_prova1gq {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double nota1,nota2,nota3,media=0;
        int opcao, peso1,peso2,peso3;
        do {
            System.out.println("Menu de Opções: ");
            System.out.println("1 - Média Aritimética");
            System.out.println("2 - Média Ponderada");
            System.out.println("3 - Sair do Programa");
            System.out.print("Escolher uma opção: ");
            opcao = in.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Digite nota1: ");
                    nota1 = in.nextDouble();
                    System.out.print("Digite nota2: ");
                    nota2 = in.nextDouble();
                    media = nota1+nota2/2;
                    System.out.println("Media: "+media);
                    break;
                case 2:
                    System.out.print("Digite nota1: ");
                    nota1 = in.nextDouble();
                    System.out.print("Peso Nota1: ");
                    peso1 = in.nextInt();
                    System.out.print("Digite nota2: ");
                    nota2 = in.nextDouble();
                    System.out.print("Peso Nota2: ");
                    peso2 = in.nextInt();
                    System.out.print("Digite nota3: ");
                    nota3 = in.nextDouble();
                    System.out.print("Peso Nota3: ");
                    peso3 = in.nextInt();
                    media = ((nota1*peso1 + nota2*peso2 + nota3*peso3)/
                            (peso1+peso2+peso3));
                    System.out.println("Média Aritimética: "+media);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida!!!");
                    
            }
        } while (opcao != 3);
    }
}
