package com.cz2101codes;

public class MaxMin {
    // Constructor
    public MaxMin(){};

    // Method
    public void findMaxAndMin(int[] arr, int start, int end, int[] minMax){
        // Create Temporary Max and Min Arrays
        int[] tempMinMax1 = new int[2];
        int[] tempMinMax2 = new int[2];
        int mid;

        // Single Element
        if (start == end){
            minMax[0] = arr[start];
            minMax[1] = arr[start];
        }
        // Double Elements
        else if (end - start == 1){
            if (arr[start] > arr[end]){
                minMax[0] = arr[end];
                minMax[1] = arr[start];
            }
            else {
                minMax[0] = arr[start];
                minMax[1] = arr[end];
            }
        }

        // More than two elements
        else {
            mid = (start+end)/2;
            findMaxAndMin(arr, start, mid, tempMinMax1);
            findMaxAndMin(arr, mid+1, end, tempMinMax2);
            if (tempMinMax1[0] < tempMinMax2[0]){
                minMax[0] = tempMinMax1[0];
            } else {
                minMax[0] = tempMinMax2[0];
            }
            if (tempMinMax1[1] > tempMinMax2[1]){
                minMax[1] = tempMinMax1[1];
            } else {
                minMax[1] = tempMinMax2[1];
            }
        }
    }
}
