/*

 */
package c3.unicap.br.waldemar.ed2.revisaoed1;

/**
 *
 * @author home
 */
class TreeNode <T extends Comparable<T>> {
    private T data;
    private TreeNode<T> left,right;
    
    public TreeNode(T data){
        this.data = data;
    }
    
    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
    
    void insertNode(T value) {
        if(this.compareTo(value) == 0){
            if (this.right == null) {
                this.right = new TreeNode(value);
            } else {
                this.right.insertNode(value);
            }
        } else if (this.compareTo(value) < 0){
            if (this.left == null) {
                this.left = new TreeNode(value);
            } else {
                this.left.insertNode(value);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode(value);
            } else {
                this.right.insertNode(value);
            }
        }
    }
    
    T findNode(T value) {
        if(value.compareTo(this.data) == 0){
            return this.data;
        } else if (value.compareTo(this.data) < 0) {
            if(this.left == null) {
                return null;
            } else {
                return this.left.findNode(value);
            }
        } else {
            if(this.right == null) {
                return null;
            } else {
                return this.right.findNode(value);
            }
        }
    }
    
    public int compareTo(T value){
        return value.compareTo(this.data);
    }
}
