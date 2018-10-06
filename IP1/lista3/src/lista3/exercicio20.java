/*
Lista 3
Almir
20.
Em uma eleição sindical concorreram ao cargo de presidente 
três candidatos (A, B e C). Durante a operação dos  votos  foram  
computados votos nulos e votos em branco, além dos votos válidos 
para cada candidato. Faça um programa que efetue a leitura da 
quantidade de votos válidos para cada candidato, além de efetuar 
também a leitura da quantidade de votos em branco e votos nulos.
O programa deve calcular e exibir: 
•O número total de eleitores, considerando os votos válidos, nulos e em branco; 
•O percentual de votos válidos em relação à quantidade de eleitores; 
•O percentual de votos válidos do candidato A em relação à quantidade de eleitores; 
•O percentual de votos válidos do candidato B em relação à quantidade de eleitores; 
•O percentual de votos válidos do candidato C em relação à quantidade de eleitores; 
•O percentual de votos nulos em relação à quantidade de eleitores; 
•E o percentual de votos em branco em relação à quantidade de eleitores. 
*/
package lista3;
import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        //Definir variáveis
        Scanner in = new Scanner (System.in);
        double candidato_a,candidato_b,candidato_c,votos_nulos,votos_brancos,
                votos_validos,votos_val_a,votos_val_b,votos_val_c,num_total,
                qtd_eleitores,qtd_votos_nulos,qtd_votos_brancos;
        
        //Entrada
        System.out.println("QTD de votos válidos candidato A: ");
        candidato_a = in.nextDouble();
        System.out.println("QTD de votos válidos candidato B: ");
        candidato_b = in.nextDouble();
        System.out.println("QTD de votos válidos candidato C: ");
        candidato_c = in.nextDouble();
        System.out.println("QTD de votos em branco: ");
        votos_brancos = in.nextDouble();
        System.out.println("QTD de votos nulos: ");
        votos_nulos = in.nextDouble();
        
        //Processamento
        num_total = candidato_a + candidato_b + candidato_c + votos_brancos +
                votos_nulos; // Item 1
        votos_validos = candidato_a + candidato_b + candidato_c; //Item 2.1
        qtd_eleitores = 100 * (votos_validos/num_total); // Item 2.2
        votos_val_a = 100 * (candidato_a/num_total); // Item 3
        votos_val_b = 100 * (candidato_b/num_total); // Item 4
        votos_val_c = 100 * (candidato_c/num_total); // Item 5
        qtd_votos_nulos = 100 * (votos_nulos/num_total); //Item 6
        qtd_votos_brancos = 100 * (votos_brancos/num_total); //Item 7
        
        // Saida
        System.out.println("Número total de eleitores: "+num_total);
        System.out.println("Percentual de votos válidos: "+votos_validos);
        System.out.println("Percentual votos válidos candidato A: "+votos_val_a);
        System.out.println("Percentual votos válidos candidato B: "+votos_val_b);
        System.out.println("Percentual votos válidos candidato C: "+votos_val_c);
        System.out.println("Percentual de votos nulos: "+qtd_votos_nulos);
        System.out.println("Percentual de votos em branco: "+qtd_votos_brancos);
    }
}
