package com.cz2101codes.sorts;

/*
* Best Case: O(n)
* Average Case: O(n^2)
* Worse Case: O(n^2)
* */

public class InsertionSortRevision {
    // Constructor
    public InsertionSortRevision(){};

    // Methods
    public void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if (arr[j] < arr[j-1]){
                    Utility.swap(arr, j, j-1);
                }
            }
        }
        Utility.printArray(arr);
    }

}
