/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;
import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int opcao;
        float num1,num2;
        do {
            System.out.println("Calculadora 1.0");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.println("Informe sua opção: ");
            opcao = in.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe número: ");
                    num1 = in.nextFloat();
                    num2 = in.nextFloat();
                    System.out.printf("Num1: %.2f , Num2: %.2f , Soma: %.2f\n\n",
                            num1,num2,soma(num1,num2));
                    break;
                case 2:
                    System.out.println("Informe número: ");
                    num1 = in.nextFloat();
                    num2 = in.nextFloat();
                    System.out.printf("Num1: %.2f , Num2: %.2f , Subtração: %.2f\n\n",
                            num1,num2,subtracao(num1,num2));
                    break;
                case 3:
                    System.out.println("Informe número: ");
                    num1 = in.nextFloat();
                    num2 = in.nextFloat();
                    System.out.printf("Num1: %.2f , Num2: %.2f , Multiplicação: %.2f\n\n",
                            num1,num2,multiplicacao(num1,num2));
                    break;
                case 4:
                    System.out.println("Informe número: ");
                    num1 = in.nextFloat();
                    num2 = in.nextFloat();
                    System.out.printf("Num1: %.2f , Num2: %.2f , Divisão: %.2f\n\n",
                            num1,num2,divisao(num1,num2));
                    break;
                case 5:
                    System.out.println("Fim do Programa.\n");
                    break;
            }
        } while (opcao != 5);
    }
    
    static float soma(float a, float b){
        return a+b;
    }
    
    static float subtracao(float a, float b){
        return a-b;
    }
    
    static float multiplicacao(float a, float b){
        return a*b;
    }
    
    static float divisao (float a, float b){
        return a/b;
    }
}
