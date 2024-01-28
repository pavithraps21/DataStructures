package LinkedList;
import java.util.Scanner;

class TreeNode3 {
    int data;
    TreeNode3 left;
    TreeNode3 right;

    // Constructor
    public TreeNode3(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    TreeNode3 root;

    // Constructor
    public Tree(int rootData) {
        this.root = new TreeNode3(rootData);
    }

    // Method to insert a new node
    public void insert(int data) {
        root = insertValue(root, data);
    }

    // Recursive method to insert a new node
    private TreeNode3 insertValue(TreeNode3 root, int data) {
        if (root == null) {
            root = new TreeNode3(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertValue(root.left, data);
        } else if (data > root.data) {
            root.right = insertValue(root.right, data);
        }

        return root;
    }

    // Method to perform inorder traversal
    public void inorderTraversal() {
        performInorderTraversal(root);
    }

    // Recursive method to perform inorder traversal
    private void performInorderTraversal(TreeNode3 root) {
        if (root != null) {
            performInorderTraversal(root.left); // Left
            System.out.print(root.data + " "); // Root
            performInorderTraversal(root.right); // Right
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the root node: ");
        int rootValue = sc.nextInt();

        Tree binaryTree = new Tree(rootValue);

        System.out.println("Enter the number of nodes to insert: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter the value of node " + (i + 1) + ": ");
            int nodeData = sc.nextInt();
            binaryTree.insert(nodeData);
        }

        // Display the inorder traversal of the binary tree
        System.out.println("Inorder traversal of the binary tree:");
        binaryTree.inorderTraversal();

        sc.close();
    }
}
