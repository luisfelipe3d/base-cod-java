/*
Exercicio :
Faça um programa para, dado o valor dos coeficientes, calcular e exibir
o valor da raiz de uma equação do 1o grau da forma AX+B=0. 
Lembre-se que o valor de A não pode ser zero. 
 */
package lista4;
import java.util.Scanner;

public class Exercicio12_lista4 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double a,b,x;
        
        //Entrada
        System.out.println("Informe o valor de Ax: ");
        a = in.nextDouble();
        System.out.println("Informe o valor de b: ");
        b = in.nextDouble();
        
        //Processamento
        x = (-b)/a;
        
        //Saida
        System.out.printf("A raiz da função é: %.2f\n",x);
    }
}
