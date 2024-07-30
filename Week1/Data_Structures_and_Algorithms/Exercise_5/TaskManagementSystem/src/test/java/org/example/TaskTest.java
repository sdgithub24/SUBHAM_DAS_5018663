package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void test() {
        Task t1 = new Task();
        Node n1 = new Node();
        Node n2 = new Node();
        System.out.println("\nInserting elements\n");
        t1.add(n1,n2);
        System.out.println("\nTraversal\n");
        t1.traverse(n1);
        System.out.println("\nSearching elements\n");
        t1.search(n1);
        System.out.println("\nDeleting elements\n");
        t1.delete(n1);
    }

}