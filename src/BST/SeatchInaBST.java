package BST;

public class SeatchInaBST {

    public BinarySearchTree searchBST(BinarySearchTree tree,int val){
            if(tree==null){
                return null;
            }
            if(tree.val == val){
                return tree;
            }

        BinarySearchTree left=searchBST(tree.left,val);
        BinarySearchTree right=searchBST(tree.right,val);
        return left==null?right : left;
    }
}
