package Heap;
/*
 There are two types of heap
 1. MaxHeap (root is always greater than child)
 2. MinHeap (root is always smaller than child)

 Heap Implementation using Array
 1. Root:- (i)th index
 2. leftChild:- (2*i)th index
 3. rightChild:- (2*i+1)th index
 4. Parent:- (i/2)th index

 Above rules are for 1-based indexing
 */

public class Heap {
    public int[] arr;
    public int size;

    public Heap(){
        this.arr = new int[10];
        this.size = 0;
    }

    // Time Complexity:- O(log n)
    public void insert(int value){
        size++;
        int index = size;
        arr[index] = value;

        while (index > 1){
            int parentIndex = index/2;
            if (arr[parentIndex] < arr[index]){
                swap(parentIndex, index);
                index = parentIndex;
            }
            else {
                return;
            }
        }
    }

    // Time Complexity:- O(log n)
    public void delete(){
        if (size == 0) return;

        // Swap(put) root node with last node
        arr[1] = arr[size];
        size--;

        // Take root to its correct position
        int i = 1;
        while (i < size){
            int leftIndex = 2*i;
            int rightIndex = (2*i)+1;

            if(leftIndex < size && arr[i] < arr[leftIndex]){
                swap(i, leftIndex);
                i = leftIndex;
            } else if(rightIndex < size && arr[i] < arr[rightIndex]){
                swap(i, rightIndex);
                i = rightIndex;
            } else{
                return;
            }
        }
    }
    // Time Complexity of building heap:- O(n)
    public void heapify(int[] nums, int n, int i) {
        int largest = i;
        int leftIndex = 2 * i;
        int rightIndex = 2 * i + 1;

        if (leftIndex <= n && nums[largest] < nums[leftIndex]) {
            largest = leftIndex;
        }
        if (rightIndex <= n && nums[largest] < nums[rightIndex]) {
            largest = rightIndex;
        }
        if (largest != i) {
            int temp = nums[largest];
            nums[largest] = nums[i];
            nums[i] = temp;
            heapify(nums, n, largest);
        }
    }
    // Time Complexity:- O(nlog n)
    public void heapSort(int[] nums, int n){
        int size = n;
        while (size > 1){
            int temp = nums[size];
            nums[size] = nums[1];
            nums[1] = temp;
            size--;
            heapify(nums, size, 1);
        }
    }
    public void print(){
        for (int i=1; i<=size; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
