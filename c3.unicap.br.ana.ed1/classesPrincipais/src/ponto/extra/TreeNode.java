/*

*/
package ponto.extra;

class TreeNode<T extends Comparable<T>> {
    private TreeNode<T> left;
    private T info;
    private TreeNode<T> right;
    
    TreeNode(T value){
        this.info = value;
    }

    TreeNode<T> getLeft() {
        return left;
    }

    void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    T getInfo() {
        return info;
    }

    void setInfo(T info) {
        this.info = info;
    }

    TreeNode<T> getRight() {
        return right;
    }

    void setRight(TreeNode<T> right) {
        this.right = right;
    }
    
    int compareTo(T value){
        return this.info.compareTo(value);
    }
    
    TreeNode<T> insertNode(TreeNode<T> r, T value){
        if(r == null){
            r = new TreeNode<T> (value);
        }else if(value.compareTo(r.getInfo()) < 0){
            r.setLeft(insertNode(r.getLeft(), value));
        }else{
            r.setRight(insertNode(r.getRight(), value));
        }
        return r;
    }
    
    T findNode(T value){
        if(value.compareTo(this.info) == 0){
            return this.info;
        }else if (value.compareTo(this.info) < 0){
            if(this.left == null){
                return null;
            }else{
                return this.left.findNode(value);
            }
        }else{
            if(this.right == null){
                return null;
            }else{
                return this.right.findNode(value);
            }
        } 
    } // fim findNode
}
