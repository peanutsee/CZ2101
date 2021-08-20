package com.cz2101codes.datastructures;

/*
* 1. Insert Node
* 2. Remove Node
* 3. Search Node
* 4. Print Linked List
* */

public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    public LinkedList(){
        this.head=null;
        this.size=0;
    }

    // 4 Horsemens of Operations
    public void printLinkedList(LinkedList ll){
        Node tempNode = ll.head;
        while (tempNode!=null){
            System.out.print(tempNode.data + "->");
            tempNode=tempNode.next;
        }
        System.out.println(" ");
    }

    public int searchNode(LinkedList ll, int keyToSearch){
        Node tempNode = ll.head;
        int size= 0;
        while (tempNode!=null){
            if (tempNode.data == keyToSearch){
                System.out.println("Node Found at Index " + size);
                return size;
            }
            size++;
            tempNode=tempNode.next;
        }
        System.out.println("Node Not Found");
        return -1;
    }

    public int insertNode(LinkedList ll, int keyToInsert, int index){
        // Base Case
        if (index < 0 || ll.size < index){
            System.out.println("Invalid Operation on Index " + index);
            return -1;
        }

        // Insert at First Index
        if (index == 0){
            Node tempNode = ll.head;
            Node newNode = new Node(keyToInsert, null);
            ll.head = newNode;
            newNode.next = tempNode;
            ll.size++;
        }

        // Insert at the Last Index
        else if (index == ll.size){
            Node tempNode = ll.head;
            Node newNode = new Node(keyToInsert, null);
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            ll.size++;
        }

        // Insert at Any Index
        else {
            Node currNode = ll.head;
            Node prevNode = null;
            Node newNode = new Node(keyToInsert, null);
            while (index > 0){
                prevNode = currNode;
                currNode = currNode.next;
                index--;
            }
            prevNode.next = newNode;
            newNode.next = currNode;
            ll.size++;
        }
        return index;
    }

    public int removeNode(LinkedList ll, int index){
        // Base Case
        if (index < 0 || index >= ll.size){
            System.out.println("Invalid Operation on Index " + index);
            return -1;
        }

        // Remove from Head
        if (index == 0){
            ll.head = ll.head.next;
        }

        // Remove from Last
        else if (index == ll.size-1){
            Node currNode = ll.head;
            Node prevNode = null;
            while (currNode.next != null){
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = null;
        }

        // Remove from Middle
        else {
            Node currNode = ll.head;
            Node prevNode = null;
            while (index > 0){
                prevNode = currNode;
                currNode = currNode.next;
                index--;
            }
            prevNode.next = currNode.next;
        }
        return index;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        // Insert Node
        ll.insertNode(ll, 5, 0);
        ll.insertNode(ll, 2, 1);
        ll.insertNode(ll, 3, 0);
        ll.insertNode(ll, 10, 1);
        ll.insertNode(ll, 9, 2);

        // Remove Node
        ll.removeNode(ll, 0);
        ll.removeNode(ll, 3);
        ll.removeNode(ll, 1);

        // Print Linked List
        ll.printLinkedList(ll);

        // Search Node
        ll.searchNode(ll, 5);
        ll.searchNode(ll, 20);
    }
}
