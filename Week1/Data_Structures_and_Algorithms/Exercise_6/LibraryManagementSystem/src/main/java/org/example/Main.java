package org.example;


class Book{
    String bookId;
    String title;
    String author;

    public int linearsearch(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }



    int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;


            if (arr[mid] == x)
                return mid;


            if (arr[mid] < x)
                low = mid + 1;


            else
                high = mid - 1;
        }


        return -1;
    }
}
public class Main {
    public static void main(String[] args) {

        int arr[] ={1, 2 ,3,4};
        Book b = new Book();
        int N = arr.length;

        System.out.println("Searching using linear search");

        int a = b.linearsearch(arr,N,3);
        if(a>=0){
            System.out.println("Found 3 using linear search");
        }

        System.out.println("Searching using binary search");

        int c = b.binarySearch(arr,3);
        if(c>=0){
            System.out.println("Found 3 using binary search");
        }


    }
}