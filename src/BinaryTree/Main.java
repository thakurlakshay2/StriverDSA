package BinaryTree;

import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {

        TreeNode tree=TreeNode.createTree(new int[]{1,2,3,4,5,6,7,8});
        TreeNode.preOrder(tree);
        System.out.println();
        TreeNode.postOrder(tree);
        System.out.println();
        TreeNode.inOrder(tree);
        System.out.println();
        TreeNode.morrieInorder(tree);
        TreeNode.morriePreorder(tree);
        TreeNode.leftView(tree);
        TreeNode.rightView(tree);
        TreeNode.bottomView(tree);
        TreeNode.topView(tree);

        TreeNode.rootToNodePath(tree,7);
        TreeNode.widthOfTree(tree);
    }
}
