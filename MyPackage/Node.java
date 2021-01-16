package MyPackage;

public class Node {
    int height;
    int data;
    Node left;
    Node right;

    public Node(int data,int height){
        this.data  = data;
        this.height = height;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "height=" + height +
                ", data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
