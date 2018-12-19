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
public class Exercicio16_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] vetA = new int [10];
       
            
        for (int i = 0; i<vetA.length; i++){
            System.out.print("Entre com o valor: ");
            vetA[i] = in.nextInt();
        }
        
        int somaMenor15=0;
        int qtd15=0;
        int somaMaior15=0;
        int qtdMaior15=0;
        
        for(int i = 0; i<vetA.length; i++){
            if (vetA[i] < 15)
                somaMenor15 += vetA[i]; // somaMenor15 = somarMenor15 + vetA[i];
            else if(vetA[i] == 15)
                qtd15++;
            else{
                qtdMaior15++;
                somaMaior15+= vetA[i];
            }
        }
        
        System.out.print("Vetor A: ");
        for (int i : vetA) {
            System.out.print(i+", ");
        }
        System.out.println("");
        
        System.out.println("Qtd números == 15: "+qtd15);
        System.out.println("Qtd números maiores do que 15: "+qtdMaior15);
        System.out.println("Soma dos números maiores que 15: "+somaMaior15);
        System.out.println("Média dos números maiores que 15: "+somaMaior15/qtdMaior15);
        System.out.println("Soma dos números menores que 15: "+somaMenor15);
          
    }
}
