/*
Exercicio:
Uma empresa fez uma pesquisa para saber se as pessoas gostaram ou não de um novo  
produto lançado no mercado. Para isso, perguntou aos entrevistados seu sexo 
(M ou F), o valor de sua renda mensal (maior ou igual a zero) e se havia gostado 
do produto (S ou N). Sabe-se que foram entrevistadas trezentas pessoas. Faça um
programa para ler as informações fornecidas pelos entrevistados e calcular e 
exibir: 
a)A média salarial das pessoas que responderam sim;
b)O percentual de mulheres que respondeu não entre todas as mulheres analisadas.
Deve ser feita a validação de todos os dados fornecidos pelo usuário do programa,
forçando-o a digitar os valores corretos. 

*/
package lista16;
import java.util.Scanner;

public class Exercicio4_lista16 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int cont=0,cont_f=0,cont_n=0;
        double renda_mensal,media_salarial=0,aux;
        char sexo,rsp,flag;
            
        do{
            // válida sexo
            do{
                System.out.print("Sexo(M/F): ");
                sexo = in.next().charAt(0);
                if (Character.toUpperCase(sexo) != 'M' && 
                        Character.toUpperCase(sexo) != 'F')
                    System.out.println("Sexo inválido.");
            } while (Character.toUpperCase(sexo) != 'M' &&
                    Character.toUpperCase(sexo) != 'F');
            // válida renda
            do{
                System.out.print("Renda mensal: ");
                renda_mensal = in.nextDouble();
                if (renda_mensal <= 0)
                    System.out.println("Rensa mensal não pode ser menor ou "
                            + "igual a zero.");
            } while (renda_mensal <= 0);
            // válida resposta
            do{
                System.out.print("Gostou do produto(S/N): ");
                rsp = in.next().charAt(0);
                if (Character.toUpperCase(rsp) != 'S' &&
                        Character.toUpperCase(rsp) != 'N')
                    System.out.println("Resposta inválida.");
            } while (Character.toUpperCase(rsp) != 'S' && 
                    Character.toUpperCase(rsp) != 'N');
            //Verifica se deseja continar com a pesquisa
            do{
                System.out.print("Deseja continuar(S/N): ");
                flag = in.next().charAt(0);
                if (Character.toUpperCase(flag) != 'S' &&
                        Character.toUpperCase(flag) != 'N')
                    System.out.println("Opção inválida.");
            } while (Character.toUpperCase(flag) != 'S' &&
                        Character.toUpperCase(flag) != 'N');
            // média salarial dos que responderam sim
            if (rsp == 'S'){
                cont++;
                media_salarial = media_salarial + renda_mensal; 
            }
            // calcula qtd das mulheres que responderam não
            if (sexo == 'F'){
                cont_f++;
                if (rsp == 'N')
                    cont_n++;
            }    
                    
        } while (flag != 'N' && flag != 'n');
        
        aux = 100*cont_n / cont_f;
        System.out.println("Média salarial: "+(media_salarial/cont));
        System.out.println("Percentual de mulheres que responderam não: "+aux);
        
    }
}
