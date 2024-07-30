package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    public void test() {
        System.out.println("Test\n\n");
        int[] arr = { 9,8,7,5,1,2,3};
        int N = arr.length;


        System.out.println("Sorting by bubble sort\n");
        Order ob1 = new Order();
        ob1.BubbleSort(arr);
        ob1.printArray(arr);

        System.out.println("Sorting by quick sort\n");
        Order ob = new Order();
        ob.QuickSOrt(arr, 0, N - 1);
        ob.printArray(arr);
    }
}