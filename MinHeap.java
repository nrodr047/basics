
package binaryheap;

/**
 *Class replaces the first occurrence of the old key and replaces it with a
 * new key and restore the Min-Heap property by perlocating up or down.
 */
public class MinHeap
{

    private int oldKey;
    private int newKey;
    private int[] arr;

    public MinHeap(int[] arry, int oldK, int newK)
    {
        arr = arry;
        oldKey = oldK;
        newKey = newK;
    }
/**
 * Method searches for the old key and replaces the old key with the new key 
 * and calls the perlocating methods to restore the binary min heap.
 */
    public void replaceKey()
    {
        int counter = 0;
        int i = 0;

        // condition that compares the keys in the given position.
        while (i < counter + 1) {
            if (arr[i] == oldKey) {
                break;
            }
            //scrolls through the array
            i++;
        }
        //condition if there is such key in the array
        if (i == counter + 1) {
            System.out.println(oldKey + " is not found.");
        }
        arr[i] = newKey; //replaces old key with the new key/
        //condition that exchanges the nodes with the parents as needed.
        if (i > 1 && (arr[i] == (arr[i / 2]))) {
            perlocateUp(i); //assumed given methods
        } else {
            perlocateDown(i); //assumed given methods
        }
    }
}
