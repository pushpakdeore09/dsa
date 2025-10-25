package Sorting;

public class BubbleSort {
    /*
    Time Complexity:
    O(n):- Best Case
    O(n^2):- Avg. & Worst Case

    Space Complexity:
    O(1)
    */
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-i-1; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
