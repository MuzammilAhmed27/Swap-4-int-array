/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023fbse045;

/* @author 2023F-BSE-045 */
import java.util.Deque;
import java.util.LinkedList;

class StudentNode {
    String name;
    String rollNumber;
    StudentNode prev;
    StudentNode next;

    public StudentNode(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.prev = null;
        this.next = null;
    }
}

class StudentDoublyLinkedList {
    private Deque<StudentNode> deque;

    public StudentDoublyLinkedList() {
        deque = new LinkedList<>();
    }

    public void insertFirst(String name, String rollNumber) {
        StudentNode newNode = new StudentNode(name, rollNumber);
        deque.addFirst(newNode);
    }

    public void insertLast(String name, String rollNumber) {
        StudentNode newNode = new StudentNode(name, rollNumber);
        deque.addLast(newNode);
    }

    public void display() {
        for (StudentNode student : deque) {
            System.out.println("Name: " + student.name + ", Roll Number: " + student.rollNumber);
        }
    }

    public static void main(String[] args) {
        StudentDoublyLinkedList studentList = new StudentDoublyLinkedList();
        studentList.insertFirst("Muzammil", "45");
        studentList.insertLast("Subhan", "31");
        studentList.insertLast("Wasay", "1");
        studentList.display();
    }
}