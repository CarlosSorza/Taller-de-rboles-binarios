package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

class BinaryTreeTest {

    @Test
    void testBinaryTree() {
        BinaryTree bst = new BinaryTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        assertEquals(Arrays.asList(3, 5, 7, 10, 12, 15, 18), bst.inOrderTraversal());
        assertEquals(Arrays.asList(10, 5, 3, 7, 15, 12, 18), bst.preOrderTraversal());
        assertEquals(Arrays.asList(3, 7, 5, 12, 18, 15, 10), bst.postOrderTraversal());
        assertEquals(Arrays.asList(10, 5, 15, 3, 7, 12, 18), bst.levelOrderTraversal());
        assertEquals(2, bst.height());
        assertTrue(bst.isBalanced());
        assertEquals(7, bst.countNodes()); // Corrige este valor si es necesario

        bst.delete(15);
        assertEquals(Arrays.asList(3, 5, 7, 10, 12, 18), bst.inOrderTraversal());
    }
}
