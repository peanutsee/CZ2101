package com.cz2101codes.sorts;

public class BubbleSortRevision {
    // Constructor
    public BubbleSortRevision(){};

    // Methods
    public void sort(int[] arr){
        for (int i=0; i<arr.length-2; i++){
            for (int j=0; j<arr.length-2-i; j++){
                if (arr[j] > arr[j+1]){
                    Utility.swap(arr, j, j+1);
                }
            }
        }
        Utility.printArray(arr);
    }
}
