/*
Exercicio :
Faça  um  programa  para  ler  os  comprimentos  dos  três
lados  de  um  suposto  triângulo  e  determinar,  caso  
formem  um triângulo, se o mesmo é um triângulo eqüilátero,
isósceles ou escaleno. 
 */
package lista5;
import java.util.Scanner;

public class Exercicio11_lista5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int rta1,rta2,rta3,validacao;
        
        //Recebe dados
        System.out.print("Reta1: ");
        rta1 = in.nextInt();
        System.out.print("Reta2: ");
        rta2 = in.nextInt();
        System.out.print("Reta3: ");
        rta3 = in.nextInt();
        
        // Processamento
        if (rta1+rta2 > rta3){
            System.out.println("Forma um triângulo.");
            
            if (rta1 == rta2 && rta2 == rta3)
                System.out.println("É um triângulo equilatero.");
            else if (rta1 == rta2 || rta2 == rta3 || rta1 == rta3)
                System.out.println("Triangulo Isóceles.");
            else
                System.out.println("Triangulo escaleno.");
        
        }else if (rta2+rta3 > rta1){
            System.out.println("Forma um triângulo.");
            
            if (rta1 == rta2 && rta2 == rta3)
                System.out.println("É um triângulo equilatero.");
            else if (rta1 == rta2 || rta2 == rta3 || rta1 == rta3)
                System.out.println("Triangulo Isóceles.");
            else
                System.out.println("Triangulo escaleno.");
    
        }else if (rta1+rta3 > rta2){
            System.out.println("Forma um triângulo.");
            
            if (rta1 == rta2 && rta2 == rta3)
                System.out.println("É um triângulo equilatero.");
            else if (rta1 == rta2 || rta2 == rta3 || rta1 == rta3)
                System.out.println("Triangulo Isóceles.");
            else
                System.out.println("Triangulo escaleno.");
        
        }else
            System.out.println("Não é possivel formar um triângulo.");
        
        /*if (rta1 == rta2 && rta2 == rta3)
            System.out.println("É um triângulo equilatero.");
        else if (rta1 == rta2 || rta2 == rta3 || rta1 == rta3)
            System.out.println("Triangulo Isóceles.");
        else
            System.out.println("Triangulo escaleno.");
        
        /*System.out.println((rta1+rta2) > rta3 ? "Reta válida":"Reta inválida.");
        System.out.println((rta2+rta3) > rta1 ? "Reta válida":"Reta inválida.");
        System.out.println((rta3+rta1) > rta2 ? "Reta válida":"Reta inválida.");
        */
    }
}
