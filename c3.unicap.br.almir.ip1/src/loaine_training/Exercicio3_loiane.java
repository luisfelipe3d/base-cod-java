/*
Faça um programa que verifique se a letra digitada é "F" ou "M".
Conforme a letra escrever: F- Feminino, M - Masculino, Sexo inválido.
 */
package loaine_training;
import java.util.Scanner;

public class Exercicio3_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Entre com uma letra (F/M): ");
        String input = in.next();
        
        if (input.equalsIgnoreCase("f"))
            System.out.println("F - Feminino.");
        else if (input.equalsIgnoreCase("m"))
            System.out.println("M - Masculino. ");
        else
            System.out.println("Sexo inválido. ");
    }
}
