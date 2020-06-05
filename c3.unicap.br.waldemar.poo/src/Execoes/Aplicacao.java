/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execoes;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Aplicacao {
    static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) throws NumberFormatException,
        	AcimaDeCemException {
    	int op;
   	 
    	final String menu =
            	" 	_   _   _   	_ 	_       	_  	\n" +
            	"	/ \\ | |_(_)_   _(_) __| | __ _  __| | ___ \n" +
            	"   / _ \\| __| \\ \\ / / |/ _` |/ _` |/ _` |/ _ \\\n" +
            	"  / ___ \\ |_| |\\ V /| | (_| | (_| | (_| |  __/\n" +
            	" /_/   \\_\\__|_| \\_/ |_|\\__,_|\\__,_|\\__,_|\\___|\n";
   	 
    	do{
        	System.out.println(menu);
        	System.out.println("1 - Questão1()");
        	System.out.println("2 - Questão2()");
        	System.out.println("3 - Sair");
        	System.out.print("Opção: ");
        	op = in.nextInt();in.nextLine();
        	switch(op){
            	case 1:
                	questao1();break;
            	case 2:
                	questao2();break;
            	case 3:
                	System.out.println("Fim do Programa.");break;
            	default:
                	System.err.println("Opção inválida");
        	}
    	}while(op != 3);
   	 
   	 
    	questao1();
    	questao2();
   	 
	}
    
	public static void questao1()throws ArrayIndexOutOfBoundsException,
        	NumberFormatException {
    	int i, valor, posicao;
    	int [] vetorInt = new int[10];
    	String aux1, aux2;
   	 
   	 
    	try{
        	for(i = 0; i < vetorInt.length; i = i + 1){
            	System.out.print("Informe valor: ");
            	aux1 = in.nextLine();
            	valor = Integer.parseInt(aux1);
            	System.out.print("Informe posição: ");
            	aux2 = in.nextLine();
            	posicao = Integer.parseInt(aux2);
            	vetorInt[posicao] = valor;
        	}
    	}catch(ArrayIndexOutOfBoundsException aib){
        	throw new ArrayIndexOutOfBoundsException("(≧︿≦)");
    	}catch(NumberFormatException nfe){
        	throw new NumberFormatException("(︶︹︶)");
    	}finally{
        	//Vida que segue
    	}
	}
    
	public static void questao2() throws NumberFormatException,
        	AcimaDeCemException { // Dúvida se pode colocar isso <----
    	int valor, contador = 0, somaAtual = 0;
    	String aux;
   	 
    	while(somaAtual < 100){
        	try{
           	 
            	System.out.print("Informe número: ");
            	aux = in.nextLine();
            	valor = Integer.parseInt(aux);
            	somaAtual = somaAtual + valor;
            	contador = contador + 1;
           	 
            	if(somaAtual > 100){
                	throw new AcimaDeCemException();
            	}
        	}catch(NumberFormatException nfe){
             	throw new NumberFormatException("(︶︹︶)");
       	 
        	}finally{
            	System.out.printf("Soma: %d\n"
                    	+ "Contador: %d\n"
                    	+ "Média: %.2f\n",somaAtual, contador,
                    	(float)(somaAtual/contador));
        	}
    	}   
	}//fim questao2   

}//fim atividade


