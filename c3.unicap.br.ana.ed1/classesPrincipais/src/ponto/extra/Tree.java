/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto.extra;

public class Tree<T extends Comparable<T>> {
    
    private TreeNode<T> root;
    
    public void insert(T value){
        if(root == null){
            root = new TreeNode(value);
        }else{
            root.insertNode(root,value);
        }
    } // fim insert
    
    public T find(T value){
        if(root == null){
            return null;
        }else{
            return root.findNode(value);
        }
    } // fim find
    
    public void remove(T value){
        if(root == null){
            System.out.println("Árvore vazia.");
        }else{
            root = remove(root,value);
        }
    } // fim remove
    
    private TreeNode<T> remove(TreeNode<T> r, T value){
        if(r == null){
            System.out.println("Elemento não encontrado.");
        }else if(value.compareTo(r.getInfo()) == 0){ //encontrou o valor a ser removido
            TreeNode<T>pai,filho;
            if(r.getLeft() == null && r.getRight() == null){//não tem filhos
                r = null;
            }else if(r.getLeft() == null){ // não tem filho da esquerda
                r = r.getRight();
            }else if(r.getRight() == null){ // não tem filho a direita
                r = r.getLeft();
            }else{//tem os dois filhos
                pai = r;
                filho = pai.getLeft();
                while(filho.getRight()!= null){
                    pai = filho;
                    filho = pai.getRight();
                }
                pai.setRight(filho.getLeft());
                r.setInfo(filho.getInfo());
            } // fim remoção do nó
        }else if(value.compareTo(r.getInfo()) < 0){//valor menor doq raiz
            r.setLeft(remove(r.getLeft(),value));
        }else{
            r.setRight(remove(r.getRight(), value));
        }
        return r;
    } // fim private remove
    
    public void emOrdem(){
        if(root == null){
            System.out.println("Árvore vazia.");
        }else{
            percorrerEmOrdem(root);
        }
    }
    
    private void percorrerEmOrdem(TreeNode<T> r){
        if(r!= null){
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    } // fim percorrerEmOrdem
}
