/*
Lista 4
Almir
3.Faça um programa que leia o ano de nascimento de uma pessoa,
o ano atual e diga, se ela for maior de idade, que pode entrar 
na boate, e se não for, não pode. 
 */
package lista4;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //Definir variáveis 
        Scanner in = new Scanner(System.in);
        int ano_nasc,ano_atual,idade;
        
        //Entrada
        System.out.println("Ano de Nascimento: ");
        ano_nasc = in.nextInt();
        System.out.println("Ano atual: ");
        ano_atual = in.nextInt();
        
        //Processamento
        idade = ano_atual - ano_nasc;
        if (idade >= 18){
            System.out.println("Você pode entrar.");
        } else {
            System.out.println("Você não pode entrar. ");
        }
    }
}
