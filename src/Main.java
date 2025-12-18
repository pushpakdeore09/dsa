import Heap.Heap;
import Iterative.Subset;
import Sorting.MergeSort;
import Sorting.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Subset subset = new Subset();
        List<List<Integer>> ans = subset.subset(list);
        ans.forEach(System.out::println);
    }
}