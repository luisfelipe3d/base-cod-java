/*
13.
Faça  um  programa  para  ler  dois  números  inteiros  e  executar
uma  das  operações  listadas  a  seguir  de  acordo  com  a  
escolha  do usuário. Se for digitada uma opção inválida, o programa
deve exibir uma mensagem de erro. As opções são: 
1. Adição 
2. Subtração 
3. Multiplicação 
4. Quociente da divisão 
5. Resto da divisão 
6. Potenciação 
7. Média aritmética 
*/
package lista4;
import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int opcao;
        double num1,num2,resultado=0;
        
        //Escolher qual operação e receber os dados
        System.out.print("****Calculadora****\n\n"
                + "1.Adição\n"
                + "2.Subtração\n"
                + "3.Multiplicação\n"
                + "4.Quociente da divisão\n"
                + "5.Resto da divisão\n"
                + "6.Potenciação\n"
                + "7.Média airtimética\n\n"
                + "Qual operação você deseja realizar: ");
        opcao = in.nextInt();
        //Realizar operações e mostra resultados
        System.out.print("Digite um número: ");
        num1 = in.nextDouble();
        System.out.print("Digite um número: ");
        num2 = in.nextDouble();
        
        if (opcao == 1)
            resultado = num1+num2;
        else if (opcao == 2)
            resultado = num1-num2;
        else if (opcao == 3)
            resultado = num1*num2;
        else if (opcao == 4)
            resultado = num1/num2;
        else if (opcao == 5)
            resultado = num1%num2;
        else if (opcao == 6)
            resultado = Math.pow(num1, num2);
        else if (opcao == 7)
            resultado = (num1+num2)/2;
        
        System.out.printf("Num1:%.2f\n"
                + "Num2:%.2f\n"
                + "Resultado:%.2f\n",num1,num2,resultado);
        
        
    }
}
