/*
Exercicio :
Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia
elétrica em uma determinada cidade. Faça um programa em JAVA que leia para
cada consumidor, o seu código de identificação, a quantidade de kWh consumida
durante o mês e o código do tipo de consumo(1-Residêncial,2-Comercial,
3-Industria). O programa deve calcular: 

a) Para cada consumidor, o total a pagar. O preço do kWh é R$0.15 para consumo
residencial, R$0.25 para consumo comercial e R$0.10 para consumo industrial.
Se a quantidade de kWh consumida durante o mês pelo usuário for menor que o
limite mínimo pré-determinado, este terá um desconto de 20% no valor total de
sua conta. O limite mínimo para residências é de 30kWh, para comércios é de
100kHw e para indústrias é de 200kWh.
b) O total de consumo para cada um dos três tipos de consumidores.
c) A média geral de consumo para cada um dos três tipos de consumidores.
OBS: O programa deve válidar informações fornecidas pelo usuário: quantidade
de kWh maior que zero e o código do tipo de consumidor igual a 1,2 e 3.
OBS: Um código de consumidor igual a zero indica o final de dados.
*/
package lista9;
import java.util.Scanner;

public class Exercicio14_lista9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int consumidor;
        double consumo,total=0;
        
        System.out.println("****CONSUMO MENSAL****");
        System.out.println("1. Residêncial ");
        System.out.println("2. Comercial ");
        System.out.println("3. Industrial ");
        System.out.print("Opção: ");
        consumidor = in.nextInt();
        
        if (consumidor == 1 || consumidor == 2 || consumidor == 3){
            System.out.print("Informe qtd consumida de kHw: ");
            consumo = in.nextDouble();
            switch (consumidor) {
                case 1:
                    if (consumo <= 30)
                        total = (consumo*0.15) *0.8;
                    else
                        total = consumo*0.15;
                    break;
                case 2:
                    if (consumo <= 100)
                        total = (consumo*0.25) * 0.8;
                    else
                        total = consumo*0.25;
                    break;
                default:
                    if (consumo <= 200)
                        total = (consumo*0.1) *0.8;
                    else
                        total = consumo*0.1;
                    break;
            }
                //System.out.println("Valor p/kHw: R$0.10");
                System.out.println("Total: "+total);
        }
        else
            System.out.println("Opção inválida.\n"
                    + "Fim Programa");
        
    }
}
