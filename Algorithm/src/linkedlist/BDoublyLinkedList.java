package linkedlist;

public class BDoublyLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        T value;
        Node next;
        Node prev;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
