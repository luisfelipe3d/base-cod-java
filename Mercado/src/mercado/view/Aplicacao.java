
package mercado.view;

import java.util.Scanner;


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
            switch (menuAdm) {
                case 1:
                    System.out.println("Efetuar Login ADM");
                    break;
                case 2:
                    System.out.println("Cadastro ADM");
                    break;
                case 3:
                    System.out.println("Saindo.. ADM");
                    break;
                default:
                    System.out.println("Inválido MenuADM()");
                    break;
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
        System.out.print("Área do Administrador \n"
                + "1. Efetuar login \n"
                + "2. Cadastrar Administrador\n"
                + "3. Sair\n"
                + "Opção: ");
        opcao = in.nextInt();in.nextLine();
        return opcao;
    }
    
}
