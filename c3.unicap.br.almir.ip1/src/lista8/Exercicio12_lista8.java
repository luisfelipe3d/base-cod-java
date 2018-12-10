/*
Exercicio :
Faça um programa em JAVA para exibir o menu abaixo. Se usuário escolha uma
das opções válidas, então o programa deve ler dois números inteiros e executar
a operação solicitada. Se for digitada uma opção inválida, o programa deve
exibir uma mensagem de erro. O usuário pode realizar várias operações até 
escolher sair do programa. As opções são: 
a) Adição
b) Subtração
c) Multiplicação
d) Quociente da divisão
e) Resto da divisão
f) Potêciação
g) Média aritmética
h) SAIR
 */
package lista8;

import java.util.Scanner;

public class Exercicio12_lista8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char opcao;
        int num1, num2;
        do {
            System.out.println("Escolha a opção desejada:\n"
                    + "a) Adição\n"
                    + "b) Subtração\n"
                    + "c) Multiplicação\n"
                    + "d) Quociente da divisão\n"
                    + "e) Resto da divisão\n"
                    + "f) Potenciação\n"
                    + "g) Média aritmética\n"
                    + "h) SAIR");
            opcao = in.next().charAt(0);
            if (opcao == 'h' || opcao == 'H')
                System.out.println("Fim PROGRAMA");
            else{
                System.out.println("Informe dois números inteiros: ");
                num1 = in.nextInt();
                num2 = in.nextInt();

                switch (opcao) {
                    case 'A':
                    case 'a':
                        System.out.println("Resultado da adição: " + (num1 + num2));
                        break;
                    case 'B':
                    case 'b':
                        System.out.println("Resultado da subtração: " + (num1 - num2));
                        break;
                    case 'C':
                    case 'c':
                        System.out.println("Resultado da multiplicação: " + (num1 * num2));
                        break;
                    case 'D':
                    case 'd':
                        System.out.println("Quociente da divisão: " + (num1 / num2));
                        break;
                    case 'E':
                    case 'e':
                        System.out.println("Resto da divisão: " + (num1 % num2));
                        break;
                    case 'F':
                    case 'f':
                        System.out.println("Potenciação: " + (Math.pow(num1, num2)));
                        break;
                    case 'G':
                    case 'g':
                        System.out.println("Média aritmética: " + ((num1 + num2) / 2));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                    }
            }
        } while (opcao != 'h' && opcao != 'H');
        }
    }

