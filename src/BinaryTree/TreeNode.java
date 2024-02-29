package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;

    public int val;

    public TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;

    }
    public static  TreeNode createTree (int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nums.length) {
            TreeNode curr = q.remove();
            curr.left = new TreeNode(nums[i++]);
            q.add(curr.left);
            if (i < nums.length) {
                curr.right = new TreeNode(nums[i++]);
                q.add(curr.right);
            }
        }
        return root;
    }
    public TreeNode(TreeNode left, TreeNode right,int val) {
        this.left = left;
        this.right = right;
        this.val=val;
    }

    public static void preOrder(TreeNode tree){
        if(tree==null){
            return ;
        }
        System.out.print(tree.val+" ");
        preOrder(tree.left);
        preOrder(tree.right);
    }
    public static void postOrder(TreeNode tree){
        if(tree==null){
            return ;
        }

        postOrder(tree.left);

        postOrder(tree.right);
        System.out.print(tree.val+" ");
    }
    public static void inOrder(TreeNode tree){
        if(tree==null){
            return ;
        }
        inOrder(tree.left);
        System.out.print(tree.val+" ");
        inOrder(tree.right);

    }
    public static void  morrieInorder(TreeNode root){
        List<Integer> inorder = new ArrayList<>();

        TreeNode cur = root;
        while(cur != null) {
            if(cur.left == null) {
                inorder.add(cur.val);
                cur = cur.right;
            }
            else {
                TreeNode prev = cur.left;
                while(prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if(prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                }
                else {
                    prev.right = null;
                    inorder.add(cur.val);
                    cur = cur.right;
                }
            }
        }

        for(int val:inorder){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void morriePreorder(TreeNode root){
        ArrayList < Integer > preorder = new ArrayList < > ();
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                preorder.add(cur.val);
                cur = cur.right;
            } else {
                TreeNode prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = cur;
                    preorder.add(cur.val);
                    cur = cur.left;
                } else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        for(int val:preorder){
            System.out.print(val+" ");
        }
        System.out.println();
    }

}
