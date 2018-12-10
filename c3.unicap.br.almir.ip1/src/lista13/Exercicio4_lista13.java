/*
Exercicio:
Faça um programa que contenha um procedimento que receba um ano calcule e exiba  
se este é ou não um ano bissexto. 
Exemplo: Entrada (Ano digitado pelo usuário) - 1996. 
Saída - 1996 é um ano Bissexto. 
Obs:Um ano é bissexto se ele for divisível por 400 ou se for divisível por 4 e 
não for por 100. 
Obs:O programa deverá permitir que o usuário faça quantas consultas desejar e 
só deverá terminar sua execução se o usuário solicitar. 
Obs:Toda entrada de dados deve ser feita no programa principal. 

 */
package lista13;
import java.util.Scanner;

public class Exercicio4_lista13 {
    
    static void isAnoBi(int ano){
        if ((ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0))
                System.out.println("Ano é bissexto");
        else
            System.out.println("Ano não é bissexto");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int ano,op;
        
        do {
            System.out.println("Calcula ano:");
            System.out.println("1. Verifica ano bissexo");
            System.out.println("2. Sair.");
            System.out.print("Opção: ");
            op = in.nextInt();
        } while (op != 1 && op != 2);
        
        switch (op){
            case 1:
                System.out.print("Ano: ");
                ano = in.nextInt();
                isAnoBi(ano);
                break;
            case 2:
                System.out.println("Fim program.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
