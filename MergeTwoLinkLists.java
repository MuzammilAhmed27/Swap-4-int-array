/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }}
class LinkedList {
    Node head;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;}
        Node current = head;
        while (current.next != null) {
            current = current.next;}
        current.next = newNode;}
    public void merge(LinkedList list2) {
        if (head == null) {
            head = list2.head;
            return;}
        Node current = head;
        while (current.next != null) {
            current = current.next;}
        current.next = list2.head;}
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }}
public class MergeTwoLinkLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        for (int i = 1; i <= 5; i++ ) {
            list1.append(i);
            list2.append(i + 5); }
        System.out.println("List 1:");
        list1.display();
        System.out.println("List 2:");
        list2.display();
        list1.merge(list2);
        System.out.println("Merged List:");
        list1.display();
    }
}