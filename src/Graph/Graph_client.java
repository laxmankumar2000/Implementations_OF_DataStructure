package Graph;

public class Graph_client {

    public static void main(String[] args) {
        Graph obj = new Graph(7);
        obj.addEdge(1,2,5);
        obj.addEdge(1,3,15);
        obj.addEdge(2,4,20);
        obj.addEdge(2,5,25);
        obj.addEdge(3,4,15);
        obj.addEdge(5,6,30);
        obj.addEdge(5,7,35);
        obj.addEdge(6,7,45);

        System.out.println(obj.noOfEdge());

        obj.display();



    }
}
