package com.blz.stackques;

public class stack {
    private Node top;

    public stack() {
        this.top = null;
    }

    // Utility function to add an element `x` to the stack
    public void push(int x) { // insert at the beginning
        // allocate a new node in a heap
        Node node = new Node();

        // check if stack (heap) is full. Then inserting an element would
        // lead to stack overflow
        if (node == null) {
            System.out.print("Heap Overflow");
            return;
        }
        System.out.println("Inserting " + x);

        // set data in the allocated node
        node.data = x;

        // set the `.next` pointer of the new node to point to the current
        // top node of the list
        node.next = top;

        // update top pointer
        top = node;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return the top element of the stack
    public int peek() {
        // check for an empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
}








