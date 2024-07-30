package org.example;

import java.util.ArrayList;
import java.util.List;

class Product{
    String productId;
    String productName;
    String quantity;
    String price;


    public void add(List<String> newList){
        newList.add("ProductId");
        newList.add("ProductName");
        newList.add("Quantity");
        newList.add("Price");


    }

    public void update(List<String> newList){
        String obj = "Price";
        newList.remove(obj);
        newList.add("Updated Price");

    }

    public void delete(List<String> newList){
        newList.clear();

    }
}

public class Main {
    public static void main(String[] args) {

        //array list
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