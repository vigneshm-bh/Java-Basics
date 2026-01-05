package sorting;

import java.util.Arrays;

import static sorting.MergeSort.mergeSort;
import static sorting.QuickSort.quickSort;
import static sorting.SelectionSort.selectionSort;

public class Sort {

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = getArray(n);

        String algorithm = "Merge Sort";
        long startTime = System.currentTimeMillis();
        mergeSort(arr);
        long endTime = System.currentTimeMillis();
        printTime(endTime - startTime, algorithm);
        checkArraySorted(arr, algorithm);

        arr = getArray(n);
        algorithm = "Quick Sort";
        startTime = System.currentTimeMillis();
        quickSort(arr, 0, n - 1);
        endTime = System.currentTimeMillis();
        printTime(endTime - startTime, algorithm);
        checkArraySorted(arr, algorithm);

        arr = getArray(n);
        algorithm = "Selection Sort";
        startTime = System.currentTimeMillis();
        selectionSort(arr);
        endTime = System.currentTimeMillis();
        printTime(endTime - startTime, algorithm);
        checkArraySorted(arr, algorithm);

        arr = getArray(n);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        endTime = System.currentTimeMillis();
        printTime(endTime - startTime, "Arrays.sort");
    }

    public static int[] getArray (int n) {
        int[] arr = new int[n];
        for (int i=0; i< n; i++) {
            int num = (int) (Math.random() * n);
            arr[i] = num;
        }
        return arr;
    }

    public static boolean isArrayNotSorted (int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != copy[i]) {
                return true;
            }
        }
        return false;
    }

    private static void checkArraySorted(int[] arr, String algorithm) {
        if (Sort.isArrayNotSorted(arr)) {
            System.out.printf("%s Array is not sorted%n", algorithm);
        } else {
            System.out.printf("%s Array is sorted%n", algorithm);
        }
    }

    private static void printTime(long totalTime, String algorithm) {
        System.out.printf("Time taken by %s: %d ms%n", algorithm, totalTime);
    }
}
