package com.myprograms.algorithms.heap;

public class MaxIntHeap extends Heap {
    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) < items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int largerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }

            if (items[index] > items[largerChildIndex])
                break;
            else
                swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }
}
