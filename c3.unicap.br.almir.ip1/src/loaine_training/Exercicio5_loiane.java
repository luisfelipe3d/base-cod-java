/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançanda por aluno e apresentar: 
A mensagem "Aprovado" se o a média do aluno for maior ou igual 7.
A mensagem "Reprovado" se a média for menor do que 7;
A mensagem "Aprovado com Distinção" se a média for igual 10.
*/
package loaine_training;
import java.util.Scanner;

public class Exercicio5_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        double nota1,nota2,media=0;
        
        System.out.println("Nota1: ");
        nota1= in.nextDouble();
        
        System.out.println("Nota2: ");
        nota2= in.nextDouble();
        
        media = (nota1+nota2)/2;
        
        if (media >= 7 && media < 10)
            System.out.println("Aprovado.");
        else if (media < 7)
            System.out.println("Reprovado.");
        else
            System.out.println("Aprovado com Distinção");
    }
}
