package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testProduct() {
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
        int a = p.binary(products, 4);
        if(a==1){
            System.out.println("Element found\n");
        }
        else{
            System.out.println("Element not found");
        }

    }

}