/*
Lista 4
Almir
10.A nota de um aluno em uma disciplina é a média aritmética das 
notas de suas duas avaliações parciais. Se a média do aluno for 
maior ou igual a sete, o aluno está aprovado. Caso contrário, 
o aluno está reprovado. Faça um programa para ler as notas das 
duas avaliações  parciais  e  calcular  a  média  de  um  aluno
em uma determinada disciplina e informar o seu estado final.
O programa deverá exibir a seguinte frase: O aluno obteve 
média _________ e está ______________. 
 */
package lista4;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        double nota1,nota2,media;
        
        //Entrada
        System.out.println("Digite sua nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite sua nota: ");
        nota2 = in.nextDouble();
        
        //Processamento
        media = (nota1+nota2)/2;
        if(media >= 7){
            System.out.printf("Sua nota foi %.2f e está Aprovado.\n",media);
        } else {
            System.out.printf("Sua nota foi %.2f e está Reprovado.\n",media);
        }
    }
}
