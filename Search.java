package binarysearch;

/**
 * Class retrieves the array from the main class and the key given by the user
 * and performs a binary search to find a maximum value within the array to then
 * perform recursive binary searches through the ascending portion of the array
 * and the descending portion of the array to determine if the key is within the
 * array.
 */
public class Search
{

    private int[] binArry; // array from the main
    private int maxIndex; //index of largest value in the array.

    /**
     * Constructor that takes the array of integers from the main class and
     * assigns it to the global variable.
     *
     * @param arry taken from the main class.
     */
    public Search(int[] arry)
    {
        this.binArry = arry; //array passed from main
    }

    /**
     * Method finds and returns the largest number in the array through a binary
     * search.
     *
     * @return largest integer in the array
     */
    public int findMax()
    {
        int high = binArry.length - 1;
        int low = 0;
        int max = binArry[0]; //largest number starting at index 0.

        while (low <= high)
        {
            //divides array to find middle index
            int mid = (low + high) / 2;

            //condition if value at middle index is greater than largest integer
            if (binArry[mid] >= max)
            {
                //replaces previous largest number
                max = binArry[mid];
                //stores the index of the largest number
                maxIndex = mid;
                //continues increasing index position
                low = mid + 1;
            }

            //condition if middle value is less than the largest value
            if (binArry[mid] < max)
                high = mid - 1;
        }
        return maxIndex;

    }

    /**
     * Method does a recursive binary search and determines if the integer given
     * by the user is between index 0 and great numerical integer in the array.
     *
     * @param low lowerbound of array, index 0
     * @param high upperbound of the array, greatest value in array
     * @param x key given by the user
     * @return if -1, integer is not in this portion of the array, else returns
     * the index in which the integer was found.
     */
    public int binarySearch(int low, int high, int x)
    {
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (x > binArry[mid])
                return binarySearch(mid + 1, high, x);
            else if (x < binArry[mid])
                return binarySearch(low, mid - 1, x);
            else
                return mid;
        }
        return -1;
    }

    /**
     * Method does a recursive binary search through the descending portion of
     * the given array and determines if the integer is found.
     *
     * @param low upper bound of the binary search
     * @param high lower bound of the binary search
     * @param x key given by the user
     * @return -1 if the integer was not found, else the index of the integer.
     */
    public int binarySearchEnd(int low, int high, int x)
    {
        while (low <= high)
        {
            int mid = (low + high) / 2;
            //if the integer is less than the mid element value, increase
            //the lowerbound.
            if (x < binArry[mid])
                return binarySearchEnd(mid + 1, high, x);
            //if the integer is larger the mid element value, decrease the 
            //upperbound.
            else if (x > binArry[mid])
                return binarySearchEnd(low, mid - 1, x);
            //if integer is found, return the index
            else
                return mid;
        }
        //return -1 if integer was not found.
        return -1;
    }

    /**
     * Method determines if the integer is within the array from the results of
     * the binary search and prints it on the console.
     *
     * @param result1 result from ascending binary search
     * @param result2 result from descending binary search
     * @param x key taken from the user input.
     */
    public void printResult(int result1, int result2, int x)
    {
        //if binary search returns -1 the integer is not in the array, else
        //the integer was found in the array.
        if (result1 > -1)
            System.out.println("Integer " + x + " was found in the array! ");
        else if (result2 > -1)
            System.out.println("Integer " + x + " was found in the array! ");
        else
            System.out.println("Integer NOT found in array.");

    }
}
