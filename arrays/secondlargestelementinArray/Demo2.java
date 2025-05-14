package arrays.secondlargestelementinArray;

import java.util.Arrays;

public class Demo2 {
    // Time Complexity: O(2*n) = O(n)
    // Auxiliary space: O(1)
    static int getLargestElement(int[]arr){
        int n=arr.length;
        int largest=arr[0];
        int second_largest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]>second_largest && arr[i]!=largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(getLargestElement(arr));
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
