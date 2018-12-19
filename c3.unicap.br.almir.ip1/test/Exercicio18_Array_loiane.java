/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Exercicio18_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] idades = new int [10];
        
        for(int i = 0; i<idades.length; i++){
            System.out.print("Entre com idade: ");
            idades[i] = in.nextInt();
        }
        int menor = idades[0];
        int indexMenor = 0;
        int maior= idades[0];
        int indexMaior = 0;
        for (int i = 1; i<idades.length; i++){
            if (idades[i] > maior){
                maior = idades[i];
                indexMaior = i;
            }
            else if (idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            }
        }
        
        System.out.print("Vetor de idades: ");
        for (int idade : idades) {
            System.out.print(idade+", ");
        }
        System.out.println("");
        
        System.out.println("Maior idade do grupo: "+maior);
        System.out.println("Índice maior idade: "+indexMaior);
        System.out.println("Menor idade do grupo: "+menor);
        System.out.println("Índice menor idade: "+indexMenor);
    }
}
