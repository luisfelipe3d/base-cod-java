/*
Exercicio :
O restaurante “Coma Feliz” deseja dar desconto para os seus
clientes que gostam de comer muito. Faça um programa em JAVA
que receba o código do prato principal e o código da sobremesa
de uma pessoa. Em seguida ele dever calcular e mostrar: 

•O peso em Kg e o preço do prato principal e da sobremesa 
escolhidos seguindo a Tabela I, a seguir; 
•O peso total da refeição e o seu valor total; 
•O valor do desconto, seguindo a Tabela II, a seguir, e aplicado
sobre o valor total da refeição; 
•O valor final da refeição após o desconto. 

Obs: O programa deve verificar se o código é válido para o prato
principal e para a sobremesa, caso contrário, exibir mensagem de
erro e não realizar nenhum cálculo. 

Tabela 1                                    Tabel 2
Cod | Descrição | Peso | Preço |  |Preço Total da Refeição | % de desconto|
1   |Vegetariano| 0.8Kg|R$20,00|  | até R$ 20,00(inclusive)|      4%      |
2   |Peixe      | 0.5Kg|R$30,00|  |Entre 20 e 40(exclusive)|      6%      |
3   |Frango     | 0.7Kg|R$28,00|  |De R$ 40 para cima      |     12%      |
4   |Abacaxi    | 0.1Kg|R$02,50|
5   |Mousse     | 0.3Kg|R$04,50|
6   |Sorvete    | 0.4kg|R$06,00|
 */
package lista6;
import java.util.Scanner;

public class Exercicio4_lista6 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        int prato,sobremesa;
        double calculo,desc,peso,peso_sbr,peso_t,preco,preco_sbr,preco_t;
        //Entrada de dados
        System.out.println("Bem vindo ao restaurante Coma Feliz!");
        System.out.print("Temos as seguintes opções de pratos: \n"
                + "1. Vegetariano\n"
                + "2. Peixe\n"
                + "3. Frango\n"
                + "O que deseja: ");
        prato = in.nextInt();
        //Verifica opção válida
        if (prato < 1 || prato > 3)
            System.out.println("Erro na opção de prato escolhida.");
        
        System.out.println("Sobremesa: \n"
                    + "4. Abacaxi\n"
                    + "5. Mousse\n"
                    + "6. Sorvete\n"
                    + "O que deseja: ");
        sobremesa = in.nextInt();
        //Verifica opção válida
        if (sobremesa < 4 || sobremesa > 6)
            System.out.println("Erro a opção de sobremesa.");
        
        else{
            
            //Atribui valor a variavel peso
            switch (prato) {
                case 1:
                    peso = 0.8;
                    preco = 20;
                    break;
                case 2:
                    peso = 0.5;
                    preco = 30;
                    break;
                default:
                    peso = 0.7;
                    preco = 28;
                    break;
            }
            //Atribui valor a variavel sobremesa
            switch (sobremesa) {
                case 4:
                    peso_sbr = 0.1;
                    preco_sbr = 2.5;
                    break;
                case 5:
                    peso_sbr = 0.3;
                    preco_sbr = 4.5;
                    break;
                default:
                    peso_sbr = 0.4;
                    preco_sbr = 6;
                    break;
            }
            preco_t = preco + preco_sbr; // valor prato+sobremesa
            peso_t = peso + peso_sbr; // valor total em kg
            //Calcula desconto
            if (preco_t <=20)
                preco_t = preco_t * 0.96;
            else if (preco_t > 20 && preco_t < 40)
                preco_t = preco_t * 0.92;
            else
                preco_t = preco_t * 0.88;
            System.out.printf("Valor a pagar: %.2f \n",preco_t);
    }
    }
    }