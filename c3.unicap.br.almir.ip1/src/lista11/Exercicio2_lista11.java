/*
Exercicio :
Faça um programa que calcula a área ou o volume de uma determinada figura  
geométrica. O usuário poderá escolher entre cálculo de área ou cálculo de volume.
Caso o usuário queira calcular uma área, as opções fornecidas pelo programa são:
círculo, triângulo, retângulo ou trapézio. Se o cálculo desejado for de volume,  
as opções são: esfera, cilindro, cubo ou paralelepípedo. O programa deverá ter,  
no mínimo, 08 (oito) subprogramas, um para cada cálculo de área ou volume.
 */
package lista11;
import java.util.Scanner;

public class Exercicio2_lista11 {
    static void linha(){
        for(int i = 1; i <= 25; i++)
            System.out.print("*");
        System.out.println("");
    }
    
    static double circulo(double raio){
        return Math.PI*(raio*raio);
    } 
    
    static double triangulo(double base, double altura){
        return (base*altura)/2;
    }
    
    static double retangulo(double base, double altura){
        return base*altura;
    }
    
    static double trapezio(double maiorB, double menorB, double altura){
        return ((maiorB+menorB)*altura)/2;
    }
    
    static double esfera(double raio){
        return (4*Math.PI*raio*raio*raio)/3;
    }
    
    static double cilindro(double raio, double altura){
        return (altura*Math.PI*raio*raio);
    }
    
    static double cubo(double largura){
        return largura*largura*largura;
    }
    
    static double paralelepipedo(double base, double altura, double comprimento){
        return base*altura*comprimento;
    }
    
    static void calculoArea(){
        Scanner in = new Scanner (System.in);
        int entrada;
        double raio,resultado,altura,maiorB,menorB,base;
        System.out.println("Deseja calcular: ");
        System.out.println("1. Circulo");
        System.out.println("2. Triângulo");
        System.out.println("3. Retângulo");
        System.out.println("4. Trapézio");
        System.out.print("Opção: ");
        entrada = in.nextInt();
        switch (entrada){
            case 1:
                System.out.print("Raio: ");
                raio = in.nextDouble();
                linha();
                resultado = circulo(raio);
                System.out.printf("Área circulo: %.2f\n",resultado);
                break;
            case 2:
                System.out.print("Base: ");
                base = in.nextDouble();
                System.out.print("Altura: ");
                altura = in.nextDouble();
                linha();
                resultado = triangulo(base,altura);
                System.out.printf("Área do Triângulo: %.2f\n",resultado);
                break;
            case 3:
                System.out.print("Base: ");
                base = in.nextDouble();
                System.out.print("Altura: ");
                altura = in.nextDouble();
                linha();
                resultado = retangulo(base,altura);
                System.out.printf("Área Retângulo: %.2f\n",resultado);
                break;
            case 4:
                System.out.print("Base maior: ");
                maiorB = in.nextDouble();
                System.out.print("Base menor: ");
                menorB = in.nextDouble();
                System.out.print("Altura: ");
                altura = in.nextDouble();
                linha();
                resultado = trapezio(maiorB,menorB,altura);
                System.out.printf("Área Trapézio: %.2f\n",resultado);
                break;
            default:
                System.out.println("Opção inválida!!");
        }
    }
    
    static void calculoVolume(){
        Scanner in = new Scanner(System.in);
        int entrada;
        double raio,comprimento,largura,altura,resultado,base;
        System.out.println("Deseja calcular: \n"
                            + "1. Esfera\n"
                            + "2. Cilíndro\n"
                            + "3. Cubo\n"
                            + "4. Paralelepípedo");
        System.out.println("Opção: ");
        entrada = in.nextInt();
        switch (entrada){
            case 1:
                System.out.print("Raio: ");
                raio = in.nextDouble();
                linha();
                resultado = esfera(raio);
                System.out.printf("Volume Esfera: %.2f\n",resultado);
                break;
            case 2:
                System.out.print("Raio: ");
                raio = in.nextDouble();
                System.out.print("Altura: ");
                altura = in.nextDouble();
                linha();
                resultado = cilindro(raio,altura);
                System.out.printf("Volume Cilíndro: %.2f\n",resultado);
                break;
            case 3:
                System.out.print("Largura: ");
                largura = in.nextDouble();
                linha();
                resultado = cubo(largura);
                System.out.printf("Volume Cubo: %.2f\n",resultado);
                break;
            case 4:
                System.out.print("Base: ");
                base = in.nextDouble();
                System.out.print("Alutra: ");
                altura = in.nextDouble();
                System.out.print("Comprimento");
                comprimento = in.nextDouble();
                linha();
                resultado = paralelepipedo(base,altura,comprimento);
                System.out.printf("Volume do paralelepípedo: %.2f\n",resultado);
                break;
            default:
                System.out.println("Opção inválida!!!");
    }
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int op;
        do {
            linha();
            System.out.println("Programa 2\n"
                    + "1. Calcula área\n"
                    + "2. Calcula volume\n"
                    + "3. Sair");
            System.out.print("Opção: ");
            op = in.nextInt();
            switch (op){
                case 1:
                    calculoArea();
                    break;
                case 2:
                    calculoVolume();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        } while (op != 3);
    }
}
