/*
Faça um programa para controlar o estoque de mercadorias de uma empresa. 
Inicialmente, o programa deverá preencher três vetores com cinquenta posições
cada, onde o primeiro armazenará o código dos produtos, o segundo armazenará 
a quantidade total de cada produto no estoque e o terceiro armazenará o preço 
(valor unitário) dos produtos. Logo após o preenchimento dos vetores, o programa
deverá apresentar um menu principal fornecendo ao usuário as seguintes opções:
1 – Venda de produto
2 – Consulta de estoque
3 - Atualização de estoque 
4 – Atualização de preço
5 – Encerrar programa
Ao término do programa, este deverá exibir os códigos de todos os produtos 
cadastrados com seus respectivos estoques atualizados e preços.
O programa deverá apresentar os seguintes subprogramas:
(a) Procedimento para venda de um produto. Este procedimento deverá receber 
como parâmetros os três vetores (o de códigos, o de quantidades e o de preços),
o código do produto pretendido e a quantidade desejada do produto. 
O procedimento deverá verificar se o código existe (utilizando a função do item 
(b). Se não existir, deve informar “Código inexistente”. Se o código existir, 
deve tentar atender o pedido:
- Se o pedido puder ser atendido (quantidade solicitada menor ou igual a 
quantidade em estoque), o programa deve subtrair a quantidade vendida da 
quantidade em estoque e informar “Pedido atendido. Valor total da compra: 
R$ _______” Se, após atender o pedido, o estoque do produto ficar zerado, emitir
a seguinte mensagem: “Estoque zerado. Favor, entrar em contato o fornecedor do
produto”. - Se a quantidade existente for menor que a quantidade pretendida pelo
cliente, o programa deve informar “Não temos estoque suficiente desta mercadoria.
Favor consultar estoque”. 
(b) Função para, dados como parâmetros o vetor de códigos e um código de
produto, retornar a posição no vetor onde o código foi encontrado ou -1 caso
não encontre.
(c) Procedimento para consultar o estoque e o preço de um produto. Este 
procedimento deverá receber como parâmetros os três vetores (o de códigos, o de
quantidades e o de preços) e o código do produto cujo estoque será consultado. 
O procedimento deverá verificar se o código existe (utilizando a função do item
(b)). Se não existir, deve informar “Código inexistente”. Se o código existir,
o procedimento deverá exibir a quantidade existente no estoque e o preço.
(d) Procedimento para atualizar o estoque de um produto. Este procedimento 
deverá receber como parâmetros dois vetores (o de códigos e o de quantidades), 
o código do produto cujo estoque será atualizado e a quantidade do produto a 
ser acrescida. O procedimento deverá verificar se o código existe (utilizando 
a função do item (b)). Se não existir, deve informar “Código inexistente”. 
Se existir, deverá somar a quantidade informada à quantidade já existente no 
estoque.
(e) Procedimento para atualizar o preço de um produto. Este procedimento deverá 
receber como parâmetros dois vetores (o de códigos e o de preços), o código do 
produto cujo preço será atualizado e o novo preço. O procedimento deverá 
verificar se o código existe (utilizando a função do item (b)). Se não existir,
deve informar “Código inexistente”. Se existir, deverá alterar o preço do produto.
OBS1: O programador é livre para definir outros subprogramas, caso ache necessário.
OBS2: O vetor de códigos não pode ter códigos repetidos.
 */
package ip2.lista2;
import java.util.Scanner;
/**
 *
 * @author luisfelipe3d
 */
public class q2_lista2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] codigos = new int [50];
        int[] quantidades = new int [codigos.length];
        double[] precos = new double [codigos.length];
        int op, entrada, qtdItem;
        double novoPreco;
        
        preencheCodigo(codigos);
        preencheQtdItem(quantidades);
        preencheValores(precos);
        
        do{
            System.out.println("****Menu****");
            System.out.println("1 - Venda de produto");
            System.out.println("2 - Consulta de estoque");
            System.out.println("3 - Atualização de estoque");
            System.out.println("4 - Atualização de preço");
            System.out.println("5 - Encerrar programa");
            System.out.print("Opção: ");
            op = in.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Venda Produto: ");
                    System.out.print("Infome o código do produto: ");
                    entrada = in.nextInt();
                    System.out.print("Informe a quantidade de itens: ");
                    qtdItem = in.nextInt();
                    vendaProduto(codigos,quantidades,precos,entrada,qtdItem);
                    break;
                case 2:
                    System.out.println("Consulta Estoque: ");
                    System.out.print("Informe o código do produto: ");
                    entrada = in.nextInt();
                    consultaEstoque(codigos,quantidades,precos,entrada);
                    break;
                case 3:
                    System.out.println("Atualização de estoque: ");
                    System.out.print("Código do produto: ");
                    entrada = in.nextInt();
                    System.out.print("Quantidade a ser acrescentada: ");
                    qtdItem = in.nextInt();
                    atualizaEstoque(codigos,quantidades,entrada,qtdItem);
                    break; 
                case 4:
                    System.out.println("Atualização de preço: ");
                    System.out.print("Código do produto: ");
                    entrada = in.nextInt();
                    System.out.print("Novo preço do produto: ");
                    novoPreco = in.nextDouble();
                    atualizaPreco(codigos,precos,entrada,novoPreco);
                    break;
                case 5:
                    System.out.println("Fim programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            
        } while (op != 5);
    }
    
    static void vendaProduto(int[] codigos, int[] qtdades, double[] precos, 
            int entrada, int qtd){
        if (verificaCod(codigos,entrada) == -1)
            System.out.println("Código inexistente");
        else{
            if (qtdades[entrada] >= qtd){
                qtdades[entrada] -= qtd;
                System.out.println("Pedido atendido.");
                System.out.printf("Valor total da compra: R$ %.2f\n"
                        ,(precos[entrada]*qtd));
                if (qtdades[entrada] == 0)
                    System.out.println("Estoque zerado. Favor entrar em contato"
                            + "com o fornecedor.");
            } else
                System.out.println("Não temos estoque suficiente desta "
                        + "mercadoria. Favor consultar estoque.");
        }
    }
    
    static void consultaEstoque(int[] codigos, int[] qtdades, double[] precos,
            int entrada){
        if (verificaCod(codigos,entrada) == -1)
            System.out.println("Código inexistente");
        else{
            System.out.println("Produto: "+(entrada));
            System.out.println("Quantidade: "+qtdades[entrada]);
            System.out.printf("Preço: R$%.2f\n",precos[entrada]);
        }
    }
    
    static void atualizaEstoque(int[] codigos, int[] qtdades, int entrada,
            int qtd){
        if (verificaCod(codigos,entrada) == -1)
            System.out.println("Código inexistente");
        else{
            System.out.printf("Estoque atual do produto(%d): %d\n",
                    codigos[entrada],qtdades[entrada]);
            qtdades[entrada] += qtd; 
            System.out.println("Atualizando estoque... ");
            System.out.printf("Novo estoque do produto(%d): %d\n",
                    codigos[entrada],qtdades[entrada]);
            System.out.println("Estoque atualizado.");
        }
    }
    
    static void atualizaPreco(int[] codigos, double[] precos, int entrada, 
            double novoPreco){
        if (verificaCod(codigos,entrada) == -1)
            System.out.println("Código inexistente");
        else{
            System.out.printf("Preço atual do produto(%d): R$%.2f\n",
                    codigos[entrada],precos[entrada]);
            System.out.println("Atualizando valores...");
            precos[entrada] = novoPreco;
            System.out.printf("Novo preço do produto(%d): R$%.2f\n",
                    codigos[entrada],precos[entrada]);
            System.out.println("Valor atualizado.");
        }
    }
    
    static int verificaCod(int[] codigos, int cod){
        for (int i = 0; i < codigos.length; i++){
            if (codigos[i] == cod)
                return i;
        }
        return -1;
    }
    
    static void preencheCodigo(int[] vetQ){
        for (int i = 0; i < vetQ.length; i++){
            vetQ[i] = i; 
        }
    }
    
    static void preencheQtdItem(int[] vetX){
        for (int i = 0; i < vetX.length; i++){
            vetX[i] = (int) (Math.random() * ((1000 - 1) + 1) + 1);
        }
    }
    
    static void preencheValores(double[] vetA){
        for (int i = 0; i < vetA.length; i++){
            vetA[i] = Math.random() * ((100 - 1) + 1 ) + 1;
        }
    }
    
}
