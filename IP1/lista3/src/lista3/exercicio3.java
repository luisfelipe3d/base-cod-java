/*
Lista3
Almir
3.
Escreva  um  programa  que  solicite  um  determinado  número  de  
segundos  e,  em  seguida,  indique  quantas horas, minutos e segundos 
esse valor representa.  
*/
package lista3;
import java.util.Scanner;
/*
Nota: Nesse programa o número de horas é calculado através do quociente 
dsegundos restantes (os quais podem ser obtidos através do resto da
divisão anterior) dividido pelo número de segundos contidos em um minuto(60).
Oa divisão inteira entre o número total de segundos e o número de segundos
contidos em uma hora (3600).
O número de minutos é calculado através do quociente da divisão dos 
segundos restantes (os quais podem ser obtidos através do resto da
divisão anterior) dividido pelo número de segundos contidos em um minuto(60).
O número de segundos é simplesmente obtido pelo resto da divisão 
entre o número total de segundos e 60 (pois são apenas aqueles segundos
que não cabem num minuto).
*/
public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int segundos,entrada,minutos,horas;
        //Entrada
        System.out.println("Digite um número em segundos: ");
        entrada = in.nextInt();
        //Processamento
        horas = entrada/3600;
        minutos = (entrada%3600)/60;
        segundos = entrada%60;
        //saida
        System.out.println("Hora: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);
        
        }
    }

