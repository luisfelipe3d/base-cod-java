/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Exercicio19_Array_loiane {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double[] notas1 = new double [10];
        double[] notas2 = new double [notas1.length];
        double[] result = new double [notas1.length];
        
        //recebe notas1 notas2, e calcula média
        for(int i = 0; i<notas1.length; i++){
            System.out.printf("Aluno(%d),Nota1: ",i+1);
            notas1[i] = in.nextDouble();
            
            System.out.printf("Aluno(%d),Nota2: ",i+1);
            notas2[i] = in.nextDouble();
            
            result[i] = (notas1[i] + notas2[i]) / 2;
        }
        
        //mostra resultados
        System.out.println("Resultado = ");
        for (int i = 0; i<result.length; i++){
            System.out.printf("(%d)",i+1);
            System.out.print(result[i] >= 7 ? "Aluno Aprovado ": "Aluno Reprovado ");
            System.out.printf("- Nota %.2f\n",result[i]);
        }
        
    }
}
