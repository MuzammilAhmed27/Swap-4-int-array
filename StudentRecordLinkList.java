/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
import java.util.Random;
class Student {
    String name;
    int age;
    int semester;
    Student next;

    public Student(String name, int age, int semester) {
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.next = null;
    }
}

class StudentLinkedList {
    private Student head;

    // To view the list
    public void viewList() {
        Student current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Age: " + current.age + ", semester: " + current.semester);
            current = current.next;
        }
    }

    // To insert at different locations
    public void insertAtBeginning(String name, int age, int semester) {
        Student newStudent = new Student(name, age, semester);
        newStudent.next = head;
        head = newStudent;
    }

    public void insertAtEnd(String name, int age, int semester) {
        Student newStudent = new Student(name, age, semester);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    public void insertAtPosition(String name, int age, int semester, int position) {
        if (position == 0) {
            insertAtBeginning(name, age, semester);
            return;
        }
        Student newStudent = new Student(name, age, semester);
        Student current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newStudent.next = current.next;
        current.next = newStudent;
    }

    // To Search for an element
    public boolean search(String name) {
        Student current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // To Delete a record
    public void delete(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Student current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.insertAtEnd("Muzammil", 20, 3);
        list.insertAtEnd("Subhan", 21, 3);
        list.insertAtEnd("Wasay", 19, 3);
        list.viewList();

        System.out.println("Inserting at position 1:");
        list.insertAtPosition("Khurram", 23, 3, 1);
        list.viewList();

        System.out.println("Searching for Muzammil: " + list.search("Muzammil"));
        System.out.println("Deleting Khurram:");
        list.delete("Khurram");
        list.viewList();
    }
}