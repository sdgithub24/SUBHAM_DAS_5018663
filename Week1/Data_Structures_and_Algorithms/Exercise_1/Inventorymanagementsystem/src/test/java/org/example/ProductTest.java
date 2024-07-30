package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testProduct() {
        List<String> newList = new ArrayList<>();

        Product product = new Product();

        System.out.println("Adding product");
        product.add(newList);
        System.out.println(newList);


        System.out.println("Updating product price");
        product.update(newList);
        System.out.println(newList);

        System.out.println("Deleting product");
        product.delete(newList);
        System.out.println(newList);
    }
}