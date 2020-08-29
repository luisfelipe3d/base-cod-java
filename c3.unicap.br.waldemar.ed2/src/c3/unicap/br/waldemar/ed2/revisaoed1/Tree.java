/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.unicap.br.waldemar.ed2.revisaoed1;

/**
 *
 * @author home
 * @param <T>
 */
public class Tree <T extends Comparable<T>> {
    private TreeNode root;
    
    private boolean isEmpty(){
        return this.root == null;
    }
    
    public void insert(T value){
        if(isEmpty()){
            this.root = new TreeNode(value);
        } else {
          root.insertNode(value);
        }
    }
    
    public void remove(T value){
        if(isEmpty()){
            System.out.println("Tree is empty");
        } else {
            this.root = remove(this.root, value);
        }
    }
    
    public T find(T value){
        if(isEmpty()){
            return null;
        } else {
            return (T) root.findNode(value);
        } 
    }
       
     /**
     * Print the Tree values in-order
     */
    public void printTree() {
        printTree(this.root);
        System.out.println();
    }
    /**
     * Print the Binary Tree
     * @param x recive int value 1-3
     * 
     */
    public void printTree(int x){
        switch(x){
            case 1://preorder
                printTreePre(this.root);
                System.out.println();
                break;
            case 2://inorder
                printTree(this.root);
                System.out.println();
                break;
            case 3://postorder
                printTreePos(this.root);
                System.out.println();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
    
    private void printTree(TreeNode<T> root) {
        if (root != null) {
            printTree(root.getLeft());
            System.out.print(root.getData() + "  ");
            printTree(root.getRight());
        }
    } 
    
    private void printTreePre(TreeNode<T> root) {
        if (root != null){
            System.out.print(root.getData() + "  ");
            printTreePre(root.getLeft());
            printTreePre(root.getRight());
        }
    }
    
    private void printTreePos(TreeNode<T> root) {
        if(root != null){
            printTreePos(root.getLeft());
            printTreePos(root.getRight());
            System.out.print(root.getData() + "  ");
        }
    }

    private TreeNode<T> remove(TreeNode<T> root, T value) {
        if(isEmpty()){
            System.out.println("Element not found.");
        } else if (value.compareTo(root.getData()) == 0){
            //code of remove
            TreeNode<T> father,son;
            if(root.getLeft() == null && root.getRight() == null){ // no childrens
                root = null;
            } else if(root.getLeft() == null) {// dosen't have children of left
                root = root.getRight();
            } else if (root.getRight() == null) { // dosen't have children of right
                root = root.getLeft();
            } else { // has two childrens
                father = root;
                son = father.getLeft();
                while(son.getRight() != null) {
                    father = son;
                    son = son.getRight();
                }
                father.setRight(son.getLeft());
                root.setData(son.getData());
            }
        } else if (value.compareTo(root.getData()) < 0) {
            root.setLeft(remove(root.getLeft(), value));
        } else {
            root.setRight(remove(root.getRight(), value));
        }
        return root;
    }
}
