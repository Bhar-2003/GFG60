package arrays.smallestmissingpositive;

import java.util.Arrays;

public class Demo1 {
    // O(n*log n) Time
    //  O(n) Space
    public static int missingNumber(int []arr){
        Arrays.sort(arr);
        int result=1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==result)
                result++;
            else if (arr[i]>result) {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(missingNumber(arr));
    }
}
