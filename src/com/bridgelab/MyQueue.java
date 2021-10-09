package com.bridgelab;
public class MyQueue {
    MyNode front;
    MyNode rear;

    /**
     * This Method is used to add elements to Queue
     *
     * @param element - element to be added.
     */
    public void enqueue(int element) {
        MyNode node = new MyNode();
        node.key = element;
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    /* This Method is used to display the elements in Queue. */
    public void display() {
        if (front == null)
            System.out.println("Queue is empty");
        else {
            MyNode temp = front;
            System.out.println("Queue list is -");
            while (temp != null) {
                System.out.println(temp.key);
                temp = temp.next;
            }
        }
    }
}
