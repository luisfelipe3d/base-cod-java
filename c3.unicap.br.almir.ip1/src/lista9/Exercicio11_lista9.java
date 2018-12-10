/*
Exericio :
Dada um país A, com  5.000.000 de habitantes e uma taxa de natalidade de 
3% ao ano, e um país B com 7.000.000 e uma taxa de natalidade de 2% ao ano,
construa um programa JAVA que calcule quanto anos serão necessários para
que a população do país A ultrapasse a população do país B.
*/
package lista9;

public class Exercicio11_lista9 {
    public static void main(String[] args) {
        double popA= 5000000,popB=7000000;
        int i;
        for (i = 1;popA<=popB; i++){
            popA = popA + (1.03*popA);
            popB = popB + (1.02*popB);
        }
        System.out.println("Qtd de ano: "+i);
        System.out.println("PopA: "+popA);
        System.out.println("PopB: "+popB);
    }
}
