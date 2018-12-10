/*
Exercicio :
Faça um programa para, dado o valor dos coeficientes, calcular 
e exibir o valor das raízes reais de uma equação do 2o grau da 
forma AX2+BX+C=0. 
 Δ = B² - 4AC
Se Δ < 0, não existe raiz real
Se Δ = 0, X1=X2 = -B/2A
Se Δ > 0, X1 = -B + SQRT(Δ)/2A ; X2 = -B - SQRT(Δ)/2A
 */
package lista4;
import java.util.Scanner;

public class Exercicio14_lista4 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double delta,b,a,c,x1,x2;
        
        //Entrada
        System.out.println("Programa para calcular AX²+BX+C = 0");
        System.out.println("Digite o valor de AX: ");
        a = in.nextDouble();
        System.out.println("Digite o valor BX: ");
        b = in.nextDouble();
        System.out.println("Digite o de C: ");
        c = in.nextDouble();
        
        //Processamento
        
        delta = Math.pow(b, 2) - (4*a*c) ;
        x1 = (-b + Math.sqrt(delta))/2*a;
        x2 = (-b - Math.sqrt(delta))/2*a;
        
        if (delta > 0) {
            System.out.printf("O valor de x1: %.2f \n", x1);
            System.out.printf("O valor de x2: %.2f \n", x2);
        } else if (delta == 0) {
            System.out.printf("O valor de X1 = X2 = %.2f\n",(-b/2*a));
        } else {
            System.out.println("Não existe raízes reais.");
        }
    }
}
