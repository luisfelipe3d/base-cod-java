/*
Exercicio:
Em um lugar chamado Paraíso Feliz, para votar em uma eleição, uma pessoa 
deve ter idade entre 18 e 90 anos. No Paraíso Feliz moram apenas 100 pessoas.
a) Faça um programa em JAVA para ler a idade de cada pessoa e determinar se 
esta pessoa pode ou não votar. Para cada pessoa, o programa deve exibir a 
seguinte frase: Esta pessoa tem ________ anos e [pode / não pode] votar.
b) O programa deve ainda calcular quantos eleitores existem no Paraíso Feliz 
e exibir a seguinte mensagem: No Paraíso Feliz existem ___________ eleitores. 
 */
package lista9;
import java.util.Scanner;

public class Exercicio3_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int idade,eleitores=0;
        
        for (int i =1; i<=100; i++){
            System.out.print("Informe sua idade: ");
            idade = in.nextInt();
            if (idade >= 18 && idade <= 90){
                System.out.println("Esta pessoa tem "+idade+" e pode votar.");
                eleitores++;
            }
            else
                System.out.println("Esta pessoa tem "+idade+" e não pode votar.");
        }
        System.out.println("No Paraíso Feliz existem"+eleitores+" eleitores");
        
    }
}
