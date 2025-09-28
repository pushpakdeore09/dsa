package Sorting;

/*
1. Best Case Time Complexity: O(nlog n)
Occurs when pivot divides array into two equal halves

2. Average Case Time Complexity: O(nlog n)

3. Worst Case Time Complexity: O(n^2)
Occurs when array is already sorted
*/

public class QuickSort {

    public int[] quickSort(int[] arr, int low, int high){
        if (low < high){
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
        return arr;
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;
        while(i < j){
            while (arr[i] <= pivot && i <= high){
                i++;
            }
            while (arr[j] > pivot && j >= low){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
