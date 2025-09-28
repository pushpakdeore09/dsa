package Sorting;

import java.util.ArrayList;
import java.util.List;

/*
* In all the cases i.e. Best, Average, Worst
* Time Complexity of merge sort is O(nlog n)
*/

public class MergeSort {

    public void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while(left <= mid){
            temp.add(arr[left++]);
        }
        while(right <= high){
            temp.add(arr[right++]);
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get((i-low));
        }
    }

}
