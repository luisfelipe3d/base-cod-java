/*
A divisão de dois números inteiros pode ser feita através de subtrações 
sucessivas. Escreva um programa em Java para receber dois números inteiros e 
chamar uma função recursiva Divide(numA, numB) que calcule a divisão de dois 
inteiros. Toda entrada e saída deve ser realizada no programa principal e o 
programa deverá permitir que o usuário faça quantas consultas desejar e só 
deverá terminar sua execução se o usuário solicitar. 
 */
package prova2GQ;
import java.util.Scanner;

public class questao1_prova2gq {

    static int divide(int x, int y){
        if (x <= y)
            return 1;
        else
            return 1 + divide(x-y, y); 
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num1,num2;
        boolean op = false;
        do{
            System.out.println("Digite inteiro: ");
            num1 = in.nextInt();
            System.out.println("Digite inteiro: ");
            num2 = in.nextInt();
            if (num2 == 0)
                System.out.println("Divisão por zero.");
            else{
                System.out.println(num1+" / "+num2+" = "+divide(num1,num2));
                System.out.println("Deseja continuar (True/False): ");
                op = in.nextBoolean();
            }
        } while (op);
    }
    
}
