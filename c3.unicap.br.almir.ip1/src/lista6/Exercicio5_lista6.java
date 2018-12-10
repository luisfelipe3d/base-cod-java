/*
Exercicio :
Faça um programa em JAVA que receba o valor do salário
mínimo, o número de horas trabalhadas no mês, o turno
do  trabalho (1–Matutino ou 2–Vespertino) e a 
categoria(O ou o – Operário eG ou g – Gerente)
de um funcionário.

Observações: O salário mínimo e o número de horas
trabalhadas devem ser maiores que zero, o turno deve ser
1 ou 2 e a categoria só pode ser O ou  o, G ou g.
Valide-os e para cada caso exiba uma mensagem específica
para o erro.

Exemplos: “Salário  Inválido!”, “Horas  Inválidas!”, 
“Turno  Inválido” ou “Categoria  Inválida!”. Se os valores
estiverem corretos o programa deve calcular e imprimir:

a)O coeficiente do salário, de acordo com a tabela a seguir.
1 - Matutino    |   20% do sálario mínimo
2 - Vespertino  |   25% do sálario mínimo

b)O valor do salário bruto, ou seja, o número de horas trabalhadas
multiplicado pelo valor do coeficiente do trabalho. 

c)O valor do imposto de acordo com a tabela a seguir:
Categoria   | Salário Bruto | Imposto sobre salário bruto
O ou o      |  >= R$ 400,00 | 7%
O ou o      |  < R$ 400,00  | 5%
G ou g      |  >= 500,00    | 8%
G ou g      |  < R$ 500,00  | 6%

d)A gratificação de acordo com as regras a seguir: 
•Se o funcionário preencher algum um dos seguintes
requisitos sua gratificação será de R$ 40,00, caso 
contrário, será de R$ 20,00. Os requisitos são: 
Categoria: Operário; Coeficiente do Salário: <= 20%.

e)O salário líquido, ou seja, salário bruto menos imposto
e mais gratificação. 

f)A classificação de acordo com as regras a seguir:
SALÁRIO LÍQUIDO                 MENSAGEM
Menor que R$ 450,00             Mal Remunerado
Entre R$ 450,00 e R$ 700,00     Normal
Maior que R$ 700,00             Bem Remunerado
 */
package lista6;
import java.util.Scanner;
public class Exercicio5_lista6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario_minimo,coef_salario = 0,salario_bruto,imp_salario,grati,
                salario_liquido;
        int turno,horas;
        char categoria;
        //Le salário minimo
        do{
            System.out.println("Salário mínimo: ");
            salario_minimo = in.nextDouble();
            if (salario_minimo <= 0)
                System.out.println("Salário incorreto.");
            
        } while (salario_minimo <= 0);
        //le quantidade de horas
        do{
            System.out.println("Quantidade de horas: ");
            horas = in.nextInt();
            if (horas <= 0)
                System.out.println("Quantidade de horas inválida.");
        } while (horas <=0);
        //le turno
        do{
            System.out.println("Turno: 1-Manhã/ 2-Tarde: ");
            turno = in.nextInt();
            if (turno != 1 && turno != 2)
                System.out.println("Turno inválido.");
        } while (turno != 1 && turno != 2);
        //le categoria
        do{
            System.out.println("Categoria: Operario(O/o), Gerente(G/g): ");
            categoria = in.next().charAt(0);
            if (categoria != 'O' && categoria != 'o' &&
                    categoria != 'G' && categoria != 'g' )
                System.out.println("Categoria inválida.");
        } while (categoria != 'O' && categoria != 'o' && categoria != 'g' &&
                categoria != 'G');
         
        if (turno == 1)
            coef_salario = salario_minimo * 0.2;
        else
            coef_salario = salario_minimo * 0.25;
        //coef_salario = (turno == 1)? salario_minimo*0.2:salario_minimo*0.25; 
        salario_bruto = horas * coef_salario; // Letra B
        
        //Letra C
        if (categoria == 'O' || categoria == 'o')
            if (salario_bruto >= 400)
                imp_salario = salario_bruto * 0.7;
            else
                imp_salario = salario_bruto * 0.5;
        else
            if(salario_bruto >= 500)
                imp_salario = salario_bruto * 0.8;
            else
                imp_salario = salario_bruto * 0.6;
            //Letra D e E
        grati = (categoria == 'o' || categoria == 'O' || turno == 1)? 40:20;
        salario_liquido = (salario_bruto - imp_salario) + grati;
            // Letra F
        System.out.println("Coeficiente salário: "+coef_salario);
        System.out.println("Salário Bruto: "+salario_bruto);
        System.out.println("Imposto: "+imp_salario);
        System.out.println("Gratificação: "+grati);
        System.out.println("Salário Liquido: "+salario_liquido);
        
        if (salario_liquido > 700) 
            System.out.println("Bem remunerado.");
        else if (salario_liquido >= 450 && salario_liquido <= 700)
            System.out.println("Normal");
        else
            System.out.println("Mal remunerado.");
    }
}
