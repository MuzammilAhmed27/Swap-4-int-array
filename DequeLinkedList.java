/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023fbse045;

/* @author 2023F-BSE-045 */
import java.util.Deque;
import java.util.LinkedList;

class DequeLinkedList {
    private Deque<Integer> deque;

    public DequeLinkedList() {
        deque = new LinkedList<>();
    }

    public void addFirst(int value) {
        deque.addFirst(value);
    }

    public void addLast(int value) {
        deque.addLast(value);
    }

    public void removeFirst() {
        deque.removeFirst();
    }

    public void removeLast() {
        deque.removeLast();
    }

    public void display() {
        System.out.println("Deque elements:");
        for (int value : deque) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeLinkedList dequeList = new DequeLinkedList();
        dequeList.addFirst(31);
        dequeList.addLast(45);
        dequeList.addFirst(1);
        dequeList.addLast(47);
        dequeList.display();
        dequeList.removeFirst();
        dequeList.removeLast();
        dequeList.display();
    }
}