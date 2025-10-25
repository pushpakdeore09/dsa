package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {10, 2, 13, 9, 20};
        System.out.println(Arrays.toString(arr));
        selectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
