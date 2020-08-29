/*
Você deve Implementar em Java uma árvore Binária de Pesquisa.
Ela deve ter as seguintes funções:
1. encontrarElemento(int chave) - deve verificar se uma chave está presente 
na árvore.
2. insereElemento(int chave) - deve inserir uma chave na árvore.
3. removeElemento(int chave) - deve remover uma chave da árvore 
(considere todos os cenários: remoção de folha, remoção de Nó com um só filho,
e remoção de nó com dois filhos)
4. ImprimeEmOrdem() 
5. ImprimePreOrdem()
6. ImprimePosOrdem()
 */
package c3.unicap.br.waldemar.ed2.revisaoed1;

/**
 *
 * @author home
 */
public class Application {
    public static void main(String[] args) {
        int[] numbers = {17,13,4,7,5,9,20,13};
        Tree<Integer> bst = new Tree();
        for (int n : numbers) {
            bst.insert(n);
        }
        
        System.out.print("In order: ");
        bst.printTree(); // print in-order
        System.out.print("Pre oder: ");
        bst.printTree(1); // print pre-order
        System.out.print("In order: ");
        bst.printTree(2); // print in-order
        System.out.print("Post order: ");
        bst.printTree(3); // print pos-order
        bst.remove(17);
        bst.printTree(1);

    }
    
}
