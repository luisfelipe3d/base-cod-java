/*
Exercicio:
Faça um programa para fazer conversão de dólar para real e vice-versa.
O programa deverá apresentar os seguintes subprogramas:

a) Função: para conveter real em dólar (1 real = 0,3 dólar). Esta função
receberá como parâmetro o valor em real a ser convertido e deverá calcular
e retornar para o programa o valor correspondente em dólar.
O programa principal se encerragará de exibir o resultado ao usuário.

b) Procedimento: para converter dólar em real (1 dólar = 3,25reais). Este
procedimento receberá como parâmetro o valor do dólar a ser convertido e deverá
calcular e exibir o valor correspondente em reais.
 */
package lista10;
import java.util.Scanner;

public class Exercicio1_lista10 {
    
    static double converteRealDolar(double valor){
        return valor / 3.75;
    }
    
    static void converteDolarReal(double valor){
        double real;
        real = valor *3.75;
        System.out.println("US$"+ valor + " = R$"+ real);
    }
    
    static void linha(){
        for (int i = 1; i<= 30; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op;
        double real;
        do {
            linha();
            System.out.println("Conversor de Moedas: ");
            System.out.println("1. Real para Dólar. ");
            System.out.println("2. Dólar para Real. ");
            System.out.println("3. Sair.");
            System.out.print("Opção: ");
            op = in.nextInt();
            linha();
            switch(op){
                case 1:
                    System.out.println("Digite valor: ");
                    real = in.nextDouble();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite valor: ");
                    real = in.nextDouble();
                    converteDolarReal(real);
                    break;
                case 3:
                    System.out.println("Fim Programa.");
                    break;
                default:
                    System.out.println("Opção inválida. ");
            }
        } while (op != 3);
    }
    
}
