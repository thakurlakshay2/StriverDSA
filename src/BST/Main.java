package BST;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree=BinarySearchTree.constructTree(new int[]{1,2,3,4,5,6,7,8});
        BinarySearchTree.printBST(tree);
        System.out.println();
        SeatchInaBST q1=new SeatchInaBST();
        System.out.println(q1.searchBST(tree,5));

        CheckBST q2=new CheckBST();
        System.out.println(q2.check(tree));
    }

}
