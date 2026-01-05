package sorting;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int n = 1000000;
        int[] arr = Sort.getArray(n);

        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, n -1);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by merge sort " + (endTime - startTime) + " ms");

        if (Sort.isArrayNotSorted(arr)) {
            System.out.println("Array is not sorted");
            return;
        }
        System.out.println("Arrays are equal");
    }

    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
