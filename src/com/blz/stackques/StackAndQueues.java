package com.blz.stackques;

public class StackAndQueues {
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("The top element is " + stack.peek());
        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        } else {
            System.out.print("The stack is not empty");
        }
    }
