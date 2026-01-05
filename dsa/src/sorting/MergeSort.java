package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int n = 10000000;
        int[] arr = Sort.getArray(n);

        long startTime = System.currentTimeMillis();
        mergeSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by merge sort " + (endTime - startTime) + " ms");

        if (Sort.isArrayNotSorted(arr)) {
            System.out.println("Array is not sorted");
            return;
        }
        System.out.println("Arrays are equal");
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n <= 1) return;

        int middle = n / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[n - middle];

        for (int i =0; i < middle; i++) {
            leftArray[i] = arr[i];
            rightArray[i] = arr[middle + i];
        }
        if(n%2 != 0) rightArray[rightArray.length - 1] = arr[n - 1];

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(arr, leftArray, rightArray);
    }

    private static void merge (int[] arr, int[] leftArray, int[] rightArray) {
        int n = leftArray.length;
        int m = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < m) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
