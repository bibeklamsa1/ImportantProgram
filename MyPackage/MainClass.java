package MyPackage;

public class MainClass {
    public static void main(String[] args) {
        AvLTree avLTree = new AvLTree();
        avLTree.insertANode(10);
        avLTree.insertANode(20);
        avLTree.insertANode(40);
        avLTree.insertANode(50);
        avLTree.insertANode(15);
        avLTree.BFS(avLTree.root);

    }
}
