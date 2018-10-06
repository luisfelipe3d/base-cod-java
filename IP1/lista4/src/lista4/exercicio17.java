/*
17.
Faça um programa que leia quantas aulas foram ministradas
em uma turma em um semestre. Depois o programa lerá o número de 
faltas que um aluno teve. O programa deverá informar o percentual
de presença, e caso ele tenha sido maior que 25%, deve 
informar também que o aluno está reprovado por faltas. 
 */
package lista4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class exercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double presenca,qtd_aulas,qtd_faltas;
        
        //Lê as entradas qtd aulas e faltas
        System.out.println("Quantas aulas no semestre: ");
        qtd_aulas = in.nextInt();
        System.out.println("Quantas faltas teve o aluno: ");
        qtd_faltas = in.nextInt();
        //Calcula o percentual de presença
        presenca = qtd_faltas/qtd_aulas*100;
        if (presenca > 25)
            System.out.printf("O aluno tem: %.2f%%de falta e está reprovado por falta.\n",presenca);
        else
            System.out.printf("O aluno tem: %.2f%% de falta.\n",presenca);
        
    }
}
