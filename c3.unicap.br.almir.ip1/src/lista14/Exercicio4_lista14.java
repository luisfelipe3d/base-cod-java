/*
Exercicio:
Faça um programa para ler dois números X (real) e Y (inteiro e maior ou 
igual a zero) e calcular XY. Para calcular XY, o programa deve utilizar uma
função recursiva. Lembre-se que: 
POWER (X,Y) = 1, se Y = 0 ; X se Y = 1 ; X*POWER (X,Y-1)
*/
package lista14;
import java.util.Scanner;

public class Exercicio4_lista14 {
    static double potencia(double num, double expo){
        if (expo == 0)
            return 1;
        else if (expo == 1)
            return num;
        else
            return num*potencia(num,expo-1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double num, expo;
        
        System.out.println("Num: ");
        num = in.nextDouble();
        System.out.println("Expoente: ");
        expo = in.nextDouble();
        
        System.out.println("Resul: "+potencia(num,expo));
        
    }
}
