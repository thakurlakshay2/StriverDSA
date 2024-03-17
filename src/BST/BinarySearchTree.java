package BST;

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

}
