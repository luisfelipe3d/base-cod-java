/*
Exercicio:
Na Usina de Angra dos Reis, os técnicos analisam a perda de massa de um 
material radioativo. Sabendo-se que este perde 25% de sua massa a cada 
30 segundos, criar uma função que retorne o tempo necessário para que a massa
deste material se torne menor que 0,10 grama. A função recebe como parâmetro a 
massa (em gramas) do material. 
*/
package lista12;
import java.util.Scanner;

public class Exercicio11_lista12 {
    
    static void segTomin(int segundos){
        int horas,minutos,convert,segundo;
        convert = (segundos * 30);
        horas = convert / 3600;
        minutos = (convert - (horas*3600))/60;
        segundo = convert - (horas*3600) - (minutos*60);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundo);
        
    }
    
    static int meiaVida(double gramas){
        int cont_s=0; // cada unidade do contador corresponde a 30 segundos
        while(gramas > 0.1){
            gramas *= 0.75;
            cont_s++;
        }
        return cont_s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Qtd de material radioativo: ");
        int en = in.nextInt();
        int a = meiaVida(en);
        segTomin(a);
    }
}
