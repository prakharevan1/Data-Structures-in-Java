package DataStructures.Arrays.Sorting.HeapSort;



public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        Heap = new int[this.maxSize];
    }
    private int parent(int pos) {
        return (pos - 1) / 2; //parent of the nodes
    }
    private int leftChild(int pos) {
        return (pos * 2) + 1; //plus 1 for left node
    }
    private int rightChild(int pos) {
        return (pos * 2) + 2; //plus 2 for right node
    }
    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos  <= size) { //if its in the bottom half..
            return true;
        }
        return false;
    }
    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
        //basic swapping formula
    }
    private void maxHeapify(int pos) {
        if (isLeaf(pos)) return;

        if (Heap[pos] < Heap[leftChild(pos)] ||
            Heap[pos] < Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
    }
    public void insert(int element) {
        Heap[size] = element;

        int current = size;

        while (Heap[current] > Heap[parent(current)]) { //should be organized from greatest to least
            swap(current, parent(current)); //swap function
            current = parent(current); //x2 swap
        }
        size++; //increase size of tree
    }
    public void print()
    {
 
        for (int i = 0; i < size / 2; i++) {
 
            System.out.print("Parent Node : " + Heap[i]);
 
            if (leftChild(i)
                < size) // if the child is out of the bound
                        // of the array
                System.out.print(" Left Child Node: "
                                 + Heap[leftChild(i)]);
 
            if (rightChild(i)
                < size) // the right child index must not
                        // be out of the index of the array
                System.out.print(" Right Child Node: "
                                 + Heap[rightChild(i)]);
 
            System.out.println(); // for new line
        }
    }
 
    // Method 9
    // Remove an element from max heap
    public int extractMax() {
        int popped = Heap[0];
        Heap[0] = Heap[--size];
        maxHeapify(0);
        return popped;
    }
    public static void main(String[] args) {
        // Display message for better readability
        System.out.println("The Max Heap is ");
 
        MaxHeap maxHeap = new MaxHeap(15);
 
        // Inserting nodes
        // Custom inputs
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
 
        // Calling maxHeap() as defined above
        maxHeap.print();
 
        // Print and display the maximum value in heap
        System.out.println("The max val is " + maxHeap.extractMax());
    }
}
