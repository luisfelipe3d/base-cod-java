/*
Exercicio :
A empresa Bons Amigos decidiu dar a seus funcionários uma 
gratificação de Natal. A gratificação é baseada em dois 
critérios: o número de horas extras trabalhadas e o 
número de horas que o funcionário faltou ao trabalho. 
A empresa resolveu utilizar a seguinte fórmula para 
calcular o prêmio: subtrair dois terços das horas que o 
funcionário faltou de suas horas extras trabalhadas e 
distribuir o prêmio de acordo com a tabela abaixo: 
Total = Horas Extras - 2/3 x Horas que faltou
Total > 40 horas / R$ 200
30<total<=40 / R$ 175
20<total<=30 / R$ 150
10<total<=20 / R$ 125
total<= 10 / R$ 100
Faça um programa para ler o número de horas extras trabalhadas
e o número de horas que o funcionário faltou ao trabalho, 
e calcular o valor de seu prêmio. O programa deverá exibir 
a seguinte frase: O funcionário receberá
R$_______________ de gratificação de Natal. 
 */
package lista5;
import java.util.Scanner;
public class Exercicio5_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int horas_extras,horas_faltadas;
        double total,bonus;
        // recebe dados
        System.out.println("Horas extras trabalhadas: ");
        horas_extras = in.nextInt();
        System.out.println("Horas faltadas: ");
        horas_faltadas = in.nextInt();
        //formula para calcular bonus
        total = horas_extras - (horas_faltadas * 2/3) ;
        
        //verifica os valores de acordo
        if (total > 40)
            bonus = 200;
        else if (total <=40 && total > 30)
            bonus = 175;
        else if (total <= 30 && total > 20)
            bonus = 150;
        else if (total <=20 && total > 10)
            bonus = 125;
        else
            bonus = 100;
        System.out.printf("R$ %.2f de gratificação de Natal.\n",bonus);
    }
}
