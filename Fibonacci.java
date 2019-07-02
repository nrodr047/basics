/** ************************************************************
 * Purpose/Description: This program uses a O(log n) algorithm to 
 * preform calculations to return the nth Fibonacci number. 
 * 
 * Part B - This program's running time complexity is O(log n).
 * The program is based on the notion that a Fibonnacci sequence can be
 * represented by the following formula: 
 * 
 * fib(n) = fib(n-1) + fib(n-2) for n>= 3
 * 
 * which can be represented by the matrix:
 * 
 * [1 1]^n   [F(n+1) F(n)  ] 
 * [1 0]   = [F(n)   F(n-1)]
 * 
 * 
 * With with formula can use exponential squaring to calculate the power of the
 * matrix by using the modulus values (even or odd) instead of using the large
 * exponent. This cuts the problem in half producing a O(log n) running time.
 *
 * Author’s Panther ID: 2919853
 * Certification:
 * I hereby certify that this work is my own and none of it is the work of
 * any other person.
 ************************************************************* */
package fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *Tester class that prompts the user for an integer in the nth Fibonacci
 * position and calculates the number at that position.
 */
public class Fibonacci
{

    /**
     * Main method.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Input a integer at the nth Fibonacci position: ");
        int userInput = scn.nextInt();

        FindFibonacci num = new FindFibonacci(userInput);

        BigInteger n = num.fib();
        System.out.println("Your Fibonacci number at the " + userInput + "th "
                + "position is: " + n);
    }

}
