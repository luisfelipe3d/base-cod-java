/*
8.Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
a fórmula: vol = 3.14159*R^2*altura.Sabe-se que são fornecidos os 
valores do raio e a altura da lata.
Dica: usar a biblioteca math.h. 
*/
package lista3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class exercicio8 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double raio,altura,vol;
        
        //Entrada
        System.out.println("Informe o valor do Raio: ");
        raio = in.nextDouble();
        System.out.println("Informe o valor da Altura: ");
        altura = in.nextDouble();
        
        // Processamento
        vol = Math.PI*(raio*raio)*altura;
        
        //Saida
        System.out.printf("O volume da lata é: %.2f \n",vol);
    }
}
