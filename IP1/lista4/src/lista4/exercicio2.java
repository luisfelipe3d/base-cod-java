/*
Lista 4
Almir
2.
Faça um programa que leia dois valores, que serão o limite inferior e 
superior de um intervalo fechado. Assuma que o primeiro valor é menor
que o segundo. O programa lerá também um terceiro valor e informará 
se ele está dentro do intervalo ou não. 
 */
package lista4;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int num1,num2,range;
        
        //Entrada
        System.out.println("Digite um valor: ");
        num1 = in.nextInt();
        System.out.println("Digite um valor maior que o anterior: ");
        num2 = in.nextInt();
        System.out.println("Digite um valor qualquer: ");
        range = in.nextInt();
        
        //Processamento
        if (num1 < range && range < num2)
            System.out.println("O valor: "+range+ "está dentro do intervalo.");
        else
            System.out.println("O valor está fora do intervalo");
    }
}
