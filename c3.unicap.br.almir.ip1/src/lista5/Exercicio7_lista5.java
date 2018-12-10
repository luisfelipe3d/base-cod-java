/*
Exercicio :
Faça um programa para receber três números inteiros: um
representando um dia, outro representando um mês e um terceiro 
representando um ano d.C. O programa deverá decidir se juntos
os três números formam uma data válida. 
 */
package lista5;
import java.util.Scanner;

public class Exercicio7_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia,mes,ano;
        //int dia_v,mes_v,ano_v;
        //Receber os três números
        System.out.print("Dia: ");
        dia = in.nextInt();
        System.out.print("Mês: ");
        mes = in.nextInt();
        System.out.print("Ano: ");
        ano = in.nextInt();
        // meses com 30 dias; Abr= 4, Jun= 6, Set= 8, Nov=10
        if (dia <=31 && mes >=1 && mes <=12 && ano >=1){
            
            if (mes == 2 && dia <=28)
                System.out.println("Data válida.");
            if (dia < 31 && mes == 4 || mes == 6 || mes == 8 || mes == 10)
                System.out.println("Data válida para os meses com 30dias.");
            else
                System.out.println("Este mês não tem 31 dias.");
        } else
            System.out.println("Data inválida.");
    }
}
