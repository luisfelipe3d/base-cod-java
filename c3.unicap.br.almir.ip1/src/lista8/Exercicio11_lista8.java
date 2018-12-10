/*
Exercicio :
Faça um programa em JAVA para ler o sexo(1-masculino, 2-feminino) e a 
altura de um grupo de 50 pessoas. O programa deve calcular;
a) Altura média das mulheres e a altura média dos homens;
b) A maior e o menor altura do grupo, dizendo se a altura é de um homem ou de
uma mulher.
*/
package lista8;
import java.util.Scanner;

public class Exercicio11_lista8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sexo,i=0;
        double altura_m=0,altura_h=0,maior_h=0,maior_m=0,
                menor_h=Integer.MAX_VALUE,media_h=0,media_m=0,
                menor_m=Integer.MAX_VALUE;  
        do {
            do{
                System.out.println("Digite seu sexo: ");
                System.out.println("1. Masculino.");
                System.out.println("2. Feminino.");
                System.out.print("sexo: ");
                sexo = in.nextInt();
            } while (sexo != 1 && sexo != 2);
            
            switch(sexo){
                case 1:
                    System.out.print("Digite sua altura: ");
                    altura_h = in.nextDouble();
                    if (altura_h > maior_h )
                        maior_h = altura_h;
                    media_h = media_h + altura_h;
                    if (altura_h < menor_h)
                        menor_h = altura_h;
                    break;
                case 2:
                    System.out.print("Digite sua altura: ");
                    altura_m = in.nextDouble();
                    if (altura_m > maior_m)
                        maior_m = altura_m;
                    media_m = (media_m + altura_m);
                    if (altura_m < menor_m)
                        menor_m = altura_m;
                    break;
                default:
                        System.out.println("Opção inválida!!");
                
            }
            i++;    
        } while (i !=4);
        
        if (maior_h > maior_m)
            System.out.println("Maior altura é: "+maior_h+". Homem.");
        else
            System.out.println("Maior altura é: "+maior_m+". Mulher.");
        
        if (menor_h < menor_m)
            System.out.println("Menor altura é: "+menor_h+". Homem");
        else
            System.out.println("Menor altura é: "+menor_m+". Mulher.");
        
        System.out.println("Média Homens: "+(media_h/4));
        System.out.println("Média Mulheres: "+(media_m/4));
    }
}
