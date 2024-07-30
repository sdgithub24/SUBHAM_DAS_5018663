package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    Integer productId;
    String productName;
    String category;

    public int linear(List<Integer> a, int key)
    {
        for(int i = 0; i < a.size(); i++)
        {
            int element = a.get(i);
            if(element == key)
            {
                return 1;
            }
        }
        return 0;
    }

    public int binary(List<Integer> A,Integer key){
        Collections.sort(A);

        int low = 0;

        // high pointer
        int high = A.size() - 1;

        while (low <= high) {

            // find the mid pointer
            int mid = low + (high - low) / 2;
            if (A.get(mid) == key) {
                return 1;
            }
            else if (A.get(mid) < key) {

                // shift the low pointer
                low = mid + 1;
            }
            else {

                // shift the high pointer
                high = mid - 1;
            }
        }
        return 0;

    }
}

public class Main {
    public static void main(String[] args) {
        //array list of product id
        List<Integer> products = new ArrayList<Integer>();
        products.add(2);
        products.add(3);
        products.add(4);
        products.add(1);

        Product p = new Product();
        System.out.println("Linear search");
        int b = p.linear(products,1);
        if(b==1){
            System.out.println("Element found\n\n");
        }
        else{
            System.out.println("Element not found\n\n");
        }


        System.out.println("Binary search");
        int a = p.binary(products, 3);
        if(a==1){
            System.out.println("Element found\n");
        }
        else{
            System.out.println("Element not found");
        }




    }
}