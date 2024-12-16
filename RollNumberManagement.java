/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
class Node {
    int rollNumber;
    Node next;

    public Node(int rollNumber) {
        this.rollNumber = rollNumber;
        this.next = null;
    }
}

class RollNumberLinkedList {
    private Node head;

    // Method to add a roll number at the end of the list
    public void addRollNumber(int rollNumber) {
        Node newNode = new Node(rollNumber);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to delete a roll number from the list
    public void deleteRollNumber(int rollNumber) {
        if (head == null) return; // List is empty

        // If the roll number to delete is the head
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }

        // If the roll number was found
        if (current.next != null) {
            current.next = current.next.next; // Bypass the node to delete it
        } else {
            System.out.println("Roll number " + rollNumber + " not found.");
        }
    }

    // Method to display all roll numbers in the list
    public void displayRollNumbers() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        System.out.print("Roll numbers: ");
        while (current != null) {
            System.out.print(current.rollNumber + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class RollNumberManagement {
    public static void main(String[] args) {
        RollNumberLinkedList rollNumberList = new RollNumberLinkedList();

        // Adding roll numbers
        rollNumberList.addRollNumber(001);
        rollNumberList.addRollNumber(007);
        rollNumberList.addRollNumber(031);
        rollNumberList.addRollNumber(045);
        rollNumberList.displayRollNumbers();

        // Deleting a roll number
        System.out.println("Deleting roll number 007:");
        rollNumberList.deleteRollNumber(007);
        rollNumberList.displayRollNumbers();

        // Attempting to delete a roll number that doesn't exist
        System.out.println("Attempting to delete roll number 104 (not in the list):");
        rollNumberList.deleteRollNumber(000);
        rollNumberList.displayRollNumbers();
    }
}