/*
Exercicio:
Faça um programa que receba uma hora formada por hora e minutos 
(um número ponto-flutuante), calcule e mostre a hora digitada
apenas em minutos. Ex.: Para quatro e meia, digita-se 4.30. 
 */
package lista3;
import java.util.Scanner;

public class Exercicio4_lista3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Definir variáveis
        int horas;
        double entrada,minutos,aux;
        //Entrada
        System.out.println("Digite que horas são(4.30): ");
        entrada = in.nextDouble();
        //Processamento
        horas = (int) entrada; // Pegando apenas a parte inteira da entrada
        
        minutos = (entrada-horas); // Pegando a parte decimal
        aux = (horas*60) + (minutos*100);
        //Saida
        //OBS: Println mostra 0.2999998,isso ñ acontece com o printf.
        System.out.printf("Minutos: %.0f\n",aux);
    }
}
