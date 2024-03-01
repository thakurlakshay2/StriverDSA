package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;

    public int val;
    public int hd;

    public TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
        this.hd=0;

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
        this.hd=0;
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

    public static void leftView(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        lw(root,ans,0);
        for(int val:ans){
            System.out.print(val+" ");
        }
        System.out.println();

    }
    private static void lw(TreeNode root,List<Integer> l , int height){
        if(root==null){
            return ;
        }
        if(height==l.size()){
            l.add(root.val);
        }
        lw(root.left,l,height+1);
        lw(root.right,l,height+1);
    }

    public static void rightView(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        rw(root,ans,0);
        for(int val:ans){
            System.out.print(val+" ");
        }
        System.out.println();

    }
    private static void rw(TreeNode root,List<Integer> l , int height){
        if(root==null){
            return ;
        }
        if(height==l.size()){
            l.add(root.val);
        }
        rw(root.right,l,height+1);
        rw(root.left,l,height+1);
    }

    public  static void bottomView(TreeNode root){

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        root.hd = 0;
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.val);
            if(temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if(temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue()+" ");
        }
        System.out.println();
    }

    public  static void topView(TreeNode root){

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        root.hd = 0;
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            int hd = temp.hd;
            if(!map.containsKey(hd))map.put(hd, temp.val);
            if(temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if(temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue()+" ");
        }
        System.out.println();
    }
    public static void rootToNodePath(TreeNode root, int find){

        List<Integer> ans=new ArrayList<>();
        rtn(root,ans,find);
        for(int val:ans){
            System.out.print(val+" ");
        }
        System.out.println();

    }
    private static boolean rtn(TreeNode root, List<Integer> ans, int find){
        if(root==null){
            return false;
        }

        ans.add(root.val);
        if(root.val==find){
            return true;
        }
        if(rtn(root.left,ans,find) || rtn(root.right,ans,find)){
            return true;
        }

        ans.remove(ans.size()-1);

        return false;
    }
    public static void widthOfTree(TreeNode root){
        Queue<TreeNode> que=new LinkedList<>();
        int max=0;
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            max=Math.max(size,max);


            for(int i=0;i<size;i++){
                TreeNode r=que.poll();
                if(r==null){
                    continue;
                }
                que.add(r.left);
                que.add(r.right);
            }
        }
        System.out.println(max);
    }
}
