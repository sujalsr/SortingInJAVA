package InsertionSort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        System.out.println("Unsorted Array --> " + Arrays.toString(arr));
        MyInsertionSort obj = new MyInsertionSort();
        obj.insertionSort(arr);
        System.out.println("Sorted Array --> " + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        // step 1 - consider 1st element sorted
        // step 2 - iterate over the array from 2nd element

        for (int i = 1; i < arr.length; i++) {
            // step 3
            int nextElement = arr[i];
            System.out.println("Selected Element -->" + nextElement);
            //step 4 - iterate from nextElement to first element
            for (int j = i; j > 0; j--) {
                // compare
                if (arr[j] < arr[j - 1]) {
                    //swap
                    System.out.println("Exchanging " + arr[j] + " with " + arr[j - 1]);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // to decrease operational cost
                    break;
                }
            }
        }
    }
}
