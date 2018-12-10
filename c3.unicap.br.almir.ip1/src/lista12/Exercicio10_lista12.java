/*
Exericicio:
Zequinha tem 1,50 m e cresce 2 centímetros por ano, enquanto Juquinha tem 
1,10m e cresce 3 centímetros por ano.Faça uma função que calcula e retorna a  
quantidade de anos necessária para que Juquinha seja maior que Zequinha.Essa
função recebe como parâmetros os quatro valores associados aos dados dos garotos. 
*/
package lista12;
import java.util.Scanner;

public class Exercicio10_lista12 {
    
    static double altura(double altura1, double txa, double altura2, double tx2){
        int qtd_anos=1;
        double zeq = altura1+txa;
        double juq = altura2+tx2;
        while (zeq > juq){
            zeq = zeq + txa;
            juq = juq + tx2;
            qtd_anos++;
        }
        return qtd_anos;
    }
    
    public static void main(String[] args) {
        System.out.println("Qtd anos: "+altura(1.5, 0.02, 1.1, 0.03));
    }
}
