/*
lista 1
7ª Questão: Altere o programa da questão anterior para que o mesmo calcule
a média da turma. O novo programa deve calcular e exibir quantos alunos tiveram
média abaixo da média da turma.
 */
package lista1;
import java.util.Scanner;
public class lista1_q7 {
    public static void main(String[] args) {
        double []nota1,nota2,media;
        double media_turma=0;
        nota1 = new double[20];
        nota2 = new double[nota1.length];
        media = new double[nota2.length];
        int cont=0;
        
        
        for (int i = 0; i < nota1.length; i++) {
            nota1[i] = (Math.random() * 10);
            nota2[i] = (Math.random() * 10);
            media[i] = (nota1[i]*2 + nota2[i]*3)/5;
            media_turma = media_turma + media[i];
        }
        media_turma = media_turma/media.length;
        
        for (int i = 0; i < media.length; i++) {
             if(media[i] < media_turma){
                 cont++;
             }  
        }
        
        
        showArray(nota1,nota2,media);
        System.out.printf("Média da turma: %.2f\n",media_turma);
        System.out.println("Alunos abaixo da média da turma: "+cont);
    }
    
    public static void showArray(double []gq1, double[]gq2, double[]m){
        System.out.print("Nota1: ");
        for (int i = 0; i < gq1.length; i++) {
             System.out.printf("%.2f ",gq1[i]);
            
        }
        System.out.println("}");
        
        System.out.print("Nota2: ");
        for (int i = 0; i < gq2.length; i++) {
             System.out.printf("%.2f ",gq2[i]);
            
        }
        System.out.println("}");
        
        System.out.print("Média: ");
        for (int i = 0; i < m.length; i++) {
             System.out.printf("%.2f ",m[i]);
            
        }
        System.out.println("}");
    }
}
