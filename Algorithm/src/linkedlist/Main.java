package linkedlist;

public class Main {

    public static void main(String[] args) {
        singlyLinkedList();
    }

    private static void singlyLinkedList() {
        ASinglyLinkedList<Integer> list = new ASinglyLinkedList<>();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(30);
        list.insert(50, 2);
        list.insert(25, 4);

        list.display();

        list.deleteFirst();
        list.deleteLast();

        list.display();

        list.delete(1);
        list.display();
    }
}
