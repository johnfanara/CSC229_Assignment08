package com.mycompany.csc229_assignment08;

/**
 *
 * @author johnf
 */
public class Driver {
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        Node n1 = new Node(42);
        Node n2 = new Node(13);
        Node n3 = new Node(4);
        
        list1.append(n1);
        list1.append(n2);
        list1.append(n3);
        
        int arr[] = list1.toArray();
        
        System.out.println("List1: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int index = list1.indexOf(n2);
        
        if (index > -1) {
            System.out.println("Index of n2 in List1: " + index);
        }
        
        System.out.println("Sum of last 3 elements in List1 " + list1.sumLast(3));
        System.out.println();
        
        DoublyLinkedList list2 = new DoublyLinkedList();
        Node n4 = new Node(5);
        Node n5 = new Node(77);
        Node n6 = new Node(95);
        Node n7 = new Node(33);
        Node n8 = new Node(138);
        
        list2.append(n1);
        list2.append(n2);
        list2.append(n3);
        list2.prepend(n4);
        list2.prepend(n5);
        list2.append(n6);
        list2.prepend(n7);
        list2.append(n8);
        
        int[] arr2 = list2.toArray();
        
        System.out.println("List2: ");
        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        int index2 = list2.indexOf(n2);
        
        if (index2 > -1) {
            System.out.println("Index of n2 in List2: " + index2);
        }
        
        System.out.println("Sum of the last 6 elements in List2: " + list2.sumLast(6));
        System.out.println();
        
    }
}
