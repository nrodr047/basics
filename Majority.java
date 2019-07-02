/**************************************************************
 Purpose/Description: The program finds the majority in a given array and 
 * uses a stack to scroll through the values in the array and determines
 * which value has appeared for over half of the total number of elements. I
 * used a quadratic running time as I wanted to use the stack meaningfully 
 * through the nested for loops. 
 Panther ID: 2919853
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/ 
package majority;

import java.util.Stack;

/**
 *Class holds the methods to compare each element in an array by using a stack
 * to hold one element and compare that element to the rest of the array.
 */
public class Majority
{

    /**
     * Main tester class.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] a = {23, 5, 2, 67, 67, 67, 67 };

        System.out.println("Index of leader element: " + leader(a));
    }

    /**
     * Method finds the majority element in a given array.
     * @param A array from the main method
     * @return an index of the majority element, if there is no majority then
     * it returns -1.
     */
    static int leader(int[] A)
    {
        // holds element that is being compared
        Stack<Integer> stack = new Stack();
        //counter for appearances within the array
        int majority = 0; 
        //default value of the majority index
        int index = -1;

        //pushes one element from the array at a time into the stack to be compared
        for (int i = 0; i < A.length; i++){ 
            int topOfStack = stack.push(A[i]);
            //scrolls through the array of elements for comparing with the stack
            for (int j = 0; j < A.length; j++) {
                //majority counter increments if the stack element and array
                //element have the same value, decrements if not equal
                if (topOfStack == A[j]) {
                    majority++;
                } else {
                    majority--;
                }
                //allows for continuation
                if (majority == 0) {
                    index = j;
                    majority = 1;
                }
                //if the majority number is greater than half of the number
                //of elements in the list then it is the majority, else returns -1
                if (majority >= A.length / 2) {
                    index = j;
                    stack.pop();
                } else {
                    index = -1;
                }
            }
        }
        return index;
    }
}
