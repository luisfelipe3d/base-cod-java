/*
Exercicio :
Faça um procedimento que permita a uma empresa atacadista de cimento controlar 
os pedidos de compra e o estoque do produto. Esse procedimento recebe como 
parâmetros a quantidade de sacos de cimento disponíveis no estoque da empresa e 
o preço de cada saco. Em seguida, o procedimento processará os pedidos 
(quantidade indeterminada) de compra dos clientes da empresa de acordo com a 
especificação abaixo:
a)Para cada pedido deverá ser informado o código do cliente e a quantidade de 
sacos da compra;
b)O término do procedimento é detectado quando o código do cliente for zero ou 
quando o estoque mínimo de cem (100) sacos for atingido. Neste caso, deverá ser 
impressa a quantidade de sacos final em estoque.
c)Um pedido só poderá ser aceito (processado) se a quantidade de sacos 
disponíveis no estoque for maior ou igual à quantidade de sacos do pedido e se
a quantidade de sacos do pedido não ultrapassar 10% (dez por cento) do total 
de sacos disponíveis no estoque.
d)Se o pedido for aceito, o programa deverá imprimir o código do cliente, 
a quantidade de sacos pedidos e o valor do pedido, além de atualizar o estoque
com a quantidade de sacos vendidos. 
e)Se o pedido for rejeitado, uma das mensagens “Estoque Insuficiente!” ou 
“Estoque Ultrapassou o Máximo Permitido!” deverá ser exibida, conforme o 
motivo da rejeição do pedido.
 */
package lista12;
import java.util.Scanner;

public class Exercicio8_lista12 {
    
    static void controlaPedidos(int estoque, double preco){
        Scanner in = new Scanner (System.in);
        int cod,qtd_compra,aux;
        
        do {
            System.out.print("Código do cliente: ");
            cod = in.nextInt();
            System.out.println("QTD de sacos para compra: ");
            qtd_compra = in.nextInt();
            aux = (int) (estoque * 0.10);
            if (estoque <= 100){
                System.out.println("Qtd de sacos em estoque: "+estoque);
                System.out.println("Estoque insuficiente.");
            }
            else if (estoque >= qtd_compra && qtd_compra <= aux){
                System.out.println("Processando...");
                System.out.println("Código do cliente: "+cod);
                System.out.println("QTD de sacos pedidos: "+qtd_compra);
                System.out.println("Valor do pedido: "+qtd_compra*preco);
                estoque = estoque - qtd_compra;
            }
            else
                System.out.println("Estoque ultrapssou o máximo permitido.");
            
            
            
        } while (cod == 0 || estoque <= 100);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int estoque,op;
        double preco;
        
        do{
            System.out.print("QTD de estoque: ");
            estoque = in.nextInt();
            if (estoque <= 0)
                System.out.println("QTD de estoque inválida.");
        } while (estoque <= 0);
        
        do{
            System.out.print("Preço por unidade: ");
            preco = in.nextDouble();
            if (preco <= 0)
                System.out.println("Preço inválido.");
        } while (preco <= 0);
        
        controlaPedidos(estoque,preco);
    }
    
    
}
