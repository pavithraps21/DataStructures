package LinkedList;

import java.util.Scanner;

class TreeNode4 {
    int data;
    TreeNode4 left;
    TreeNode4 right;
    
    // Constructor
    public TreeNode4(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

    public class BinarySearchTreeAll {
    TreeNode4 root;

    // Constructor for parameter ->bst
    public BinarySearchTreeAll(int rootData) {
        this.root = new TreeNode4(rootData);
    }

    // Method for invoking inserting BST:
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Method for same invoke but for value:
    private TreeNode4 insertVal(TreeNode4 root, int data) {
        if (root == null) {
            return new TreeNode4(data);
        }

        // Nested if():
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            root.right = insertVal(root.right, data);
        }
        return root;
    }

    // Traversal start():
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode4 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private void preOrderTraversal(TreeNode4 root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode4 root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        BinarySearchTreeAll binarysearchtree = new BinarySearchTreeAll(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            binarysearchtree.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        binarysearchtree.inOrderTraversal();

        System.out.println("\nPreOrder Traversal: ");
        binarysearchtree.preOrderTraversal();

        System.out.println("\nPostOrder Traversal: ");
        binarysearchtree.postOrderTraversal();

        sc.close();
    }
}