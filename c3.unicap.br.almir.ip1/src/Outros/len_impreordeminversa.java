/*
Questão eu leio a quantide de numeros a ser digitados
e imprimo na ordem inversa
 */
package Outros;
import java.util.Scanner;
public class len_impreordeminversa {
    static void inverso(int qtd){
        Scanner in = new Scanner (System.in);
        int num;
        System.out.println("Entrada: ");
        num = in.nextInt();
        
        if (qtd == 1)
            System.out.print(" "+num);
        else{
            inverso(qtd-1);
            System.out.print(" "+num);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int qtd;
        
        System.out.println("Qtd de números: ");
        qtd = in.nextInt();
        inverso(qtd);
        System.out.println("");
        
    }
}
