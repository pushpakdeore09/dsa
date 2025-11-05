package Trees;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createBinaryTree();
        binaryTree.bfs(root);

    }
}
