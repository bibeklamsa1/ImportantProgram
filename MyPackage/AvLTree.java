package MyPackage;

import java.util.LinkedList;
import java.util.Queue;

public class AvLTree {
    //now create a root node
    Node root;
    public AvLTree(){
        root = null;
    }

    //create a node
    public Node createNewNode(int data){
        return new Node(data,0);
    }

    //insert a node
    public void insertANode(int data){
        root = insert(root,data);
    }
    //inserting method helper
    public Node insert(Node n,int data){
        if(n==null){
            return createNewNode(data);
        }else{
            if(n.data>data){
                n.left = insert(n.left,data);
            }else{
                n.right  = insert(n.right,data);
            }
        }
        int checkHeight = checkBalance(n.left,n.right);
        if(checkHeight>1){
            //in both lr and ll one left cancel so 1 is for left and if -1 height means right and 1 height means left so 1>0.
            if(checkBalance(n.left.left,n.left.right)>0){
                System.out.println("Height unbalanced at left-left and that is "+n.data);
                //in this right rotation is needed
                n = rightRotation(n);
            }else{
                System.out.println("Height unbalanced at left-right and that is "+n.data);
                //in this first left rotation after this right rotation needed
            }
        }
        else if(checkHeight<-1){

            if(checkBalance(n.right.left,n.right.right)<0){
                System.out.println("height unbalanced at right-right and that is "+n.data);
                //in this left rotation
                n = leftRotation(n.right);
            } else{
                System.out.println("height unbalanced at right-left and that is "+n.data);
                //int this left rotation is needed
            }
        }
        if(n.left!=null){
            n.left.height = getHeight(n.left);
        }
        if(n.right!=null){
            n.right.height=getHeight(n.right);
        }
        n.height = getHeight(n);
        return n;
    }

    //public void left-left path means right rotation needed
    public Node rightRotation(Node rootnode){
        Node newRoot= rootnode.left;
        rootnode.left = newRoot.right;
        newRoot.right = rootnode;
        rootnode.height = getHeight(rootnode);
        newRoot.height = getHeight(newRoot);
        return  newRoot;
    }

    //public void right-right means left rotation needed
    public Node leftRotation(Node rootnode){
        Node newRoot = rootnode.right;
        newRoot.left = rootnode;
        rootnode.right = newRoot.left;
        rootnode.height  = getHeight(rootnode);
        newRoot.height  = getHeight(newRoot);
        return  newRoot;
    }



    //return height
    private int getHeight(Node n) {
        if(n==null){
            return -1;
        }else{
            int left = getHeight(n.left);
            int right = getHeight(n.right);
            if(left>right){
                return left+1;
            }else{
                return right+1;
            }
        }
    }

    //check the left node height and right node height balance or not
    //for this we have to find height difference betwenn left node and right node
    private int checkBalance(Node left, Node right) {
        if(left==null && right==null){
            return 0;
        }
        else if(left==null){
            return -1*(right.height+1);
        }
        else if(right==null){
            return left.height+1;
        }else{
            return left.height- right.height;
        }
    }


    //level order traversal
    public void BFS(Node node){
        if(node==null){
            return;
        }else{
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()){
                Node temp = q.poll();
                System.out.print("{ "+ temp.data + " : "+ temp.height + " }\t");
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }


}
