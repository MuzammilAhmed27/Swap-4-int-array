/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2023fbse045;

/* @author 2023F-BSE-045 */
class SongNode {
    int songId;
    String title;
    SongNode prev;
    SongNode next;

    public SongNode(int songId, String title) {
        this.songId = songId;
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}

class PlaySongsDoublyLinkedList {
    private SongNode head;
    private SongNode tail;

    public void insertAtEnd(int songId, String title) {
        SongNode newNode = new SongNode(songId, title);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        SongNode current = head;
        while (current != null) {
            System.out.println("Song ID: " + current.songId + ", Title: " + current.title);
            current = current.next;
        }
    }

    public void reverseDisplay() {
        SongNode current = tail;
        while (current != null) {
            System.out.println("Song ID: " + current.songId + ", Title: " + current.title);
            current = current.prev;
        }
    }

    public static void main(String[] args) {
        PlaySongsDoublyLinkedList playlist = new PlaySongsDoublyLinkedList();
        playlist.insertAtEnd(1, "Song A");
        playlist.insertAtEnd(2, "Song B");
        playlist.insertAtEnd(3, "Song C");
        System.out.println("Playlist from start to end:");
        playlist.display();
        System.out.println("Playlist from end to start:");
        playlist.reverseDisplay();
    }
}