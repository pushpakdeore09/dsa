package Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public TreeNode createBinaryTree(){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        root.left = node2;
        root.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;
        return root;
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + "->");
        dfs(root.left);
        dfs(root.right);
    }

    public void bfs(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            System.out.print(curr.data + "->");
            if(curr.left != null){
                queue.offer(curr.left);
            }
            if(curr.right != null){
                queue.offer(curr.right);
            }
        }
    }
}
