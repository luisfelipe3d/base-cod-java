/*
Exercicio :
Faça um programa em JAVA para solicitar dois números inteiros (X e Y)
ao usuário e calcular e exibir XY. OBS.: Para a resolução desta questão não
é permitido utilizar a função matemática pow.
Dica: XY = X * X * X ... * X * X
 Y vezes
*/
package lista9;
import java.util.Scanner;

public class Exercicio16_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double x,y,i,total=1;
        
        System.out.print("Base: ");
        x = in.nextDouble();
        System.out.print("Expoente: ");
        y = in.nextDouble();
        
        if (y == 1)
            total = x;
        else if (y == 0)
            total = 1;
        else{
            for (i = 0; i< y; i++)
                total *= x;

        }
        System.out.println("Total: "+total);
    }
}
