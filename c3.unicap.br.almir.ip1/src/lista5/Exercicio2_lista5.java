/*
Exercicio :
A nota de um aluno em uma disciplina é a média ponderada das notas 
de suas duas avaliações parciais. A primeira avaliação parcial  
tem peso 2 e a segunda avaliação parcial tem peso 3. Se a média
do aluno for maior ou igual a sete, o aluno está aprovado. Se a 
média do aluno for menor que três, o aluno está reprovado. Se a 
média do aluno for menor que sete e maior ou igual a três, o aluno
irá para a recuperação. Faça um programa para ler as notas das duas
avaliações parciais e calcular a média de um aluno em uma determinada
disciplina e informar o seu estado final. O programa deverá exibir a
seguinte frase: 
O aluno obteve média _________ e está ______________
 */
package lista5;
import java.util.Scanner;

public class Exercicio2_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1,nota2,media;
        //String en = new String(System.in);
        
        //Recebe notas
        System.out.print("Nota1: ");
        nota1 = in.nextDouble();
        System.out.print("Nota2: ");
        nota2 = in.nextDouble();
        
        //Calcula a media
        media = (2*nota1 + 3*nota2)/5;
        //verifica a condições
        if (media >= 7)
            System.out.printf("O aluno obteve media %.2f e está "
                    + "Aprovado.\n",media);
        else if (media <7 && media >=3)
            System.out.printf("O aluno obteve media %.2f e está em "
                    + "Recuperação.\n",media);
        else
            System.out.printf("O aluno obteve media %.2f está "
                    + "Reprovado.",media);
    }
}
