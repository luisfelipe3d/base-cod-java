/*
Exercicio :
Faça um programa que leia o valor de uma mercadoria, 
e depois o modo de pagamento, que pode ser “V” (à  vista) 
ou “P” (à prazo). Se for “P”, o preço será acrescido de 10%,
e o programa pedirá o número de prestações do financiamento,
dividindo o valor já com acréscimo por este número, para saber
(e imprimir) o valor de cada prestação. Se o modo de pagamento
for “V”,haverá um desconto de 5%, e o programa vai mostrar o novo valor. 
 */
package lista4;
import java.util.Scanner;

public class Exercicio6_lista4 {
    public static void main(String[] args) {
        //Definir variávies
        Scanner in = new Scanner(System.in);
        int prest;
        double valor_merc,taxa=1.1,desc=0.95,valor_atual;
        char forma_pgt;
        
        //Entrada
        System.out.println("Valor mercadoria: ");
        valor_merc = in.nextDouble();
        System.out.println("V para avista ou P à prazo");
        System.out.println("Forma de pagamento: ");
        forma_pgt = in.next().charAt(0);
        
        //Processamento
        if(forma_pgt == 'V') 
            System.out.println("Total a pagar: "+(valor_merc*desc));
        else{
            valor_atual = valor_merc * taxa;
            System.out.print("Dividir em quantas vezes? ");
            prest = in.nextInt();
            System.out.printf("Total a pagar: %.2f\n",(valor_atual/prest));
        }
    }
}
