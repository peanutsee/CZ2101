package com.cz2101codes.sorts;

public class MergeSortRevision {
    // Constructor
    public MergeSortRevision(){};

    // Methods
    private void merge(int[] arr, int left, int mid, int right){
        // Get Size
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int i, j, k;

        // Temporary Array
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Fill Array
        for (i=0; i<leftSize; i++){
            leftArray[i] = arr[left+i];
        }

        for (j=0; j<rightSize; j++){
            rightArray[j] = arr[mid+j+1];
        }

        // Merge
        i=0;
        j=0;
        k=left;

        while (i<leftSize && j < rightSize){
            if (leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public void sort(int[] arr, int left, int right){
        if (right > left){
            int mid = left + (right - left)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
}
