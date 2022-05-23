/*

 */

package LinkedList;


public class SinglyLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    Node root;
    public SinglyLinkedList()
    {
        root = null;
    }

    public  boolean isEmpty()
    {
        return root == null;
    }

    public void insrtAtBegaing(int data) {
        Node nn = new Node(data);
        nn.next = root;
        root =nn;
        System.out.println(data +"  is added" );
    }
    public void insert(int data)
    {
        Node nn = new Node(data);
        if(isEmpty()) {
            insrtAtBegaing(data);

        }else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
            System.out.println(data + "  is added");
        }

    }

    public void deleteLast()
    {
        Node prev = null;
        Node temp = root;
        while(temp.next!=null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next=null;

    }

    public void display()
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
