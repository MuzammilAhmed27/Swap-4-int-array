/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023fbse045;

/* @author 2023F-BSE-045 */
class BookNode {
    int bookId;
    String title;
    BookNode prev;
    BookNode next;

    public BookNode(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.prev = null;
 this.next = null;
    }}

class LibraryDoublyLinkedList {
    private BookNode head;

    public void insertAtBeginning(int bookId, String title) {
        BookNode newNode = new BookNode(bookId, title);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;}

    public void display() {
        BookNode current = head;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Title: " + current.title);
            current = current.next;
        } }

    public void deleteById(int bookId) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Deleting the head
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found.");}

    public void displayAfterDeletion(int bookId) {
        deleteById(bookId);
        System.out.println("List after deletion of Book ID " + bookId + ":");
        display();}

    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        library.insertAtBeginning(1, "Book 1");
        library.insertAtBeginning(2, "Book 2");
        library.insertAtBeginning(3, "Book 3");
        System.out.println("All books in the library:");
        library.display();
        library.displayAfterDeletion(2);
    }
}