package com.cz2101codes.sorts;

public class QuickSortRevision {
    // Methods
    private int partition(int[] arr, int low, int high){
        // Pivot
        int pivot = arr[high];

        // The Magic
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
                Utility.swap(arr, j, i);
            }
        }
        Utility.swap(arr,i+1, high);
        return (i+1);
    }

    public void sort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
