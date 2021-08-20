package com.cz2101codes.sorts;

import jdk.jshell.execution.Util;

public class HeapSortRevision {
    // Constructor
    public HeapSortRevision(){};

    // Methods
    private void heapify(int[] arr, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]){
            largest = r;
        }

        if (largest != i){
            Utility.swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public void sort(int[] arr){
        int size = arr.length;

        // Build Heap
        for (int i=size/2-1; i>=0; i--){
            heapify(arr, size, i);
        }

        // Max Heap
        for (int i=size-1; i>0; i--){
            Utility.swap(arr, i, 0);
            heapify(arr, i, 0);
        }

        Utility.printArray(arr);
    }
}
