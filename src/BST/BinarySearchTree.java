package BST;

import java.util.LinkedList;

public   class BinarySearchTree {
    BinarySearchTree left;
    BinarySearchTree right;
    int val;

    public BinarySearchTree(int val) {
        this.val = val;
        this.left=null;
        this.right=null;
    }

    public static BinarySearchTree constructTree(int[] data){
        return construct(data,data.length-1,0);
    }

    private static BinarySearchTree construct(int[] data, int high, int low){
        if(low>high){
            return null;
        }

        int mid= low+(high-low)/2;
        BinarySearchTree treeNode=new BinarySearchTree(data[mid]);

        treeNode.left=construct(data,mid-1,low);
        treeNode.right=construct(data,high,mid+1);
        return  treeNode;
    }

    static int idx;
    public static BinarySearchTree constructPreOrder(int[] data){
        idx=0;
        return constructPre(data,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static BinarySearchTree constructPre(int[] data, int minBound,int maxBound){
        if(idx>=data.length || data[idx]<minBound || data[idx]>maxBound){
            return null;
        }

        BinarySearchTree treeNode=new BinarySearchTree(data[idx++]);

        treeNode.left=constructPre(data,minBound,data[idx]);
        treeNode.left=constructPre(data,data[idx],maxBound);

        return  treeNode;


    }

    public static void printBST(BinarySearchTree tree){
            if(tree==null){
                System.out.print(null+" ");
                return ;
            }

        System.out.print(tree.val+" ");
        printBST(tree.left);
        printBST(tree.right);
    }

    public static void floorOfBST(BinarySearchTree tree){
            System.out.println(floor(tree , 7));
    }

    public static int floor(BinarySearchTree root, int key)
    {
        if (root == null)
            return Integer.MAX_VALUE;

        /* If root->data is equal to key */
        if (root.val == key)
            return root.val;

        /* If root->data is greater than the key */
        if (root.val > key)
            return floor(root.left, key);

        /* Else, the floor may lie in right subtree
    or may be equal to the root*/
        int floorValue = floor(root.right, key);
        return (floorValue <= key) ? floorValue : root.val;
    }

    public static void ceilNF(BinarySearchTree tree){
        System.out.println(Ceil(tree,7));
    }
    public static  int Ceil(BinarySearchTree node, int input)
    {

        // Base case
        if (node == null) {
            return -1;
        }

        // We found equal key
        if (node.val == input) {
            return node.val;
        }

        // If root's key is smaller,
        // ceil must be in right subtree
        if (node.val < input) {
            return Ceil(node.right, input);
        }

        // Else, either left subtree or root
        // has the ceil value
        int ceil = Ceil(node.left, input);

        return (ceil >= input) ? ceil : node.val;
    }
    public static int kthSmallest(BinarySearchTree root, int k) {
        LinkedList<BinarySearchTree> stack = new LinkedList<BinarySearchTree>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }
    public static int kthLargest(BinarySearchTree root, int k) {
        LinkedList<BinarySearchTree> stack = new LinkedList<BinarySearchTree>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.right;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.left;
        }
    }

}
