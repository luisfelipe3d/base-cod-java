/*
Exercicio :
Um sistema de equações lineares da forma apresentada abaixo 
ax + by = c 
dx + ey = f 

X = ce - bf/ae - bd
Y = af - cd/ae - bd
pode ser resolvido utilizando-se as seguintes fórmulas: 
Dados os coeficientes (a,b,c,d,e,f) das equações, calcular e exibir x e y.
 */
package lista3;
import java.util.Scanner;

public class Exercicio18_lista3 {
    public static void main(String[] args) {
        //Definir variaveis
        Scanner in = new Scanner(System.in);
        //Entrada
        int a,b,c,d,e,f,x,y;
        
        //Processamento
        System.out.println("Informe o valor: ");
        a = in.nextInt();
        System.out.println("Informe o valor: ");
        b = in.nextInt();
        System.out.println("Informe o valor: ");
        c = in.nextInt();
        System.out.println("Informe o valor: ");
        d = in.nextInt();
        System.out.println("Informe o valor: ");
        e = in.nextInt();
        System.out.println("Informe o valor: ");
        f = in.nextInt();
        
        //Processamento
        x = (c*e) - (b*f) / (a*e) - (b*d);
        y = (a*f) - (c*d) / (a*e) - (b*d);
        //Saida
        System.out.println(""+x);
        System.out.println(""+y);
    }
}
