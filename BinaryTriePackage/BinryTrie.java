package  BinaryTriePackage;


import java.util.HashMap;
import java.util.Timer;

public class BinryTrie {
    public static void main(String[] args) {
        TrieClass trieClass = new TrieClass();
        trieClass.insert("air");
        trieClass.insert("airtist");
        System.out.println(trieClass.root.toString());
        trieClass.delete("air");
        System.out.println(trieClass.root.toString());

    }
}

class TrieClass{
    //now create a trie
    class Trie{
        HashMap<Character,Trie> children;
        boolean endofword;
        public Trie(){
            children = new HashMap<>();
            endofword = false;
        }

        @Override
        public String toString() {
            return "Trie{" +
                    "children=" + children +
                    ", endofword=" + endofword +
                    '}';
        }
    }

    //now create a root node
    //for this we have to decleare the var first
    Trie root;
    public TrieClass(){
        root = new Trie();
    }

    public void insert(String str){
        int length = str.length();
        Trie current = root;
        for(int i=0;i<length;i++){
            char c = str.charAt(i);
            Trie node = current.children.get(c);
            if(node==null){
                node = new Trie();
                node.children.put(c,new Trie());
                current.children.put(c,node);
            }
            current = node;

        }
        current.endofword = true;


    }

    public boolean search(String s){
        Trie current = root;

        for(int i=0;i<s.length();i++){
            Trie node = current.children.get(s.charAt(i));

            if(node!=null){
                current = node;
            }
            else{return false;}
        }
        if(current.endofword==true){
            System.out.println("Exists");
        }else {
            System.out.println("Prefix is exists");
        }
        return current.endofword;
    }

    //deletion on trie first check there is that trie or not
    public  void delete(String str){
        if(search(str)){
            System.out.println(deletion(root,str,0));
        }else{
            System.out.println(":Your String does not found in the given string");
        }
    }
    //recursive call to delete
    private boolean deletion(Trie parentNode, String str, int index) {
        if(index<=str.length()){
            return true;
        }
        char ch = str.charAt(index);
        Trie child = parentNode.children.get(ch);
        //if more than one child present that is B->c B->d then we can not delete B node directly
        //so first case
        if(child.children.size()>1){
            System.out.println("some other children are also present so goto next level");
            deletion(child,str,index+1);
            return false;
        }


        //in second case bcd and bcde both are valid but we can not delete bcd becase bcde is present
        //so simply we can write that bcd.endword->false
        if(index == str.length()-1){
            // there are more than one children then this
            if(child.children.size()>=1){
                child.endofword = false;
                return false;
            }else{
                //simply remove this
                System.out.println("simply remove that one");
                parentNode.children.remove(ch);
                return  true;
            }
        }
       //if children is valid
        if(child.endofword==true){
            System.out.println("in this we get bcd and bcde ");
            deletion(child,str,index+1);
            return false;
        }
        boolean cannodeBeDeleted = deletion(child,str,index+1);
        if(cannodeBeDeleted){
            System.out.println("yes directly remove that node");
            parentNode.children.remove(ch);
            return  true;
        }
        else{
            return  false;
        }

    }


}