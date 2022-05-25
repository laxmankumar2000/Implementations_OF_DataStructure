package Trie;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Trie {
    public class Node {
        boolean isterminal;
        Map<Character, Node> children;
        char ch;

        public Node(char ch) {
        this.ch = ch;
        children = new HashMap<>();
        isterminal = false;
        }
    }

    Node root;

    public Trie()
    {
        this.root = new Node('*');
    }

    public void insert(String word)
    {
        Node curr = root;
        for(int i = 0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(curr.children.containsKey(ch))
                curr=curr.children.get(ch);
            else
            {
                Node nn = new Node(ch);
                curr.children.put(ch,nn);
                curr =nn;
            }
        }
        curr.isterminal = true;
    }


    public boolean search(String word)
    {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if (!curr.children.containsKey(ch))
                return false;
            curr=curr.children.get(ch);
        }
        return curr.isterminal;
    }

    public boolean startwith(String word)
    {
        Node curr = root;
        for(int i =0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if (!curr.children.containsKey(ch))
                return false;
            curr=curr.children.get(ch);

        }
        return true;
    }
}
