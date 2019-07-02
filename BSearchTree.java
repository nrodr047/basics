/**************************************************************
 Purpose/Description: This program manipulates a binary tree through the 
 * use of nodes, empty assumed methods, and methods assigned from the homework
 * that I have constructed. 
 * 
 * PART E: The statement that any element a in A, b in B, or c in C 
 * abides by a <= b <= c is false. Take for example this binary tree:
 *          60
 *        /    \
 *      30     80
 *     /      /   \
 *    20     70    90
 *          /  \
 *         65   85
 * 
 *  Let A = {20, 30, 65}
 *  Let B = {60, 80, 70, 85}
 *  Let C = {90}
 * 
 * Suppose that leaf l is 85 in the path p {60, 80, 70, 85} in B.
 * Here we see that although A is on the left side of B, there is an element 
 * in A (65) that is greater than an element in B (60). Therefore the statement
 * that a <= b <= c is FALSE.
 * 
 * 
 * 
 * 
 Author’s Panther ID: 2919853
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/ 
package bsearchtree;

/**
 * Tester class provided for instructor.
 *
 */
public class BSearchTree
{

    /**
     * Main class.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       BinarySearchTree bin = new BinarySearchTree();
       bin.insert(4);
       bin.insert(5);
       bin.insert(2);
       bin.insert(1);
       bin.insert(3);
    }
    
    
    
}
