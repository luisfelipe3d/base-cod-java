/*
Exercicio :
Faça um programa em JAVA para ler um número inteiro N qualquer maior ou igual
1 e menor e igual 10, calcular e exibir os resultados da tabuada de N. Exemplo:
N = 6 . Tabuada : 6X1= 6; 6X2 = 12; 6X3 = 18;...; 6X10 = 60. O valor de n deve
ser checado quanto a sua validade. Caso o usuário informe um valor fora da faixa
o programa deve informar por meio de uma mensagem que o valor digitado não é
válido e solicitar outro até obter um valo válido.
*/
package lista8;
import java.util.Scanner;

public class Exercicio8_lista8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n,cont=1;
        
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            n = in.nextInt();
            if (n < 1 || n > 10)
                System.out.println("Valor digitado não é válido.");
        } while (n < 1 || n > 10);
        
        do {
            System.out.printf("%d X %d = %d\n",n,cont,(n*cont));
            cont++;
        } while (cont <= 10);
    }
}
