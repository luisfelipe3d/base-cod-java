/*
Lista3
Almir
17.
No  curso  de  programação,  a  nota  final  de  um  estudante  é  
calculada  a  partir  de  seu  desempenho  em  três avaliações: um exame
intermediário que vale 30% da nota final, um trabalho prático que 
corresponde a 20% da nota final e um exame final que completa
os 50% restantes. Dadas as notas nas três avaliações, 
calcular e exibir a nota final. 
*/
package lista3;
import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double prova1,prova2,prova3,media;
        
        //Entrada
        System.out.println("Digite a nota: ");
        prova1 = in.nextDouble();
        System.out.println("Digite a nota: ");
        prova2 = in.nextDouble();
        System.out.println("Digite a nota: ");
        prova3 = in.nextDouble();
        
        //Processamento
        media = (3*prova1 + 2*prova2 + 5*prova3)/10;
        
        //Saida
        System.out.printf("Você ... %.0f\n",media);
        
    }
}
