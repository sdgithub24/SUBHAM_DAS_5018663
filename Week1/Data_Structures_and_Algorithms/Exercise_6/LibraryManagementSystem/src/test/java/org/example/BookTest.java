package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void test() {
        int arr[] ={1, 2 ,3,4};
        Book b = new Book();
        int N = arr.length;

        System.out.println("Searching using linear search");

        int a = b.linearsearch(arr,N,4);
        if(a>=0){
            System.out.println("Found 4 using linear search");
        }

        System.out.println("Searching using binary search");

        int c = b.binarySearch(arr,4);
        if(c>=0){
            System.out.println("Found 4 using binary search");
        }
    }

}