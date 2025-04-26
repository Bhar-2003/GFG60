package minimizeheight;

import java.util.Arrays;

public class Demo1 {
    // Time Complexity: O(nlogn)
    // Auxiliary Space: O(1)
    public static int getMinDiff(int []arr,int k){
        int n=arr.length;
        Arrays.sort(arr);
        int result=arr[n-1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0)
                continue;
            int minHeight=Math.min(arr[0]+k,arr[i]-k);
            int maxHeight=Math.max(arr[i-1]+k,arr[n-1]-k);
            result=Math.min(result,maxHeight-minHeight);
        }
        return result;
    }
    public static void main(String[] args) {
        int k = 6;
        int[] arr = {12, 6, 4, 15, 17, 10};

        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}
