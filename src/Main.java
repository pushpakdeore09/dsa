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
    }
}