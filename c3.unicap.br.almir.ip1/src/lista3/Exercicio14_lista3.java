/*
Exercicio: 
Sabe-se que para iluminar de maneira correta os cômodos de uma casa, 
para cada m2, deve-se usar 15 W de potência. Sendo fornecidos as dimensões
de um cômodo (em metros), calcule e exiba a sua área (em m2) e a 
potência de iluminação que deverá ser utilizada.
 */
package lista3;
import java.util.Scanner;

public class Exercicio14_lista3 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int comprimento,largura,dimensoes,potencia;
        
        //Entrada
        System.out.println("Informe o comprimento do cômodo: ");
        comprimento = in.nextInt();
        System.out.println("Informe a largura do cômodo: ");
        largura = in.nextInt();
        
        //Processamento
        dimensoes = comprimento * largura;
        potencia = dimensoes*15;
        //Saida
        System.out.printf("A potência necessária para iluminar o "
                + "cômomdo é de: %d W \n",potencia);
    }
}
