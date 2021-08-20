package com.cz2101codes.datastructures;

public class Queue{
    private Node head;
    private Node tail;
    private int size;

    public class Node {
        int data;
        Node next;

        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    public Queue(){
        this.head=null;
        this.size=0;
        this.tail=null;
    }

    // Methods
    public int isEmptyQueue(Queue q) { return q.size == 0? 1: 0;}

    public int peek(Queue q) {return q.head.data;}

    public void enqueue(Queue q, int data){
        if (isEmptyQueue(q) == 1){
            q.head =  new Node(data, null);
            q.tail = q.head;
        } else {
            Node tempNode = q.head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            q.tail = new Node(data, null);
            tempNode.next = q.tail;
        }
        q.size++;
    }

    public void dequeue(Queue q){
        if (isEmptyQueue(q) == 0){
            Node tempNode = q.head;
            q.head = tempNode.next;
            tempNode.next=null;
            q.size--;
        }
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(q, 1);
        q.enqueue(q, 2);
        q.enqueue(q, 3);
        q.enqueue(q, 4);
        q.enqueue(q, 5);
        q.enqueue(q, 6);

        int peek = q.peek(q);
        System.out.println("Peek: " + peek);

        q.dequeue(q);
        peek = q.peek(q);
        System.out.println("Peek: " + peek);
    }
}
