/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023fbse045;

/* @author 2023F-BSE-045 */
class UnsortedLinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }}

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;}

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;}
        System.out.println(); }
}

class SortedLinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }}

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }}

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();}

    public static void main(String[] args) {
        UnsortedLinkedList unsortedList = new UnsortedLinkedList();
        unsortedList.insert(31);
        unsortedList.insert(45);
        unsortedList.insert(1);
        System.out.println("Unsorted Linked List:");
        unsortedList.display();

        SortedLinkedList sortedList = new SortedLinkedList();
        sortedList.insert(31);
        sortedList.insert(45);
        sortedList.insert(1);
        System.out.println("Sorted Linked List:");
        sortedList.display();
    }
}