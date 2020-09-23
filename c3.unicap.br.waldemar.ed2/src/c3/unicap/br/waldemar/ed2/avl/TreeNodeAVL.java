/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3.unicap.br.waldemar.ed2.avl;

/**
 *
 * @author home
 */
class TreeNodeAVL<KInteger,V> {
    private KInteger key;
    private V value;
    private int height;
    private TreeNodeAVL left,right;
    
    TreeNodeAVL(KInteger key, V value){
        this.key = key;
        this.value = value;
        this.height = 1;
    }

    public KInteger getKey() {
        return key;
    }

    public void setKey(KInteger key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public TreeNodeAVL getLeft() {
        return left;
    }

    public void setLeft(TreeNodeAVL left) {
        this.left = left;
    }

    public TreeNodeAVL getRight() {
        return right;
    }

    public void setRight(TreeNodeAVL right) {
        this.right = right;
    }  
}
