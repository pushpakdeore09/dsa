package Sorting;

public class InsertionSort {

    /*
    Time Complexity:
    O(n):- Best Case
    O(n^2):- Avg. & Worst Case

    Space Complexity:
    O(1)
    */
    public void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
