/*
Exercicio :
Faça um programa que leia o total de pontos de três
finalistas de um campeonato de pingue-pongue e exiba
a colocação da seguinte forma: 
•Vencedor:  
XXXX pontos 
•Segundo Colocado:  
XXXX pontos 
•Terceiro Colocado: 
XXXX pontos.
 */
package lista5;
import java.util.Scanner;

public class Exercicio13_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fina1,fina2,fina3,maior=0,menor, meio=0;
        
        System.out.println("Total pontos finalista 1: ");
        fina1 = in.nextInt();
        System.out.println("Total pontos finalista 2: ");
        fina2 = in.nextInt();
        System.out.println("Total pontos finalista 3: ");
        fina3 = in.nextInt();
        
        if(fina1 > fina2 && fina1 > fina3){
            maior = fina1;
            if (fina2 > fina3){
                meio = fina2;
                menor = fina3;
            } else{
                meio = fina3;
                menor = fina2;
            }
            
        }else if(fina2 > fina3){
            maior = fina2;
            if(fina1 > fina3){
                meio = fina1;
                menor = fina3;
            }else{
                meio = fina3;
                menor = fina1;
            }
        }else{
            maior = fina3;
            if(fina2 > fina1){
                meio = fina2;
                menor = fina1;
            }else{
                meio = fina1;
                menor = fina2;
                }
        }
        
        System.out.println("Vencedor: "+maior);
        System.out.println("Segundo: "+meio);
        System.out.println("Terceiro: "+menor);
        }
    }

