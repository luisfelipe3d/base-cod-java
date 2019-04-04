/*
Lista 1
10ª Questão: Dado um polinômio P(x) da forma P(x) = a0xn + a1xn-1 + ... + an-1x + an,
onde a0, a1, ..., an são números reais, designando os coeficientes do polinômio.  
Faça um programa para ler N (grau do polinômio –valor de 1 a 10), os coeficientes 
a0, a1, ..., an e uma seqüência de 10 valores para x, e calcular e exibir o valor  
de P(x) para cada valor de x. Utilize um vetor para armazenar os valores dos 
coeficientes e outro para armazenar os valores de x.
 */
package lista1;
import java.util.Scanner;
public class lista1_q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double []an,valor_x;
        valor_x = new double[10];
        int n;
        double funcao=0;
        do{
            System.out.print("Entre com o grau do polinômio(1/10): ");
            n = in.nextInt();
            if (n < 1 || n > 10){
                System.out.println("Valor do grau incorreto.(1/10)");
            } // defino o grau do polinômio
        } while(n < 1 || n > 10);
        
        an = new double[n+1];
       
        for(int i = 0; i<an.length; i++){
            an[i] = (Math.random() *5); // gera números até 5
        } // valores dos coeficientes
        
        for(int i = 0; i<valor_x.length; i++){
            //System.out.print("Digite valor X: ");
            valor_x[i] = (Math.random() * 10);
            funcao = valor_x[i];
            for(int j = 0; j < n; j++){
                funcao = funcao + an[i] * Math.pow(valor_x[i], n-j);
                System.out.printf("P(%d) = %.2f\n",j,funcao);
            }
        } // valores de x
        
        
        
    }
}
