/**************************************************************
 Purpose/Description: The program uses a bottom-up merge sort method to sort an
 * array of integers and avoids recursion.
 Panther ID: 2919853
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 **************************************************************/ 
package mergesort;

/**
 * Class contains a method that can merge sort an array of integers without
 * recursion by using a bottom-up merge sort.
 */
public class MergeSort
{

    /**
     * Empty tester class by instruction.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

    }

    /**
     * Method sorts an array of integers by using a bottom-up merge sort.
     *
     * @param arry
     */
    public void mergeSort(int arry[])
    {
        int i = 2; // starts from grouping indexes
        int j = 0;

        //condition to go through entire array
        while (j < arry.length - 1) {
            //moves the right and left indexes 
            int right = (j + i) - 1;
            int left = j;

            //end of array
            if (right > arry.length) {
                right = arry.length - 1;
            }
            //partition for subarrays
            int part = (left + right) / 2;
            merge(arry, left, right, part); //merges groups of ints
            j = +1; //moves left index
        }
        //parition
        if (i >= arry.length) {
            i = i / 2;
            merge(arry, 0, arry.length - 1, (i - 1)); //merges groups of ints
            i = arry.length; //right index

        }
    }

}
