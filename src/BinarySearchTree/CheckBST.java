package BinarySearchTree;

public class CheckBST {

    public boolean check(BinarySearchTree tree){
        if(tree==null){
            return true;
        }
            if(tree.left==null && tree.right==null ){
                return true;
            }
            if(tree.left==null  && tree.right.val<tree.val){
                    return false;
            }else if(tree.right==null && tree.val<tree.left.val){
                return false;
            }
           else if(tree.left !=null && tree.right!=null && (tree.val<tree.left.val || tree.val>tree.right.val)){
                return false;
            }

        Boolean left=check(tree.left);
        Boolean right=check(tree.right);


        return left && right;
    }
}
