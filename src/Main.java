import Heap.Heap;
import Sorting.MergeSort;
import Sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(50);
        heap.insert(55);
        heap.insert(53);
        heap.insert(52);
        heap.insert(54);
        heap.print();
        heap.delete();
        System.out.println();
        heap.print();
        System.out.println();
        int[] nums = {-1, 54, 53, 55, 52, 50};
        int n = 5;
        // Heap Creation
        for (int i = n/2; i > 0; i--){
            heap.heapify(nums, n, i);
        }
        for (int i=1; i <=n; i++){
            System.out.print(nums[i]+" ");
        }

        // Heap Sort
        heap.heapSort(nums, n);
        System.out.println();
        // Print sorted array
        for (int i=1; i <=n; i++){
            System.out.print(nums[i]+" ");
        }

    }
}