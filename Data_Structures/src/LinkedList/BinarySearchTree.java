package LinkedList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    // Constructor for parameter => binarySearchTree
    public BinarySearchTree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    // Method for invoking inserting binarySearchTree
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // method of same invoke but for value allocation
    TreeNode insertVal(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // nested if()
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            root.right = insertVal(root.right, data);
        }
        return root;
    }

    // traversal start()
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");	
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
    	
        BinarySearchTree bst = new BinarySearchTree(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        System.out.println("InOrder Traversal: ");
        bst.inOrderTraversal();
    }
}
