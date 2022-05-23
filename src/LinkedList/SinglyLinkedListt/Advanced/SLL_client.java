package LinkedList.SinglyLinkedListt.Advanced;

public class SLL_client {
    public static void main(String[] args) throws Exception {
        SLL obj = new SLL();
        obj.addFrist(10);
        obj.addFrist(20);
        obj.addFrist(30);
        obj.addFrist(40);
        obj.addLast(50);
        obj.addLast(60);
        System.out.println(obj.size);

        obj.addAtIndex(15,4);
        obj.display();
        System.out.println();
        System.out.println(obj.getFrist().data);
        System.out.println(obj.getLast().data);
        System.out.println(obj.getAnyIndex(4).data);
        System.out.println(obj.getnode(4).data);

        System.out.println();

        obj.removeFrist();
        obj.removeLast();
        System.out.println();
        obj.display();
        System.out.println(obj.size);

    }
}
