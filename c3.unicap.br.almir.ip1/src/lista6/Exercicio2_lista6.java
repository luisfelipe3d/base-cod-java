/*
Exercicio :
Faça um programa em JAVA que receba três números em ordem
decrescente. O programa deve verificar se os números recebidos
estão realmente em ordem decrescente. Caso positivo, o programa
deve então receber um quarto número que não siga a regra de ordem
decrescente e deve exibir os quatro números recebidos em ordem 
crescente. Se os três primeiros números recebidos não estiverem
em ordem decrescente, o programa deverá apenas exibir uma mensagem
de erro! 
 */
package lista6;
import java.util.Scanner;

public class Exercicio2_lista6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2,num3,num4;
       
        //Recebe os 3 números
        System.out.println("Digite três números em ordem decrescente");
        System.out.println("Num: "); // maior
        num1 = in.nextDouble();
        System.out.println("Num: "); // meio
        num2 = in.nextDouble();
        System.out.println("Num: "); // menor
        num3 = in.nextDouble();
        
        
        if (num1 > num2 && num2 > num3){
            System.out.println("Num:");
            num4 = in.nextDouble();
            if (num4 >= num3){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num4);
                System.out.println(num3);
            } else if (num4 >= num2){
                System.out.println(num1);
                System.out.println(num4);
                System.out.println(num2);
                System.out.println(num3);
            
            } else if (num4 >= num1){
                System.out.println(num4);
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
   
            }
            
        } else
            System.out.println("ERRO!");
    }
}
