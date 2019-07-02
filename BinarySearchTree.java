package bsearchtree;

/**
 * The purpose of this class is to hold all the methods that involve
 * manipulating the given binary tree from the main class. 
 * 
 */
public class BinarySearchTree
{

    private BinarySearchTreeNode root;

    /**
     * Assumed provided insert method, left empty.
     * @param key node element
     */
    public void insert(int key){}
    /**
     * Assumed procided deleted method, left empty.
     * @param key node element
     */
    public void delete(int key){}
    /**
     * Assumed provided find method, left empty.
     * @param key node element
     * @return arbitrarily left as false.
     */
    public boolean find(int key){return false;}

    /**
     * Method uses a helper method to find all keys in the tree.
     *
     * @return the sum of all keys
     */
    public int keySum()
    {
        return helperKeySum(root);
    }

    /**
     * Helper method that sums all the elements in the tree.
     *
     * @param node key
     * @return the sum of all keys else 0.
     */
    public int helperKeySum(BinarySearchTreeNode node)
    {

        //sums the keys recursively
        if (node != null) {
            return node.key + helperKeySum(node.left)
                    + helperKeySum(node.right);
        }
        return 0;
    }

    /**
     * Method deletes minimum value in a tree or does nothing if the tree has no
     * elements.
     */
    public void deleteMin()
    {
        BinarySearchTreeNode node = root;

        //return if node is empty
        if (root == null) {
            return;
        }

        //assigns prev node and calls the provided delete method to delete node.
        while (node.left.left != null) {
            node = node.left;
        }
        //removes child
        node.left = null;
        delete(node.key);

    }

    /**
     * Method prints the binary tree by using a helper method.
     */
    public void printTree()
    {
        helperPrintTree(root);
    }

    /**
     * Prints left side of binary tree, then the node key, then the right side.
     *
     * @param node the middle node
     */
    public void helperPrintTree(BinarySearchTreeNode node)
    {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            helperPrintTree(node.left); //prints left side of tree
        }
        System.out.print(node.key + " "); //prints key

        if (node.right != null) {
            helperPrintTree(node.right); //prints right side of tree
        }
    }

    /**
     * Method prints binary tree from in postorder traversal.
     *
     * @param node position
     */
    public void printPostOrder(BinarySearchTreeNode node)
    {
        if (node == null) {
            return;
        }
        //recursion on the left side tree
        printPostOrder(node.left);
        //recursion on the right side tree
        printPostOrder(node.right);
        //prints data of node
        System.out.print(node.key + " ");

    }
}
