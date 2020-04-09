package SelectionSort;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {

        int[] arr = {25, 2, 8, 3, 5, 9};
        MySelectionSort obj = new MySelectionSort();
        System.out.println("Unsorted ----> " + Arrays.toString(arr));
        obj.selectionSort(arr);
        System.out.println("Sorted ----> " + Arrays.toString(arr));
    }

    public void selectionSort(int[] arr) {
        int maxElement;
        int maxElementIndex;
        int sortedIndex = arr.length;
        // step 1 - iterate over the collection or array
        for (int i = 0; i < arr.length; i++) {
            maxElement = arr[0];
            maxElementIndex = 0;
            // step 2 - select maximum
            //          find maximum from the array
            for (int j = 0; j < sortedIndex; j++) {
                if (arr[j] > maxElement) {
                    maxElement = arr[j];
                    maxElementIndex = j;
                }
            }
            // step 3 - swap them
            int temp = arr[maxElementIndex];
            sortedIndex--;
            arr[maxElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }
    }
}
