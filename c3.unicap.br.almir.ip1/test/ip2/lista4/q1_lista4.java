/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip2.lista4;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q1_lista4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean[] aJanela = new boolean[12];
        boolean[] bCorredor = new boolean[aJanela.length];
        boolean[] cJanela = new boolean[aJanela.length];
        boolean[] dCorreador = new boolean[aJanela.length];

        int op,dia,mes,ano;
        
        do{
            System.out.println("Empresa Viagem Bem");
            System.out.println("1 - Itinerário Recife-Fortaleza");
            System.out.println("2 - Encerra programa");
            System.out.print("Opção: ");
            op = in.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Informe uma data: ");
                    //verifica dia
                    do{
                        System.out.print("Dia: ");
                        dia = in.nextInt();
                        if (dia < 1 || dia > 31)
                            System.out.println("Dia inválido. Tente novamente.");
                    } while (dia < 1 || dia > 31);
                    // verifica mês
                    do{
                        System.out.print("Mês: ");
                        mes = in.nextInt();
                        if (mes < 1 || mes > 12)
                            System.out.println("Mês inválido. Tente novamente.");
                    } while (mes < 1 || mes > 12);
                    // verifica ano
                    do{
                        System.out.print("Ano: ");
                        ano = in.nextInt();
                        if (ano < 2018)
                            System.out.println("Ano inválido. Tente novamente.");
                    } while (ano < 2018);
                    
                    checkData(dia,mes,ano);
                    break;
                case 2:
                    System.out.println("Fim programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
            } // end switch
            
        } while (op != 2);
    } // end psvm
    
    static void checkData(int dia, int mes, int ano){
        Scanner in = new Scanner(System.in);
        // verifica se fev tem mais de 28 dias
        int[] vMes = {2,4,6,9,11};
        
        for (int i = 0; i < vMes.length; i++){
            
            if (mes == vMes[i]){
                
                if(mes == 2 && dia > 28){
                    System.out.println("Fevereiro não tem mais de 28 dias.");
                    do{
                        System.out.println("Dia: ");
                        dia = in.nextInt();
                        if (dia > 28)
                            System.out.println("Fev não pode ter mais de 28dias.");
                    } while (dia > 28);
                } else if (dia > 30){
                    System.out.println("Este mês não tem mais de 30 dias.");
                    do{
                        System.out.print("Dia: ");
                        dia = in.nextInt();
                        if (dia > 30)
                            System.out.println("Este mês não tem mais de 30dias.");
                    } while (dia > 30);
                }// end else if
            } // end if    
        } // end for
        System.out.println("Data válida.");
            
    } // end CheckData
    
} // end public class
