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

        if (Heap[pos] < Heap[leftChild(pos)] || //if the pos is less than left and right children
            Heap[pos] < Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos)); //swap pos and left child, rearrange tree
                    maxHeapify(leftChild(pos)); //goes down tree until it reaches leaf
                } else {
                    swap(pos, rightChild(pos)); //swaps pos and rightchild if leftchild is not at wrong place
                    maxHeapify(rightChild(pos)); //runs through right child until it reaches leaf
                }
            }
    }
    public void insert(int element) {
        Heap[size] = element; //makes lowest element the size

        int current = size;

        while (Heap[current] > Heap[parent(current)]) { //should be organized from greatest to least
            swap(current, parent(current)); //swap function
            current = parent(current); //parent(current) = current since they are swapped
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
    // Remove an element from max heap
    public int extractMax() {
        int popped = Heap[0];
        Heap[0] = Heap[--size];
        maxHeapify(0); //removes Max element
        return popped;
    }
    public static void main(String[] args) {
        // Display message for better readability
        System.out.println("The Max Heap is ");
 
        MaxHeap maxHeap = new MaxHeap(15);
        
        maxHeap.insert(55);
        maxHeap.insert(23);
        maxHeap.insert(32);
        maxHeap.insert(69);
        maxHeap.insert(39);
        maxHeap.insert(3);
        maxHeap.insert(5);

        long prevTime = System.nanoTime();
        maxHeap.print();
        long currentTime = System.nanoTime();
        System.out.println("Time taken(ns): " + (currentTime - prevTime));
    }
}
