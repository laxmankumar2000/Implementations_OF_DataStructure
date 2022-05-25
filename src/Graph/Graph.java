package Graph;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    Map<Integer, Map<Integer,Integer>> mp = new HashMap<>();
    public Graph(int v)
    {
        mp = new HashMap<>();
        for(int i = 1;i<=v;i++)
        {
            mp.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost)
    {
        mp.get(v1).put(v2,cost);
        mp.get(v2).put(v1,cost);
    }

    public int noOfEdge()
    {
        int sum = 0;
        for (int key:mp.keySet())
        {
            sum = sum+mp.get(key).size();
        }
        return sum;
    }

    public boolean containsEdge(int v1 , int v2){
        return mp.get(v1).containsKey(v2) && mp.get(v2).containsKey(v1);
    }

    public void removeEdge(int v1, int v2)
    {
        if (containsEdge(v1,v2)) {
            mp.get(v1).remove(v2);
            mp.get(v2).remove(v1);
        }
    }
    public void removevertex(int v1)
    {
        for(int key :mp.get(v1).keySet())
        {
            mp.get(key).remove(v1);
        }
        mp.remove(v1);
    }
    public void display()
    {
        for(int key:mp.keySet())
        {
            System.out.println(key + " " + mp.get(key));
        }
    }
}
