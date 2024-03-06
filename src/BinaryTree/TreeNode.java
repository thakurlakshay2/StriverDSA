package BinaryTree;

import java.util.*;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;

    public int val;
    public int hd;

    public static int diameterTreeNode;

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

    public static void levelOrder(TreeNode root){
        Queue<TreeNode> levelOrder=new LinkedList<>();

        levelOrder.add(root);
        while (!levelOrder.isEmpty()){
            TreeNode l=levelOrder.poll();
            System.out.print(l.val+" ");
            if(l.left!=null) levelOrder.add(l.left);
            if(l.right!=null) levelOrder.add(l.right);

        }
        System.out.println();
    }

    public static void height(TreeNode root){
        System.out.println(h(root));
    }
    private static int h(TreeNode root){
        if(root==null){
            return 0;
        }
        int h1=h(root.left);
        int h2=h(root.right);

        return Math.max(h1,h2)+1;

    }
    public static void diameter(TreeNode root){
            dia(root);
            System.out.println(diameterTreeNode);
    }

    private static int dia(TreeNode root){
        if(root==null){
            return 0;
        }
        int h1=h(root.left);
        int h2=h(root.right);

        diameterTreeNode=Math.max(h1+h2+1,diameterTreeNode);
        return Math.max(h1,h2)+1;

    }

    public static void balancedTree(TreeNode root){
        System.out.println( dfsHeight(root)==-1?"Unbalanced":"Balanced");
    }
    private static int dfsHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=dfsHeight(root.left);
        if(leftHeight==-1){
            return -1;
        }
        int rightHeight=dfsHeight(root.right);
        if(rightHeight==-1){
            return -1;
        }

        if(Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }

        return Math.max(leftHeight,rightHeight)+1;
    }
    public static TreeNode lca(TreeNode root,TreeNode x,TreeNode y){
        if(root==null || root==x || root==y){
            return root;
        }
        TreeNode left=lca(root.left,x,y);
        TreeNode right=lca(root.right,x,y);
        if(left==null || right==null){
            return left;
        }else {
            return root;
        }

    }
    public static boolean identicalTree(TreeNode root,TreeNode tree){
        if(root==null && tree==null){
            return true;
        }
        if(root.val!=tree.val){
            return false;
        }

        boolean left=identicalTree(root.left,tree.left);
        boolean right=identicalTree(root.right,tree.right);

        return left&& right;

    }

    public static void zigZagTravel(TreeNode root){
        Queue < TreeNode > queue = new LinkedList<>();
        ArrayList < ArrayList < Integer >> wrapList = new ArrayList < > ();


        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            ArrayList < Integer > subList = new ArrayList < Integer > (levelNum);
            for (int i = 0; i < levelNum; i++) {
                int index = i;
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (flag == true) subList.add(queue.poll().val);
                else subList.add(0, queue.poll().val);
            }
            flag = !flag;
            wrapList.add(subList);
        }
        for(ArrayList<Integer> val:wrapList){
            for(int v:val){
                System.out.print(v+" ");
            }
        }
        System.out.println();
    }
    public static void boundaryTraversal(TreeNode root){

    }
    public static void maxPathSum(TreeNode root){
        int[] n=new int[1];
        mps(root,n);
        System.out.println(n[0]);
    }
    private static int mps(TreeNode root,int[] maxSum){
        if(root==null){
            return 0;
        }

        int left=mps(root.left,maxSum);
        int right=mps(root.right,maxSum);

        maxSum[0]=Math.max(left+right+root.val,maxSum[0]);

        return Math.max(left,right)+root.val;
    }

    public static TreeNode constructTreeUsingInAndPre(int[] inorder,int[] preorder){
        Map < Integer, Integer > inMap = new HashMap < Integer, Integer > ();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1, 0,
                inorder.length - 1, inMap);
    }
    private static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int inStart, int inEnd, Map < Integer, Integer > inMap ){

        if (preStart > preEnd || inStart > inEnd ) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);

        int numsLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd,
                inRoot + 1, inEnd, inMap);

        return root;
    }
    public static TreeNode constructTreeUsingInAndPost(int[] inorder,int[] postorder){
        Map < Integer, Integer > inMap = new HashMap < Integer, Integer > ();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode root = buildTreepost(postorder, 0, postorder.length - 1, 0,
                inorder.length - 1, inMap);
        return root;
    }
    private static TreeNode buildTreepost(int[] postorder, int postStart, int postEnd, int inStart, int inEnd, Map < Integer, Integer > inMap ){

        if (postStart > postEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inEnd - inRoot ;

        root.left = buildTreepost(postorder, postStart, postEnd-1-numsLeft ,
                inStart, inRoot - 1, inMap);
        root.right = buildTreepost(postorder, postStart , postEnd-1,
                inRoot + 1, inEnd, inMap);

        return root;
    }

    public static void symetric(TreeNode root){
        boolean syme=sym(root,root);
        System.out.println(syme);
    }
    private  static boolean sym(TreeNode l1, TreeNode l2){

        if(l1==null || l2==null){
            return l1==l2;
        }
        if(l1.val!=l2.val){
            return false;
        }
        boolean lsym=sym(l1.left,l2.right);
        boolean rsym=sym(l1.right,l2.left);

        return lsym && rsym;
    }
}
