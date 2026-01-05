package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ASinglyLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public ASinglyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(T val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(T val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(T val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index >= size) {
            insertLast(val);
            return;
        }

        int position = 0;
        Node current = head;
        while (index - position > 1) {
            current = current.next;
            position++;
        }

        current.next = new Node(val, current.next);
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            tail = null;
            return;
        }
        Node currentHead = head;
        head = head.next;
        currentHead.next = null;
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }

        tail = get(size - 2);
        tail.next = null;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index >= size - 1) {
            deleteLast();
            return;
        }

        Node previous = get(index - 1);
        Node toDelete = previous.next;
        previous.next = toDelete.next;
        toDelete.next = null;

        size--;
    }

    private Node get(int index) {
        Node current = head;
        int position = 0;
        while (position < index) {
            current = current.next;
            position++;
        }
        return current;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }

    public List<T> toList() {
        List<T> values = new ArrayList<>();
        Node current = head;
        while (current != null) {
            values.add(current.value);
            current = current.next;
        }
        return values;
    }

    private class Node {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
