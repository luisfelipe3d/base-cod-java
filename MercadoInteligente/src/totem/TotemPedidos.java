package totem;

import java.util.Scanner;

import administrativo.*;
import compra.CarrinhoCompras;


public class TotemPedidos {

    Scanner in = new Scanner(System.in);
    CarrinhoCompras carrinhoAtual;
    Cliente clienteAtual;
    Loja mercado;

    public TotemPedidos(Loja mercado) {
        this.mercado = mercado;
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("BEM VINDO AO CORONGA-MARKET!");
            System.out.print("Escolha a opção desejada: \n"
                    + "1. Efetuar login \n"
                    + "2. Realizar cadastro \n"
                    + "3. Sair\n"
                    + "Opção: ");
            opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    efetuarLogin();
                    break;
                case 2:
                    realizarCadastro();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public boolean login(String user, String pass){
        if(user.isEmpty() || pass.isEmpty()){
            return false;
        }
        Usuario temp;
        String tempUser = user.toUpperCase();
        String tempPass = pass.toUpperCase();
        temp = 
        
    }
    
    private void efetuarLogin() {
        System.out.println("Informe seu login: ");
        String login = in.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = in.nextLine();

        Usuario usuario = validarLogin(login, senha);
        if (usuario != null) {
            clienteAtual = (Cliente)usuario;

            int op;
            do {
                System.out.println("Seja bem-vindo " + usuario.getNome());

                System.out.println("Escolha a opção desejada: \n"
                        + "1- Visualizar catalogo \n"
                        + "2- Visualizar carrinho \n"
                        + "0- Sair");
                op = in.nextInt();

                switch (op) {
                    case 0:
                        System.out.println("Volte sempre!");
                        System.exit(0);
                        break;
                    case 1:
                        visualizarCatalogo(clienteAtual);
                        break;
                    case 2:
                        if(clienteAtual.getCarrinho()==null){
                            System.out.println("Carrinho vazio");
                        }
                        else{
                            clienteAtual.getCarrinho().listarProdutos();
                        }
                        break;
                    default:
                        System.out.println("Opçãoo inválida!");
                }
            } while (op != 0);

        } else {
            System.out.println("Usuário não cadastrado!");
        }

    }

    private Usuario validarLogin(String login, String senha) {
        return mercado.validarLogin(login, senha);
    }

    private void realizarCadastro() {
        System.out.println("Informe seu CPF: ");
        String CPF = in.nextLine();
        System.out.println("Informe seu nome: ");
        String nome = in.nextLine();
        System.out.println("Informe seu telefone: ");
        String telefone = in.nextLine();
        System.out.println("Informe seu login: ");
        String login = in.nextLine();
        System.out.println("Informe seu senha: ");
        String senha = in.nextLine();

        Cliente cliente = new Cliente(CPF, nome, telefone, login, senha);
        mercado.addUsuario(cliente);
    }

    private void visualizarCatalogo(Cliente usuario) {
        mercado.getEstoque().listarProdutos();
        CarrinhoCompras carrinho = new CarrinhoCompras(mercado);
        carrinhoAtual = carrinho;

        System.out.println("Gostaria de adicionar algo ao seu carrinho? \n"
                + "1- Sim \n"
                + "2- Não");
        int op = in.nextInt();

        switch (op) {
            case 1:
                int opcao;
                do {
                    System.out.println("Informe o código do produto: ");
                    int codigo = in.nextInt();
                    carrinho.adicionarItem(codigo);

                    System.out.println("Adicionar outro produto? \n"
                            + "1- Sim \n"
                            + "2- Não");
                    opcao = in.nextInt();
                } while (opcao == 1);
                usuario.adicionarCarrinho(carrinho);
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida!");

        }

    }
}
