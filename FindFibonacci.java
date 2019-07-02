
package fibonacci;

import java.math.BigInteger;

/**
 * Class takes the nth Fibonacci position given by the user and calculates 
 * the number at the position by using matrix multiplication and 
 * exponential squaring. 
 */
public class FindFibonacci
{

    private int n; // global variable for user's input
/**
 * Constructor for class.
 * @param x user input that will be used to calculate Fibonacci value at the
 * integer position.
 */
    public FindFibonacci(int x)
    {
        n = x; //user's nth fibonacci position

    }

    /**
     * Method creates the array in which will be used to preform the matrix
     * multiplication to the power of the user's input.
     * @return Fibonacci calculation
     */
    public BigInteger fib()
    {
        BigInteger[] F = {BigInteger.ONE, BigInteger.ONE, // F = {{1,1,},{1,0}}
                          BigInteger.ONE, BigInteger.ZERO};
        if (n == 0)
            return BigInteger.ZERO;
        return power(F, n)[1]; //calculates matrix and fibonacci number
    }

    /**
     * Method computes the power of the matrix and continually 
     * divides the user's integer by half, satisfying the O(log n) running time. 
     * @param F matrix {{1,1},{1,0}}
     * @param n integer given by the user
     * @return power of the matrix
     */
    public BigInteger[] power(BigInteger[] F, int n)
    {
        BigInteger[] result = {BigInteger.ONE, BigInteger.ZERO, //{{1,0}{0,1}}
                               BigInteger.ZERO, BigInteger.ONE};
        while (n != 0) {
            //exponential squaring
            if (n % 2 != 0) { //n is odd
                result = multiplyMatrix(result, F);
            }
            n /= 2; //divides size by two O(log n)
            F = multiplyMatrix(F, F);
        }
        return result;
    }

    /**
     * Method computes matrix multiplication.
     * @param x integers within first matrix 
     * @param y integers within second matrix
     * @return matrix x multiplied by matrix y
     */
    public BigInteger[] multiplyMatrix(BigInteger[] x, BigInteger[] y)
    {
        return new BigInteger[]{
            x[0].multiply(y[0]).add((x[1].multiply(y[2]))),
            x[0].multiply(y[1]).add((x[1].multiply(y[3]))),
            x[2].multiply(y[0]).add((x[3].multiply(y[2]))),
            x[2].multiply(y[1]).add((x[3].multiply(y[3])))
        };
    }
}
