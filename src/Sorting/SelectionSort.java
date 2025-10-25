package Sorting;

public class SelectionSort {

    /*
    Time Complexity:
    O(n^2):- Best, Avg. & Worst Case

    Space Complexity:
    O(1)
    */
    public void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
