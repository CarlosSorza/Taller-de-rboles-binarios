# Taller-de-Arboles-binarios
# Carlos Alberto Sorza Gómez
 # Binary Search Tree (BST)

A binary search tree (BST) is a data structure that organizes data hierarchically, allowing for efficient insertion, deletion, and lookup operations. In a BST, each node contains a value, and it follows two key properties:

- The value of every node in the left subtree is less than the value of the node itself.
- The value of every node in the right subtree is greater than the value of the node itself.

These properties ensure that search operations can be performed in O(log n) time on average, making BSTs an efficient choice for storing and retrieving ordered data. Make your implementation compatible with the Java Collections API.

## Assignment

Implement a binary search tree (BST) in Java. Test your BST with various inputs to ensure that all methods function as expected.

Your implementation should include several fundamental functions to manage and traverse the tree effectively. Below is a description of the essential functions that a binary tree must have:

1. **Insertion (insert)**
   - **Purpose**: Adds a new node to the tree while maintaining the binary tree properties.
   - **Details**: This function takes a value as input and places the new node in the correct position based on its value compared to other nodes, ensuring that it follows the binary tree rules (for binary search trees, the left child is less than the parent, and the right child is greater).

2. **Search (search)**
   - **Purpose**: Finds and returns a node containing a specific value.
   - **Details**: This function traverses the tree, comparing the target value with each node’s value. If it finds the value, it returns the node; otherwise, it returns null or indicates that the value is not present in the tree.

3. **Deletion (delete)**
   - **Purpose**: Removes a node with a specified value from the tree while maintaining its structure and properties.
   - **Details**: This function involves three cases:
     - The node to be deleted is a leaf node (no children).
     - The node has only one child.
     - The node has two children. In the third case, the function typically finds the in-order successor (the smallest node in the right subtree) or the in-order predecessor (the largest node in the left subtree) to replace the deleted node.

4. **Traversal Methods**
   - **Purpose**: These functions are used to visit all the nodes in the tree in a specific order.
   - **Types**:
     - **In-order Traversal (inOrderTraversal)**: Visits nodes in ascending order (left, root, right). For binary search trees, this produces a sorted sequence of values.
     - **Pre-order Traversal (preOrderTraversal)**: Visits the root first, followed by the left subtree and then the right subtree (root, left, right). This is useful for creating a copy of the tree.
     - **Post-order Traversal (postOrderTraversal)**: Visits the left and right subtrees before the root (left, right, root). This is helpful for deleting or freeing nodes.

5. **Find Minimum (findMin)**
   - **Purpose**: Finds and returns the node with the smallest value in the tree.
   - **Details**: In a binary search tree, this is the leftmost node.

6. **Find Maximum (findMax)**
   - **Purpose**: Finds and returns the node with the largest value in the tree.
   - **Details**: In a binary search tree, this is the rightmost node.

7. **Height (height)**
   - **Purpose**: Calculates and returns the height (or depth) of the tree, which is the number of edges from the root to the deepest leaf.
   - **Details**: This function helps determine the balance and efficiency of operations on the tree.

8. **Check if the Tree is Balanced (isBalanced)**
   - **Purpose**: Determines if the tree is balanced, meaning the heights of the two child subtrees of any node differ by no more than one.
   - **Details**: A balanced tree ensures better performance for insertion, deletion, and search operations.

9. **Level-Order Traversal (levelOrderTraversal)**
   - **Purpose**: Visits all nodes at each level of the tree, starting from the root, then level 1, level 2, and so on.
   - **Details**: This traversal is often implemented using a queue and is used for breadth-first search (BFS) operations.

10. **Clear (clear)**
    - **Purpose**: Removes all nodes from the tree, making it empty.
    - **Details**: This function is useful for resetting or clearing the tree’s contents.

11. **Count Nodes (countNodes)**
    - **Purpose**: Returns the number of nodes currently present in the tree.
    - **Details**: Useful for determining the size of the tree and for validating the correctness of operations.
   
Probando con Enteros
  ![image](https://github.com/user-attachments/assets/3f15c3f5-1371-4b81-97ba-8edef32fa9e0)

Test
![image](https://github.com/user-attachments/assets/232beedb-0545-4572-8884-1bcfbb8b1482)



