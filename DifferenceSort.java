/**************************************************************
 Purpose/Description: 
 * The first half of the program uses ListIterator to create a new list of the
 * elements that are in list 1 but not in list 2 with a O(n) running time 
 * by one linear while loop and constant time if statements
 * The second half involves using a set of stacks and sorting them in descending order
 * by using an auxiliary stack which makes the run time a quadratic O(n^2)
 * as it uses nested while loops to loop through the stack and auxiliary stack.
 Author’s Panther ID: 2919853
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/ 
package differencesort;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * Class creates a list of elements that are in list 1 but not in list 2 and 
 * class sorts a stack in descending order by using an auxiliary stack.
 */
public class DifferenceSort
{

    /**
     * Main tester class method that creates the two lists and stack and calls
     * the appropriate methods for each.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        List<Integer> L1 = new ArrayList(); //tester list 1 with arbitrary nums
        L1.add(1);
        L1.add(4);
        L1.add(7);
        L1.add(18);
        List<Integer> L2 = new ArrayList(); //tester list 2 with arbitatry nums
        L2.add(2);
        L2.add(4);
        L2.add(7);
        L2.add(20);
        List<Integer> Difference = new ArrayList(); //stores similar numbers

        difference(L1, L2, Difference); //finds similar numbers in L1 and L2

        Stack<Integer> s = new Stack<>();
        //push elements onto stack
        s.push(5);
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);
        s = sort(s);
        System.out.print("The Stack in descending order: ");
        //prints popped element one-by-one.
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

    }

    /**
     * Method compares list 1 and list 2 and places the elements that are in
     * list 1 but not in list 2 in a separate ArrayList.
     * @param <AnyType> list type
     * @param L1 list one
     * @param L2 list two
     * @param Difference elements from list 1 that are not in list 2
     */
    public static <AnyType extends Comparable<? super AnyType>>
            void difference(List<AnyType> L1, List<AnyType> L2, List<AnyType> Difference)
    {
        ListIterator<AnyType> iterL1 = L1.listIterator();
        ListIterator<AnyType> iterL2 = L2.listIterator();

        AnyType itemL1; // elements in list
        AnyType itemL2;

        //condition that assigns a variable to the next number if there is one
        if (iterL1.hasNext() && iterL2.hasNext()) {
            itemL1 = iterL1.next(); //number from L1 being compared
            itemL2 = iterL2.next(); //number from L2 being compared

            //loops until there are no more numbers in the list
            while (itemL1 != null) {
                //compares a number from L1 and L2
                int result = itemL1.compareTo(itemL2);
                //condition if the numbers are not equal, finds next number
                if (result == 0) {
                    itemL1 = iterL1.hasNext() ? iterL1.next() : null;
                    itemL2 = iterL2.hasNext() ? iterL2.next() : null;
                //condition if numbers are different and number from list 2
                //is the next largest number
                } else if ((result != 0) && ((Integer) itemL1 > (Integer) itemL2)) {
                    //condition that assigns if list2 has another element
                    //else assigns comparing variable as null;
                    itemL2 = iterL2.hasNext() ? iterL2.next() : null;
                } else {
                    //adds difference to list and iterates through L1.
                    Difference.add(itemL1);
                    itemL1 = iterL1.hasNext() ? iterL1.next() : null;
                }

            }
        }
        System.out.println("The items that in L1 that are NOT in L2 are: " 
                + Difference);
    }

    /**
     * Method uses an auxiliary stack to return the given stack in descending
     * order.
     * @param s given stack
     * @return auxiliary stack in descending order.
     */
    static Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> aux = new Stack<>();

        //loops until given stack is empty
        while (!s.isEmpty()) {
            //assigns the top of the aux stack to the front of given stack
            int top = s.pop();
            //adds the top element in original stack to aux stack if the top of 
            //the aux stack if the value is greater than the top of the given stack.
            while (!aux.isEmpty() && (aux.peek() > top)) {
                s.push(aux.pop());
            }
            aux.push(top);
        }
        return aux;
    }

}

