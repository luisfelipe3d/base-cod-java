/*
Exercicio :
Em um lugar chamado Paraíso Feliz, para votar em uma equipe em uma eleição,
uma pessoa deve ter idade entre 18 e 90 anos. No Paraíso Feliz moram 100
pessoas. Faça um programa em JAVA para ler a idade de cada pessoa e determinar
se esta pessoa pode ou não votar. Para cada pessoa, o programa deve exibir a
seguinte frase. "Esta pessoa tem  _____ anos e [pode/não pode] votar."
 */
package lista7;
import java.util.Scanner;

public class Exercicio10_lista7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pessoas = 1, idade;
        
        while(pessoas <= 100){
            System.out.println("Informe sua idade: ");
            idade = in.nextInt();
            if(idade < 18 || idade > 90){
                System.out.println("Esta pessoa tem "+idade+" anos e não "
                        + "pode votar.");
            } else{
                System.out.println("Esta pessoa tem "+idade+" anos e pode"
                        + " votar.");
            }
            pessoas++;
        }
    }
}
