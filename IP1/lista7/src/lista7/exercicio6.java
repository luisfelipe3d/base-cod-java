/*
Lista 7
Almir
6.Faça um programa em JAVA para escrever o conjunto das
cinco primeiras tabuadas (tabuada do 1, tabuada 2, ..., 
tabuada do 5), parando a tela depois de cada uma ser escrita. 
 */
package lista7;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1,j;
        
        while (i <= 5){
            j = 1;
            while(j <= 10){
                System.out.println(i+" X "+j+" = "+(i*j));
                j++;
            } 
            i++;
            System.out.println("Digite enter para continuar: ");
            in.nextLine();
            
        }
        
    }
}
