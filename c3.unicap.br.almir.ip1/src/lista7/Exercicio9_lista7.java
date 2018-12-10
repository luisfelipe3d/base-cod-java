/*
Exercicio :
A nota de um aluno em uma disciplina é a média aritmética das notas de suas 
avaliações parciais. Se a média do aluno for maior ou igual a sete, o aluno
será aprovado. Se a média do aluno for menor que três, o aluno está reprovado.
Se a média do aluno for menor que sete e maior ou igual a três, o aluno
irá para a recuperação. Faça um programa em JAVA para ler as notas das duas
avalições parciais e calcular a média dos alunos de uma determinada disciplina
e informar a situação final de cada aluno. Para cada aluno, o programa deverá
exibir a seguinte frase: "O aluno obteve média_____ e está ______. OBS: A 
turma possui trinta alunos.
 */
package lista7;
import java.util.Scanner;

public class Exercicio9_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int cont;
        double nota1,nota2,media;
        
        cont=1;
        while (cont <=30){
            System.out.print("Nota1: ");
            nota1 = in.nextDouble();
            System.out.print("Nota2: ");
            nota2 = in.nextDouble();
            media = (nota1+nota2)/2;
            
            if (media >= 7)
                System.out.printf("O aluno obteve média: %.2f e está "
                        + "Aprovado.\n",media);
            else if (media < 3)
                System.out.printf("O aluno obteve média: %.2f e está "
                        + "Reprovado.\n",media);
            else if (media < 7 && media >= 3)
                System.out.printf("O aluno obteve média: %.2f e está"
                        + " em Recuperação.\n",media);
            cont++;
        }
    }
}
