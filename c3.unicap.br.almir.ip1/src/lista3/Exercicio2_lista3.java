/*
Exercicio :
Dado o valor da hora, calcular e exibir quantos minutos se passou desde 
o início do dia.  
 */
package lista3;
import java.util.Scanner;

public class Exercicio2_lista3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Set variables
        int hora,minutos;
        //Input
        System.out.println("Digite que horas são (24h): ");
        hora = in.nextInt();
        //Process
        minutos = hora*60;
        //output
        System.out.println("Se passaram "+minutos+" minutos");
    }
}
