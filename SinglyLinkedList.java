/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
class IntegerNode {
    int data;
    IntegerNode next;

    public IntegerNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private IntegerNode head;

    public void insertAtBeginning(int data) {
        IntegerNode newNode = new IntegerNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        IntegerNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public IntegerNode findMiddle() {
        if (head == null) return null;
        IntegerNode slow = head;
        IntegerNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(10);
        list.insertAtBeginning(15);
        list.display();

        IntegerNode middle = list.findMiddle();
        if (middle != null) {
            System.out.println("Middle element: " + middle.data);
        }
    }
}