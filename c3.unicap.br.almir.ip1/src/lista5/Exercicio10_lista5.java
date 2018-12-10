/*
Exercicio :
Faça um programa para ler o tamanho de três segmentos de reta
e verificar se eles com eles podemos formar um triângulo. 
Para que isso ocorra, é necessário que cada segmento seja menor
que a soma dos dois outros segmentos. 
 */
package lista5;
import java.util.Scanner;
public class Exercicio10_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int rta1,rta2,rta3,validacao;
        
        //Recebe dados
        System.out.print("Reta1: ");
        rta1 = in.nextInt();
        System.out.print("Reta2: ");
        rta2 = in.nextInt();
        System.out.print("Reta3: ");
        rta3 = in.nextInt();
        
        // Processamento
        if (rta1+rta2 > rta3)
            System.out.println("Forma um triângulo.");
        else if (rta2+rta3 > rta1)
            System.out.println("Forma um triângulo.");
        else if (rta1+rta3 > rta2)
            System.out.println("Forma um triângulo.");
        else
            System.out.println("Não é possivel formar um triângulo.");
    }
}
