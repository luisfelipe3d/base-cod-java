/*
Exercicio:
Faça um programa em JAVA para ler o sexo (1 – Masculino, 2 – Feminino) e a
altura de um grupo de 50 pessoas. O programa deve calcular: 
a)A altura média das mulheres e a altura média dos homens; 
b)A maior e a menor altura do grupo, dizendo se a altura é de um homem ou de
uma mulher.
*/
package lista9;
import java.util.Scanner;

public class Exercicio17_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sexo,i,sexo_m=0,sexo_n=0;
        double altura,media_h=0,media_m=0,maior_h=0,menor_h=Integer.MAX_VALUE;
        
        for (i = 1; i<=50; i++){
            System.out.print("1 - Masculino\n"
                    + "2 - Feminino\n"
                    + "Sexo:  ");
            sexo = in.nextInt();
            
            switch (sexo){
                case 1:
                    System.out.print("Altura: ");
                    altura = in.nextDouble();
                    if (altura > maior_h){
                        maior_h = altura;
                        sexo_m = sexo;
                    }
                    if (altura < menor_h){
                    menor_h = altura;
                    sexo_n = sexo;
                    }
                    media_h = media_h + altura;
                    break;
                case 2:
                    System.out.print("Altura: ");
                    altura = in.nextDouble();
                    if (altura > maior_h){
                        maior_h = altura;
                        sexo_m = sexo;
                    }
                    if (altura < menor_h){
                    menor_h = altura;
                    sexo_n = sexo;
                    }
                    media_m = media_m + altura;
                    break;
                    default:
                        System.out.println("Opção inválida");
 
        }
        }
        System.out.println("Maior Altura do Grupo: "+maior_h);
        System.out.println("Sexo: "+sexo_m);
        System.out.println("Menor Altura do Grupo: "+menor_h);
        System.out.println("Sexo: "+sexo_n);
        
    
}
}
