package secondlargestelementinArray;

import java.util.Arrays;

public class Demo1a {
        // Time Complexity: O(n)
        // Auxiliary space: O(1)
        static int getLargestElement(int []arr){
            int n=arr.length;
            Arrays.sort(arr);
            return arr[n-2];
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
