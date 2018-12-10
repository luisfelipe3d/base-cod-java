/*
Exercicio:
Entrar com um número no formato CDU (centena,dezena e unidade) e 
obter o mesmo invertido:UDC.Deve-se exibir os dois números. 
Exemplo: 123 sairá 321.Obs.:O número deverá ser armazenado 
em outra variável antes de ser impresso.
 */
package lista3;
import java.util.Scanner;

public class Exercicio12_lista3 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int entrada,centena,dezena,unidade;
        
        //Entrada
        System.out.println("Entre com um número CDU(135): ");
        entrada = in.nextInt();
        
        //Processamento
        centena =(entrada%1000)/100; //Pega o primeiro digito
        dezena =(entrada%100)/10; // Pega o segundo digito
        unidade = entrada%10; // Pega o ultimo digito
        
        //Saida
        System.out.printf("%d,%d,%d\n",unidade,dezena,centena);
    }
}
