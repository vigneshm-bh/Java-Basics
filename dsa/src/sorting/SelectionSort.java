package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = Sort.getArray(n);

        long startTime = System.currentTimeMillis();
        selectionSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by merge sort " + (endTime - startTime) + " ms");

        if (Sort.isArrayNotSorted(arr)) {
            System.out.println("Array is not sorted");
            return;
        }
        System.out.println("Arrays are equal");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i =0; i < n - 1;i++) {
            int smallestIndex = i;
            for (int j= i+1; j < n; j++) {
                if(arr[j] < arr[smallestIndex]) smallestIndex = j;
            }
            if (i != smallestIndex) {
                swap(arr, i, smallestIndex);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
