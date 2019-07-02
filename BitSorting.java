/**************************************************************
 Purpose/Description: 
 * This program takes an array of binary numbers and sorts them in a
 * linear running time with a constant space complexity.
 Author’s Panther ID: 2919853
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/ 

import java.util.Arrays;


/**
 * Tester class.
 */
public class BitSorting
{

    /**
     * Main method.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] a = {1,0,1,0,0,0,1,0,1,0,0,1};
        BitSort sort = new BitSort();
        BitSort.bitSort(a);
        System.out.println(Arrays.toString(a));
        
    }
    
}
