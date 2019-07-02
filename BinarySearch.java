/** ************************************************************
 * Purpose/Description: This program finds a given key in an array through the use
 * of binary searches and is meant to have a running time of O(logN).
 * Author’s Panther ID: 2919853
 * Certification:
 * I hereby certify that this work is my own and none of it is the work of
 * any other person.
 ************************************************************* */
package binarysearch;

import java.util.Scanner;

/**
 * Tester class that establishes the array and key that will be used in the
 * Search class.
 */
public class BinarySearch
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] arr =
        {
            1, 3, 4, 5, 7, 14, 11, 7, 2, -4, -8
        }; //array being tested
        int userInput = 0; //key to find in array.
        int maxIndex = 0; // index of largest number in the array.
        int result1 = 0; // result of binary search through ascending array. 
        int result2 = 0; // result of binary search through descending array.

        Search binary = new Search(arr);
        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer to find in the array: ");
        userInput = input.nextInt();

        maxIndex = binary.findMax();
        result1 = binary.binarySearch(0, maxIndex, userInput);
        result2 = binary.binarySearchEnd(maxIndex, arr.length - 1, userInput);

        binary.printResult(result1, result2, userInput);

    }

}
