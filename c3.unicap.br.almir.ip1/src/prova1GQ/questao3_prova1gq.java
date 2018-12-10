/*
Questão4
 */
package prova1GQ;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class questao3_prova1gq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade,qtd_pessoas=0;
        double peso,media=0 ;
        for (int i = 0;i<7;i++){
            do{
                System.out.println("Digite idade: ");
                idade = in.nextInt();
            } while (idade <=0);
            do{
                System.out.println("Digite peso: ");
                peso = in.nextDouble();
            } while (peso <= 0);
            if (peso >90)
                qtd_pessoas++;
            media = media+idade;
            
        }
        media = media/7;
        System.out.println("Qtd de pessoas + 90KG: "+qtd_pessoas);
        System.out.println("Media das idades: "+media);
    }
    
}
