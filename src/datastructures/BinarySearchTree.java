package datastructures;

public class BinarySearchTree {
    private BSTNode root;

    public void insert(int value){
        if(root == null){
            root.setValue(value);
        }
        else{
            BSTNode leafNode = getLeafNode(root, value);
            if(value < leafNode.getValue()){
                leafNode.getLeft().setValue(value);
            }

        }
    }

    public boolean isLeafNode(BSTNode node){
        return node.getLeft() == null && node.getRight() == null;
    }

    public BSTNode getLeafNode(BSTNode node, int valueToInsert){
        if(isLeafNode(node)){
            return node;
        }
        else{
            if(valueToInsert < node.getValue()){
                getLeafNode(node.getLeft(), valueToInsert);
            }
        }
        return null;
    }



}

class BSTNode {
    private BSTNode left;
    private BSTNode right;
    private int value;

    public BSTNode(BSTNode left, BSTNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
