package secondlargestelementinAray;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    // Time Complexity: O(n*log(n))
    // Auxiliary space: O(1)
    static int getLargestElement(int []arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[i-1])
                return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(getLargestElement(arr));
    }
}
