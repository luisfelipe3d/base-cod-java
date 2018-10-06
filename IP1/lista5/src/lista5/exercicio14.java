/*
Lista 5
Almir
14.Faça um programa que informe a quantidade total de 
calorias de uma refeição a partir da escolha do usuário
que deverá informar o prato, a sobremesa e a bebida.
(Veja menu de escolhas a seguir) 
|COD| PRATO | CAL | SOBREMESA | CAL | BEBIDA | CAL
----------------------------------------------------
|01 | CARNE | 350 | SORVETE   | 110 | LARANJA| 70  |
|02 | PEIXE | 230 | MOUSSE    | 170 | REFRIG | 100 |
|03 |FRANGO | 200 | ABACAXI   | 75  | CHÁ    | 20  |
----------------------------------------------------
 */
package lista5;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int prato,sobremesa,bebida,cal,
                cal_prato,cal_sobremesa,cal_bebida;
        //Recebe os dados
        System.out.print("Pratos: \n"
                + "1. CARNE\n"
                + "2. PEIXE\n"
                + "3. FRANGO\n"
                + "Escolha uma opção: ");
        prato = in.nextInt();
        
        System.out.print("Sobremesa: \n"
                + "1. Sorvete\n"
                + "2. Mousse\n"
                + "3. Abacaxi\n"
                + "Escolha uma opção: ");
        sobremesa = in.nextInt();
        
        System.out.print("Bebida:\n"
                + "1. Suco de Laranja\n"
                + "2. Refrigerante\n"
                + "3. Chá\n"
                + "Escolha uma opção: ");
        bebida = in.nextInt();
        
        //Atribui calorias dos pratos
        if (prato == 1)
            cal_prato = 350;
        else if (prato == 2)
            cal_prato = 230;
        else
            cal_prato = 200;
        
        //Atribui calorias sobremesa
        if (sobremesa == 1)
            cal_sobremesa = 110;
        else if (sobremesa == 2)
            cal_sobremesa = 170;
        else
            cal_sobremesa = 75;
        
        //Atribiu calorias bebidas
        if (bebida == 1)
            cal_bebida = 70;
        else if (bebida == 2)
            cal_bebida = 100;
        else
            cal_bebida = 20;
        //realiza soma de calorias e mostra resultado
        cal = cal_prato+cal_sobremesa+cal_bebida;
        System.out.println("Total de calorias do seu prato é: "+cal);
    }
}
