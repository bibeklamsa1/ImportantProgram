import MyPackage.Node;

import java.util.HashMap;

public class TrieClass {

    public static void main(String[] args) {
        TireC tc = new TireC();
        tc.insert("bibek");
        tc.insert("lamsal" +
                "");
        System.out.println("is present bibek"+tc.search("bibek"));
        System.out.println(tc.root);
    }
}



class TireC{
    //now create a node
    private  class TrieNode{
        HashMap<Character,TrieNode> children;
        boolean isendword;
        TrieNode(){
            children = new HashMap<>();
            isendword = false;
        }
        // TODO: 1/3/2021

        @Override
        public String toString() {
            return "TrieNode{" +
                    "children=" + children +
                    ", isendword=" + isendword +
                    '}';
        }
    }
    //now create a root
    TrieNode root;
    public TireC(){
        root = new TrieNode();
    }
    public void insert(String s){
        TrieNode current = root;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            TrieNode node = root.children.get(c);
            if(node==null){
                node = new TrieNode();
                node.isendword=false;
                current.children.put(c,node);
            }
            current = node;
        }
        current.isendword=true;
    }

    public boolean search(String s){
        int length = s.length();
        if(length==0){
            return false;
        }else{
            TrieNode current= root;
            for(int i=0;i<length;i++){
                char c = s.charAt(i);
                TrieNode node = current.children.get(c);
                if(node!=null){
                    current = node;
                }else{
                    return false;
                }
            }
            if(current.isendword==true){
                System.out.println("Yes this is present in the given string ");
                return true;
            }else{
                System.out.println("No it is prefix only that type of the word is not present " +
                        "in the given string");
                return  false;
            }
        }
    }


}