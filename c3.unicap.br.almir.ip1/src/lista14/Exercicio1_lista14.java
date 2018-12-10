/*
Exercicio:
Faça um programa para ler um número N inteiro e maior que zero, calcular e 
imprimir a soma dos números inteiros de 0 a N. Para calcular a soma o programa
deve utilizar uma função recursiva. Dica: soma (n) = n + soma (n-1). 
*/
package lista14;
import java.util.Scanner;

public class Exercicio1_lista14 {
    
    static int soma(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n + soma(n - 1);
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num;
        
        do{ 
            System.out.print("Num: ");
            num = in.nextInt();
            if (num <= 0)
                System.out.println("Valor incorreto. ");
        } while (num <=0);
        
        System.out.printf("Somatório de 0 a %d: ",num);
        System.out.printf("%d, ",soma(num));
        System.out.println("");
        
        
    }
}
