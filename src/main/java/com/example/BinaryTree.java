package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    // 1. Insertion
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertRecursive(root, value);
        }
    }

    private void insertRecursive(Node node, int value) {
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insertRecursive(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                insertRecursive(node.right, value);
            }
        }
    }

    // 2. Search
    public Node search(int value) {
        return searchRecursive(root, value);
    }

    private Node searchRecursive(Node node, int value) {
        if (node == null || node.value == value) {
            return node;
        }
        return value < node.value ? searchRecursive(node.left, value) : searchRecursive(node.right, value);
    }

    // 3. Deletion
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node node, int value) {
        if (node == null) return null;

        if (value < node.value) {
            node.left = deleteRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRecursive(node.right, value);
        } else {
            // Node with only one child or no child
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            Node minLargerNode = findMin(node.right);
            node.value = minLargerNode.value;
            node.right = deleteRecursive(node.right, minLargerNode.value);
        }
        return node;
    }

    // 4. Traversal Methods
    public List<Integer> inOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        inOrderRecursive(root, result);
        return result;
    }

    private void inOrderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            inOrderRecursive(node.left, result);
            result.add(node.value);
            inOrderRecursive(node.right, result);
        }
    }

    public List<Integer> preOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        preOrderRecursive(root, result);
        return result;
    }

    private void preOrderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preOrderRecursive(node.left, result);
            preOrderRecursive(node.right, result);
        }
    }

    public List<Integer> postOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        postOrderRecursive(root, result);
        return result;
    }

    private void postOrderRecursive(Node node, List<Integer> result) {
        if (node != null) {
            postOrderRecursive(node.left, result);
            postOrderRecursive(node.right, result);
            result.add(node.value);
        }
    }

    // 5. Find Minimum
    public Node findMin(Node node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 6. Find Maximum
    public Node findMax(Node node) {
        if (node == null) return null;
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    // 7. Height
    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node node) {
        if (node == null) return -1;  // Height of an empty tree is -1
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }

    // 8. Check if the Tree is Balanced
    public boolean isBalanced() {
        return isBalancedRecursive(root)[1] == 1;
    }

    private int[] isBalancedRecursive(Node node) {
        if (node == null) return new int[]{0, 1}; // altura, balanceado
    
        int[] left = isBalancedRecursive(node.left);
        int[] right = isBalancedRecursive(node.right);
        
        int height = 1 + Math.max(left[0], right[0]);
        int balanced = (left[1] == 1 && right[1] == 1 && Math.abs(left[0] - right[0]) <= 1) ? 1 : 0;
    
        return new int[]{height, balanced};
    }

    // 9. Level-Order Traversal
    public List<Integer> levelOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return result;
    }

    // 10. Clear
    public void clear() {
        root = null;
    }

    // 11. Count Nodes
    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(Node node) {
        if (node == null) return 0;
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }
}
