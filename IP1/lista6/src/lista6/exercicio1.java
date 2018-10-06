/*
Lista 5
Almir
1.Faça um programa em JAVA
que receba um valor para x, calcule e imprima o valor de
f(x) de acordo com as opções abaixo: 
•f(x) = 1, se 0 < x <= 1 
•f(x) = 2, se 1 < x <= 2 
•f(x) = x^2, se 2 < x <= 3 
•f(x) = x^3, se x > 3 
•Se não estiver em nenhuma das opções acima, exibir mensagem
de erro informando ao usuário que é impossível 
calcular f(x).
 */
package lista6;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double x;
        //Recebe x
        System.out.println("Digite valor para X: ");
        x = in.nextDouble();
        if (x >= 0 && x <= 1)
            x = 1;
        else if (x > 1 && x <= 2)
            x = 2;
        else if (x > 2 && x <= 3)
            x = x*x;
        else if (x > 3)
            x = x*x*x;
        else
            System.out.println("Opção inválida.");
        System.out.println("Valor de X: "+x);
    }
    
}
