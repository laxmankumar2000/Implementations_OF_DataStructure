package Trie;

public class Trie_client {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("RAM");
        t.insert("RAVI");
        t.insert("APPLE");
        t.insert("ram");
        System.out.println(t.search("ram"));
        System.out.println(t.startwith("aa"));
    }
}
