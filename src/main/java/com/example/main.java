package com.example;

public class main {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        
        // Insertar nodos
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);
        
        // Mostrar recorridos
        System.out.println("Recorrido In-Order: " + bst.inOrderTraversal());
        System.out.println("Recorrido Pre-Order: " + bst.preOrderTraversal());
        System.out.println("Recorrido Post-Order: " + bst.postOrderTraversal());
        System.out.println("Recorrido Level-Order: " + bst.levelOrderTraversal());
        
        // Altura del árbol
        System.out.println("Altura del árbol: " + bst.height());
        
        // Verificar si el árbol está balanceado
        System.out.println("¿El árbol está balanceado? " + bst.isBalanced());
        
        // Contar nodos
        System.out.println("Número de nodos en el árbol: " + bst.countNodes());
        
        // Buscar un nodo
        Node foundNode = bst.search(7);
        System.out.println("¿Se encontró el nodo con valor 7? " + (foundNode != null));
        
        // Eliminar un nodo
        bst.delete(15);
        System.out.println("Recorrido In-Order después de eliminar 15: " + bst.inOrderTraversal());
    }
}
