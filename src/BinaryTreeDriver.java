public class BinaryTreeDriver{
    public static void main(String args[])  {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        Integer[] array = {4, 7, 3, 6, 5, 12, 9, 2};
        for(int k = 0; k < array.length; k++)
            tree.insert(array[k]);

        System.out.println("The binary tree is: ");
        tree.printTree();
        //*********QUESTION TWO*************//

        //Question 2-a
        System.out.println("The longest path between two leaves is: "+tree.longestPathTwoLeaves());
        //Question 2-b
        System.out.println("The maximum values: ");
        tree.maxValueInEachLevel();
        //Question 2-c
        System.out.println("The size of the right subtree of the root is: "+tree.sizeRightSubtree(tree.root));
        System.out.println("The size of the right subtree of 3 is: "+tree.sizeRightSubtree(tree.root.right));// these calcultions are not including the node v
        //Question 2-e

        //*********QUESTION THREE***********//

        //Question 3-a
        //Question 3-b






    }
}
