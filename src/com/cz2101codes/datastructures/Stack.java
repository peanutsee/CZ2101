package com.cz2101codes.datastructures;

/*
 * 1. Push Node
 * 2. Pop Node
 * 3. Peek Node
 * 4. isEmptyStack
 * */

public class Stack {
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

    public Stack(){
        this.head=null;
        this.size=0;
    }

    // Methods
    public int isEmptyStack(Stack s){
        return s.size == 0? 1:0;
    }

    public int peek(Stack s){
        return s.tail.data;
    }

    public void push(Stack s, int data){
        if (isEmptyStack(s) == 1){
            s.head = s.tail = new Node(data, null);
        } else {
            Node tempNode = s.head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            s.tail = new Node(data, null);
            tempNode.next = s.tail;
        }
        s.size++;
    }

    public void pop(Stack s){
        Node tempNode = s.head;
        while (tempNode.next != s.tail){
            tempNode = tempNode.next;
        }
        s.tail = tempNode;
        tempNode.next = null;
        s.size--;
    }


    public static void main(String[] args){
        Stack s = new Stack();
        // Push
        s.push(s, 1);
        s.push(s, 5);
        s.push(s, 2);
        s.push(s, 14);

        // Peek
        int peek = s.peek(s);
        System.out.println(peek);

        // Pop
        s.pop(s);
        peek = s.peek(s);
        System.out.println(peek);

        // Push
        s.push(s, 4);
        peek = s.peek(s);
        System.out.println(peek);
    }
}
