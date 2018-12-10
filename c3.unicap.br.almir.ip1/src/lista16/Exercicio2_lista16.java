/*
Exercicio:
Foi feita uma pesquisa entre 150 habitantes de uma região. Foram coletados
os dados de idade (valor de 0 a 120), sexo (M ou F) e salário (valor maior ou
igual a zero). Faça um procedimento para ler os dados coletados e calcular e
exibir:
• A média salarial entre os homens;
• A idade e o sexo da pessoa que ganha o maior salário;
• O percentual de mulheres, entre as entrevistadas, com mais de 30 anos e que
ganham entre R$ 300,00 e R$ 500,00.
Obs.: Deve ser feita a checagem de todos os dados fornecidos pelo usuário do 
programa, forçando-o a digitar valores válidos. 
*/
package lista16;
import java.util.Scanner;

public class Exercicio2_lista16 {
    
    public static void procedimento(){
        Scanner in = new Scanner (System.in);
        int idade=0,qtd_h=0,idade_maior=0,qtd_m=0,i;
        double salario=0, media_salarial_h=0, maior_salario=0,per_m;
        char sexo,sexo_maior='x';
        
        for (i = 1; i <= 150; i++){
            do{
                System.out.print("Idade: ");
                idade = in.nextInt();
                if (idade >= 0 && idade <= 120)
                    System.out.println("Idade inválida, tente novamente.");
            } while (idade >= 0 && idade <= 120);
            
            do{
                System.out.print("Sexo(M/F): ");
                sexo = in.next().charAt(0);
                if (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F')
                    System.out.println("Sexo inválido, tente novamente.");
            } while (sexo != 'm' && sexo != 'f' && sexo != 'M' && sexo != 'F');
            
            do{
                System.out.print("Salário: ");
                salario = in.nextDouble();
                if (salario <= 0)
                    System.out.println("Valor inválido, tente novamente.");
            } while (salario <= 0);
            
            if (sexo == 'm' || sexo == 'M'){ // Item 1
                qtd_h++;
                media_salarial_h = media_salarial_h + salario;
            }
            
            if (maior_salario > salario){ // Item 2
                idade_maior = idade;
                sexo_maior = sexo;
            }
            if (sexo == 'f' || sexo == 'F' && salario >= 300 && salario <= 500)
                qtd_m++;
        }
        
        System.out.printf("Média Salárial entre homens: %.2f.\n",media_salarial_h);
        System.out.printf("Pessoa que ganha mais dinheiro:\nIdade: %d.\n "
                + "Sexo: %c.\n ",idade_maior,sexo_maior);
        System.out.printf("Percentual de mulheres com mais de 30 anos e que\n" +
                "ganham entre R$ 300,00 e R$ 500,00. %d",(qtd_m/150 *100));
        
    }
    
    public static void main(String[] args) {
        procedimento();
    }
}
