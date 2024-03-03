package BinaryTree;

import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {

        TreeNode tree=TreeNode.createTree(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
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

        TreeNode.levelOrder(tree);
        TreeNode.height(tree);
        TreeNode.diameter(tree);
        TreeNode.balancedTree(tree);
        System.out.println(TreeNode.lca(tree, tree.left.left,tree.left.right).val);

        TreeNode secondTree=TreeNode.createTree(new int[]{1,2,3,4,5,6,7,9,8,10,11,12,13});
        System.out.println(TreeNode.identicalTree(tree,secondTree));
        TreeNode.zigZagTravel(tree);
    }
}
