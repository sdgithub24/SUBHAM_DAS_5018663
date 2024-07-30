package org.example;
class Forecast{
    public int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Forecast f = new Forecast();
        System.out.println(" Output :  "+f.sum(3));

    }
}