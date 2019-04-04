/*
Lista 1
6ª Questão: No colégio Minha Escolinha a média de um aluno em uma disciplina é 
calculada da seguinte forma: (primeira nota * 2 + segunda nota * 3) / 5. 
Faça um programa para ler a primeira e a segunda nota dos alunos de uma turma 
de 20 alunos, e calcular e exibir a  média  de  cada  aluno. O programa deve 
utilizar três vetores: um para as primeiras notas, um para as segundas notas e 
um outro para as médias
 */
package lista1;
import java.util.Scanner;
public class lista1_q6 {
    public static void main(String[] args) {
        double []nota1,nota2,media;
        nota1 = new double[20];
        nota2 = new double[nota1.length];
        media = new double[nota2.length];
        
        for (int i = 0; i < nota1.length; i++) {
            nota1[i] = (Math.random() * 10);
            nota2[i] = (Math.random() * 10);
            media[i] = (nota1[i]*2 + nota2[i]*3)/5;
        }
        
        showArray(nota1,nota2,media);
    }
    
    public static void showArray(double []gq1, double[]gq2, double[]m){
        System.out.print("Nota1: ");
        for (int i = 0; i < gq1.length; i++) {
             System.out.printf("%.2f ",gq1[i]);
            
        }
        System.out.println("}");
        
        System.out.print("Nota2: ");
        for (int i = 0; i < gq2.length; i++) {
             System.out.printf("%.2f ",gq2[i]);
            
        }
        System.out.println("}");
        
        System.out.print("Média: ");
        for (int i = 0; i < m.length; i++) {
             System.out.printf("%.2f ",m[i]);
            
        }
        System.out.println("}");
    }
}
