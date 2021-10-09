package com.bridgelab;
/**
 * Methods to perform Stack Operations
 */
public class MyStack {
    private MyNode top;

    /**
     * This method is used to add elements to stack
     * @param element: elements to be added.
     */
    public void push(int element) {
        MyNode node = new MyNode();
        node.key = element;
        node.next = top;
        top = node;
    }
    /*  This Method is used to return top element from the stack */
    public int peak() {
        System.out.println("Top element is " +top.key);
        return top.key;
    }

    /* This method is used to delete element from the stack */
    public void pop() {
        if (top == null)
            System.out.println("Stack empty");
        else {
            MyNode temp = top;
            System.out.println("Popped out element is " + temp.key);
            top = top.next;
        }

    }
    /* This method is used to display the stack list */
    public void display() {
        MyNode tempNode = top;
        if (top == null)
            System.out.println("Stack empty");
        else {
            System.out.println("Stack List is -");
            while (tempNode != null) {
                System.out.println(tempNode.key);
                tempNode = tempNode.next;
            }
        }
    }
}
