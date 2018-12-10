/*
Exercicio :
Faça um programa para ler três números reais e determinar
qual o maior deles. Considere que os três números são
diferentes entre si. 
 */
package lista5;
import java.util.Scanner;
public class Exercicio8_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2,num3;
        
        //Recebe os dados
        System.out.println("Número1: ");
        num1 = in.nextDouble();
        System.out.println("Número2: ");
        num2 = in.nextDouble();
        System.out.println("Número3: ");
        num3 = in.nextDouble();
        //Processamento
        if (num1 > num2 && num1 > num3)
            System.out.println("O maior número: "+num1);
        else if (num2 > num3)
            System.out.println("O maior número: "+num2);
        else
            System.out.println("O maior número: "+num3);
    }
}
