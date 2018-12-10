/*
Faça um programa que a partir da idade e peso do paciente, 
calcule a dosagem de determinado medicamento e imprima a 
receita informando quantas gotas do medicamento o paciente
deve tomar por dose. Considere que o medicamento em 
questão possui 500 mg por ml, e que cada ml corresponde a 20 gotas. 

•Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso
igual ou acima de 60 quilos devem tomar 1000 mg; com peso abaixo 
de 60 quilos devem tomar 825 mg. 

•Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada
pelo peso corpóreo conforme a tabela a seguir: 
5 kg a 9 kg = 125 mg
9.1 kg a 24 kg = 375 mg
24.1 a 30 kg = 500 mg
acima de 30 kg = 750 mg
 */
package lista5;
import java.util.Scanner;

public class Exercicio16_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade, qtd_gotas;
        double peso;
        //Recebe idade e peso
        System.out.println("Digite idade: ");
        idade = in.nextInt();
        System.out.println("Digite peso: ");
        peso = in.nextDouble();
        
        //dosagem = variavel*20/500;
        if (idade >= 12 && peso >= 60)
            qtd_gotas = 40;
        else if (idade >= 12 && peso <60)
            qtd_gotas = (825*20)/500;
        else {
            if (peso >= 5 && peso <= 9)
                qtd_gotas = (125*20)/500;
            else if (peso > 9 && peso <= 24)
                qtd_gotas = (375*20)/500;
            else if (peso > 24 && peso <=30)
                qtd_gotas = 20;
            else
                qtd_gotas = (750*20)/500;
        }
        System.out.println("Gotas: "+qtd_gotas);
    }
}
