package Heap;

// There are two types of heap
// 1. MaxHeap (root is always greater than child)
// 2. MinHeap (root is always smaller than child)

public class Heap {
    public int[] arr;
    public int size;

    public Heap(){
        this.arr = new int[10];
        this.size = 0;
    }

    //Time Complexity:- O(log n)
    public void insert(int value){
        size++;
        int index = size;
        arr[index] = value;

        while (index > 1){
            int parentIndex = index/2;
            if (arr[parentIndex] < arr[index]){
                int temp = arr[parentIndex];
                arr[parentIndex] = arr[index];
                arr[index] = temp;
                index = parentIndex;
            }
            else {
                return;
            }
        }
    }

    public void print(){
        for (int i=1; i<=size; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
