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
        TreeNode.maxPathSum(tree);

        int preorder[] = {10,20,40,50,30,60};
        int inorder[] = {40,20,50,10,60,30};
        TreeNode root = TreeNode.constructTreeUsingInAndPre(inorder, preorder);
        TreeNode.preOrder(root);
        System.out.println();
        TreeNode.inOrder(root);
        System.out.println();

        int inorder1[] = {9,3,15,20,7};
        int postorder[] = {9,15,7,20,3};
        TreeNode root1 = TreeNode.constructTreeUsingInAndPost(inorder1, postorder);
        TreeNode.postOrder(root1);
        System.out.println();
        TreeNode.inOrder(root1);
        System.out.println();
        TreeNode.symetric(tree);
    }
}
