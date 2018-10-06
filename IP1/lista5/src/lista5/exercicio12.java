/*
Lista 5
Almir
12.Faça um programa para ler os comprimentos dos três lados de um
suposto triângulo (A, B e C) e determinar, caso formem 
um triângulo, que tipo de triângulo tem, com base nos casos
abaixo.  Sendo A o maior dos lados, e B e C os outros dois.
Então: 
 Se A2 = B2+ C2, temos um triângulo retângulo; 
 Se A2> B2 + C2, temos um triângulo obtusângulo; 
 Se A2< B2 + C2, temos um triângulo acutângulo. 
 */
package lista5;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a,b,c;
        //Recebe os valores de A,B,C
        System.out.print("Digite A: ");
        a = in.nextDouble();
        System.out.print("Digite B: ");
        b = in.nextDouble();
        System.out.print("Digite C: ");
        c = in.nextDouble();
        //Elevando ao quadrado
        a = a*a;
        b = b*b;
        c = c*c;
        
        //Verifica se é um triangulo valido
        //Verifica qual tipo de triangulo
        if (a + b > c || b + c > a || c + a > b){
            if (b + c == a)
                System.out.println("Triângulo Retângulo.");
            else if (a > (b + c))
                System.out.println("Triângulo Obtusângulo.");
            else
                System.out.println("Triângulo Acutângulo.");
        } else
              System.out.println("Não é válido.");
        
        
    }
}
