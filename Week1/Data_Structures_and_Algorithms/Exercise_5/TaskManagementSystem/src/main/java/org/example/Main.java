package org.example;

class Node {
    int data;
    Node next;
};

class Task{
    int taskId;
    String taskName;
    Integer status;


    public void add(Node n1,Node n2){

        // Assign data in first
        // node
        n1.data = 1;

        n1.next = n2;

        n2.data = 2;
        n2.next = null;

    }

    public void search(Node n){
        while (n != null) {
            // Print the data
            if (n.data == 2) {
                System.out.print("2 found");}
            n = n.next;
        }

    }

    public void traverse(Node n){
        while (n != null) {
            // Print the data
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

    public void delete(Node n){

        while (n != null) {
            // Print the data
            System.out.print(n.data + " ");
            if (n.data == 1) {
                n.next = null;}
            n = n.next;
        }

    }

}

public class Main {
    public static void main(String[] args) {
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