package nextpermutation;

import static java.util.Collections.swap;

public class Demo1 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static void nextPermutation(int arr[]) {
        int n = arr.length;
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverseArr(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot );
                break;
            }
        }
    }
    public static void reverseArr(int arr[],int start,int end){
        while (start<end) {
            swap(arr, start++, end--);
        }
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 5, 0 };
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        nextPermutation(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

