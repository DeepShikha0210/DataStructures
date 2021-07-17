package CreatingSolutions;

public class Trie {

    class TrieNode{

        boolean isEnd;
        TrieNode children[];
        TrieNode()
        {
            children = new TrieNode[26];
            isEnd= false;
        }
    }

    private static TrieNode root;
    Trie()
    {
//Initialise your data structure here
        root = new TrieNode();
    }


    public void insert(String word) { //this is iterative method... can also be implemented by calling add(root, word);

        word=word.toLowerCase();
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index= c-'a';
            if(current.children[index]==null) {
                TrieNode node = new TrieNode();
                current.children[index]=node;
                current=node;
            }
            else
                current=current.children[index];

        }
        current.isEnd=true;
    }

    public void add(TrieNode node, String word)  // Recursive method
    {
        //base case
        if(word.length() == 0){
            node.isEnd =true;
        return;
    }

    int index= word.charAt(0)-'a';
    TrieNode child = node.children[index];
	if(child == null)
    {
        node.children[index] = new TrieNode();
        child = node.children[index];
    }
    //call the next step
    add(child , word.substring(1));
}
 
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("dog");
        System.out.println("inserted successfully");
    }

    }



