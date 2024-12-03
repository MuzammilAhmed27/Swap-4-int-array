/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;
/* @author 2023f-bse-045 */
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }}
class CheckEmpty {
    Node head;
    public boolean isEmpty() {
        return head == null;}
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;}
        Node current = head;
        while (current.next != null) {
            current = current.next;}
        current.next = newNode; 
    }}
public class CheckEmptyLinkedList {
    public static void main(String[] args) {
        CheckEmpty list = new CheckEmpty();
        System.out.println("Is the list empty? " + list.isEmpty()); // Should print true
        list.add(1);
        System.out.println("Is the list empty after adding an element? " + list.isEmpty()); // Should print false  
    }}
