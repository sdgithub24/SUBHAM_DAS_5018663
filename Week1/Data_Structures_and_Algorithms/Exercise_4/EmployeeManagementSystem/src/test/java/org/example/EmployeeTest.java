package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void testEmployee() {
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