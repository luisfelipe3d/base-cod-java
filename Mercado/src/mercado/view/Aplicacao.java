/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.view;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Aplicacao {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int menuIni = menuInicial();
        int menuCli, menuAdm;
        
        do{
            switch(menuIni){
                case 1:
                //TODO mudar para uma forma melhor
                menuCli = menuCliente();
                if(menuCli == 1){
                    System.out.println("Efetuar Login Cliente");
                }else if (menuCli == 2){
                    System.out.println("Cadastro Cliente");
                }else if (menuCli == 3){
                    System.out.println("Saindo.. Cliente");
                    
                }else{
                    System.out.println("Inválido MenuCliente()");
                }
                break;
            case 2:
                //TODO mudar para uma forma melhor
                menuAdm = menuAdministrativo();
                if(menuAdm == 1){
                    System.out.println("Efetuar Login Cliente");
                }else if (menuAdm == 2){
                    System.out.println("Cadastro Cliente");
                }else if (menuAdm == 3){
                    System.out.println("Saindo.. Cliente");
                }else{
                    System.out.println("Inválido MenuCliente()");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                menuInicial();
            }
            
        }while(menuIni != 3);
    }
    
    public static int menuInicial(){
        int opcao;
        System.out.print("Mercado Intelejumento v1.0\n"
                + "1. Àrea do Cliente\n"
                + "2. Área do Administrador\n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    public static int menuCliente(){
        int opcao;
        System.out.println("BEM VINDO AO CORONGA-MARKET!");
        System.out.print("Escolha a opção desejada: \n"
                    + "1. Efetuar login \n"
                    + "2. Realizar cadastro \n"
                    + "3. Sair\n"
                    + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
    public static int menuAdministrativo(){
        int opcao;
        System.out.print("ÁREA ADMINISTRATIVA \n"
                + "1. Efetuar login \n"
                + "2. Sair\n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
}
