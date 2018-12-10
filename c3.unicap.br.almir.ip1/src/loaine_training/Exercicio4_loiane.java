/*
Faça um programa que verifique se a letra digitada é vogal ou consoante.
 */
package loaine_training;
import java.util.Scanner;

public class Exercicio4_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite vogal ou consoante: ");
        String input = in.next();
        /*if (input.equalsIgnoreCase("a")||input.equalsIgnoreCase("e")||
                input.equalsIgnoreCase("i")||input.equalsIgnoreCase("o")||
                input.equalsIgnoreCase("u"))
            System.out.println("Vogal.");
        else
            System.out.println("Consoante");
        */
        if (input.length() > 1)
            System.out.println("Possui mais de uma letra. ");
        else{
            switch(input){
                case "a": System.out.println("Vogal."); break;
                case "e": System.out.println("Vogal."); break;
                case "i": System.out.println("Vogal."); break;
                case "o": System.out.println("Vogal."); break;
                case "u": System.out.println("Vogal."); break;

                case "A": System.out.println("Vogal."); break;
                case "E": System.out.println("Vogal."); break;
                case "I": System.out.println("Vogal."); break;
                case "O": System.out.println("Vogal."); break;
                case "U": System.out.println("Vogal."); break;
                default: System.out.println("Consoante.");
                }
            }
        
    }
}
