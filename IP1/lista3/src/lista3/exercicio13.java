/*
Lista 3
Almir
13.Um trabalhador recebeu seu salário e o depositou em sua conta
corrente bancária. esse trabalhador emitiu dois cheques e agora
deseja saber seu saldo atual. Sabe-se que cada operação bancária
de retirada paga CPMF de 0,38% e o saldo inicial da conta estava zerado. 
Obs.:Quais devem ser os dados de entrada? 
*/
package lista3;
import java.util.Scanner;
// Dúvida: O CPMF é sobre o valor do cheque ou do saldo?
public class exercicio13 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner(System.in);
        double salario,conta,cpmf,cheque1,cheque2,saldo_atual;
        
        //Entrada
        System.out.println("Informe o seu salário: ");
        salario = in.nextDouble();
        System.out.println("Qual valor do cheque: ");
        cheque1 = in.nextDouble();
        System.out.println("Qual valor do chegue: ");
        cheque2 = in.nextDouble();
        //Processamento
        cpmf = 0.38/100;
        conta = salario;
        cheque1 = cheque1 + (cheque1*cpmf);
        //cheque1 = cheque1 + (conta*cpmf);
        cheque2 = cheque2 + (cheque2*cpmf);
        //cheque2 = cheque2 + (conta*cpmf); 
        conta = conta - cheque1 - cheque2;
        //Saida
        System.out.printf("Saldo Inicial: %.2f \nCheque1: %.2f \nCheque2: %.2f\n"
                + "Conta: %.2f \n",salario,cheque1,cheque2,conta);
        
    }
}
