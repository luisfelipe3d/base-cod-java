/*
Exercicio :
Faça um procedimento que receba dois parâmetros inteiros, n e x, que 
correspondem, respectivamente, a quantidade de termos da série definida abaixo 
e ao valor do primeiro termo, e que imprima a seqüência mostrada e o resultado 
da soma dos n termos: s = x – x3 / 3! + x5 / 5! + x7 / 7! + x9 / 9! + ..
 */
package lista12;
import java.util.Scanner;

public class Exercicio2_lista12 {
    
    static int fatorial(int fat){
        int f = 1;
        if (fat == 0 || fat == 1)
            return 1;
        else if (fat < 0)
            return 0;
        else{
            for (int i = 1 ; i <= fat; i++){
                f = f * i;
            }
        }
        return f;
    }
    
    static double potencia(double base, double expo){
        double pot=1;
        for (int i = 1 ;i<=expo; i++)
            pot = pot * base;
        return pot;
    }
    
    static void funcao(int n, int x){
        double s;
        for (int i = 1; i<= n; i++)
            for (int j = 3; j<=n; j=j+2){
                s = x - potencia(x,j)/fatorial(j);
                System.out.print(s+" + ");
            }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int qtd_termos,num;
        
        System.out.print("Qtd termos: ");
        qtd_termos = in.nextInt();
        System.out.print("Num: ");
        num = in.nextInt();
        //contador de termos
        funcao(qtd_termos,num);
        }
    }

