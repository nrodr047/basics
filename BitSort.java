
/**
 * Classes uses a method to sort an array of numbers by a a bitsort.
 */
public class BitSort
{
/**
 * Method uses an array of 0's and 1's by sorting 0's by their index to the
 * left side and 1's to the right side.
 * @param a array of integers passed from the main class.
 */
    public static void bitSort(int a[])
    {
        int left = 0; //left index at first element
        int right = a.length - 1; //right index at last element
        int tmp = 0;

        //condition to move index
        while (left < right) {
            //condition to move left indez
            if (a[left] == 0) {
                left++;
                continue;
            }
            //condition to move right index
            if (a[right] == 1) {
                right--;
                continue;
            }
            //temporary variable to switch elements until left index
            //is greater than the right index and the array is sorted.
            tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            left++;
            right--;
        }
    }
}

