package LinkedList;

public class SinglyList_client {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        System.out.println(obj.isEmpty());
        obj.insert(20);
        obj.insrtAtBegaing(30);
        obj.insert(40);
        obj.insert(100);
        obj.display();

        obj.deleteLast();

        obj.display();

    }

}
