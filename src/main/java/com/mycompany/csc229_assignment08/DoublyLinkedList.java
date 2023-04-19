package com.mycompany.csc229_assignment08;
/**
 *
 * @author johnf
 */
import java.util.ArrayList;

class Node {
    public int data;
    public Node next;
    public Node previous;
    
    public Node(int initData) {
        data = initData;
        next = null;
        previous = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    
    public void prepend(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }
    
    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    public void insertAfter (Node currentNode, Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else if (currentNode == tail) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        else {
            Node successor = currentNode.next;
            newNode.next = successor;
            newNode.previous = currentNode;
            currentNode.next = newNode;
            successor.previous = newNode;
        }
    }
   
    public void remove(Node currentNode) {
        Node successor = currentNode.next;
        Node predecessor = currentNode.previous;
      
        if (successor != null)
            successor.previous = predecessor;
         
        if (predecessor != null)
            predecessor.next = successor;
         
        if (currentNode == head)
            head = successor;
         
        if (currentNode == tail)
            tail = predecessor;
    }
    
    public int[] toArray() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Node cTemp = head;
        
        while (cTemp != null) {
            array.add(cTemp.data);
            cTemp = cTemp.next;
        }
        
        int size = array.size();
        int[] arr = new int[size];
        
        for (int i=0; i<size; i++) {
            int temp = array.get(i);
            arr[i] = temp;
        }
        
        return arr;
    }
    
    public int indexOf(Node node) {
        Node temp = head;
        int count = 0;
        int index = 0;
        while (temp != null) {
            if (temp.data == node.data) {
                index = count;
            }
            count++;
            temp = temp.next;
        }
        
        Node headCheck = head;
        if (index == 0 && headCheck.data != node.data) {
            System.out.println("NOT FOUND!");
            index = -1;
        }
        
        return index;
    }
    
    public int sumLast(int n) {
        Node temp = tail;
        int sum = 0;
        int count = 0;
        while (count < n) {
            sum += temp.data;
            count++;
            temp = temp.previous;
        }
        
        return sum;
    }
}


