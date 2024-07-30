package org.example;

class Order{
    String orderId;
    String customerName;
    int totalPrice;

    public void BubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];


        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {


            if (arr[j] < pivot) {


                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public void QuickSOrt(int[] arr, int low, int high){
        if (low < high) {

            int pi = partition(arr, low, high);

            QuickSOrt(arr, low, pi - 1);
            QuickSOrt(arr, pi + 1, high);
        }




    }
}
public class Main {
    public static void main(String[] args) {


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