package org.example;


class Employee {
    int employeeId;
    String name;
    String position;
    Integer salary;


    public void add(int arr[]){
        int N = arr.length;
        arr[N-1] = 9;

    }
    public void search(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4){
                System.out.println("Employee with id 4 found");
            }

        }

    }
    public void traverse(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
            System.out.print(arr[i] + " ");}
        }

    }
    public void delete(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3){
                System.out.println("Employee with id 3 deleted");
                arr[i] = 0;
            }

        }

    }
}
public class Main {
    public static void main(String[] args) {

        int[] arr = { 5,4,8,1,6,3 };
        Employee e = new Employee();
        System.out.println("Showing all the employees");
        e.traverse(arr);
        System.out.println("\nDeleting employee with id 3");
        e.delete(arr);
        e.traverse(arr);
        System.out.println("\nAdding employee with id 9");
        e.add(arr);
        e.traverse(arr);
        System.out.println("\nSearching employee with id 4");
        e.search(arr);
        e.traverse(arr);

    }
}