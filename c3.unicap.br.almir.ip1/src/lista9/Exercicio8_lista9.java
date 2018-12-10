/*
Exercicio :
Faça um programa em JAVA para ler altura de 10 pessoas calcular e exibir
a média das alturas lidas.
 */
package lista9;
import java.util.Scanner;

public class Exercicio8_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double altura, media = 0;
        
        for (int i = 1; i<= 10; i++){
            System.out.println("Altura: ");
            altura = in.nextDouble();
            media = media + altura;
            
        }
        System.out.println("Altura média: "+media/10);
    }
}
