package LinkedList.SinglyLinkedListt.Advanced;

public class SLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public SLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public boolean isEmpty() {
        return head == null;
    }

    //addfrist
    public void addFrist(int data) {
        Node nn = new Node(data);
        if(size==0)
        {
            this.head = nn;
            this.tail = nn;
            size++;
        }
        else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    //addlast
    public void addLast(int data) {
        if (isEmpty())
            addFrist(data);
        else {
            Node nn = new Node(data);
            tail.next = nn;
            size++;
            tail = nn;
        }
    }

    //addAtIndex
    public void addAtIndex(int data, int index) throws Exception {
        if (index < 0 || index > size)
            throw new Exception("pgl h kya ");

        if (index == 0)
            addFrist(data);
        if(index==this.size)
            addLast(data);
        else{
            Node temp = getnode(index-1);
            Node nn = new Node(data);
            nn.next = temp.next;
            temp.next= nn;
            size++;
        }
    }



    //getFirst
    public Node getFrist()
    {
        return head;
    }

    //getlast
    public Node getLast()
    {
        Node temp = head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        return temp;
    }

    //getanyindex
    public Node getAnyIndex(int index) throws Exception
    {
        if (index<0 || index>size)
            throw new Exception("pagal h kya");
        if(index==0)
            getFrist();
        if (index==size)
            getLast();
        else
        {
         return  getnode(index);
        }
        return null;
    }


    //getnode
    public Node getnode(int index) {
        Node temp = head;
        int curr = 1;
        while(curr<index)
        {
            temp = temp.next;
            curr++;
        }
        return temp;
    }


    //removefrist
    public void removeFrist()
    {
        System.out.println(head.data );
        head = head.next;
        size--;
    }

    //removelast
    public  void removeLast()
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
        temp.next=null;
        size--;
    }

    //removeatindex

    public void removeAtIndex(int index) throws  Exception
    {
        if (index<0 || index>size)
        {
            throw new Exception("please give correct index");
        }
        if(index==0)
            removeFrist();
        if(index==size)
            removeLast();
        else
        {
            Node temp = getnode(index);
            Node prev = getnode(index-1);
            prev.next =  temp.next;
            temp.next = null;
            size--;
        }

    }

    //display
    public void display()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
