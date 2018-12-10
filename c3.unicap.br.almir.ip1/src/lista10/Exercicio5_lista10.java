/*
Exercicio:
Faça um procedimento para calcular o valor aproximado de e através da série: 
e = 1 + 1/1! + 1/2! + 1/3! + 1/4!...
OBS.1: O número de termos da série deverá ser fornecido pelo usuário no programa
principal e passado ao procedimento como parâmetro. 
OBS.2: Para calcular o fatorial de um número, implemente em seu programa a 
função fatorial, que deve receber como parâmetro o número cujo fatorial 
deseja-se calcular.
 */
package lista10;
import java.util.Scanner;

public class Exercicio5_lista10 {
    static void linha(){
        for (int i = 1; i<= 25; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static double fat(double n){
        double f = 1;
        if (n < 0)
             return 0;
        else if (n == 0)
            return 1;
        else
            for (int i = 1 ; i <= n; i++)
                f = f * i;
            return f;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long termos;
        double e=0,k=1;
        linha();
        System.out.println("e = 1+(1/1!)+(1/2!)+(1/3!)...");
        System.out.print("QTD Termos: ");
        termos = in.nextLong();
        System.out.print("e: ");
        for (int i = 1; i<= termos; i++){
            e =  (1 + (1/fat(i)));
            System.out.printf("%.4f, ",e);
        }
        System.out.println("");
        linha();
    }
}
