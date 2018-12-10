/*
Exercicio :
Faça um programa em JAVA para ler um número inteiro N qualquer maior ou 
igual 1 e menor ou igual a 50, calcular e exibir o valor obtido pela 
multiplicação sucessiva de N por 2, enquanto o produto for menor que 250
(Nx2,Nx2x2,Nx2x2x2;etc.). O valor de N deve ser checado quanto a sua validade.
Caso o usário informe um valor fora da faixa, o programa deve informar por
meio de uma mensagem que o valor digitado não é válido e solicitar um novo
valor ae obter um valor válido.
*/
package lista8;
import java.util.Scanner;

public class Exercicio9_lista8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,cont=1;
        double aux;
        
        do {
            System.out.print("Digite um número entre 1/50: ");
            n = in.nextInt();
            if (n < 1 || n > 50)
                System.out.println("Número inválido.");
        } while (n < 1 || n > 50);
        
        do {
            aux = n * Math.pow(n, cont);
            if (aux <=250)
                System.out.println(""+aux);
            else
                System.out.println("Fim Programa");
            cont++;
        } while (aux <= 250);
    }
}
