/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bse045;
/* @author 2023F-BSE-045 */
class Person {
    String name;
    int age;
    double salary;
    Person next;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.next = null;
    }}
class PersonLinkedList {
    private Person head;
    
    public void insertAtEnd(String name, int age, double salary) {
        Person newPerson = new Person(name, age, salary);
        if (head == null) {
            head = newPerson;
            return;}
        Person current = head;
        while (current.next != null) {
            current = current.next;}
        current.next = newPerson;}
    
    public void delete(String name) {
        if (head == null) return;
        if (head.name.equals(name)) {
            head = head.next;
            return;}
        Person current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;}
        if (current.next != null) {
            current.next = current.next.next;}}
    
    public void viewList() {
        Person current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Age: " + current.age + ", Salary: " + current.salary);
            current = current.next;}}}

public class PersonsInformation {
    public static void main(String[] args) {
        PersonLinkedList list = new PersonLinkedList();
        list.insertAtEnd("Person1",  20, 20000);
        list.insertAtEnd("Person2",  19, 19000);
        list.insertAtEnd("Person3",  18, 18000);
        list.insertAtEnd("Person4",  23, 23000);
        list.insertAtEnd("Person5",  22, 22000);
        list.insertAtEnd("Person6",  21, 21000);
        list.insertAtEnd("Person7",  24, 24000);
        list.insertAtEnd("Person8",  26, 26000);
        list.insertAtEnd("Person9",  25, 25000);
        list.insertAtEnd("Person10", 27, 27000);
        list.viewList();

        System.out.println("Deleting Person10:");
        list.delete("Person10");
        list.viewList();
    }
}