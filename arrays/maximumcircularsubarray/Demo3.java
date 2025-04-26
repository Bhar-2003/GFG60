package maximumcircularsubarray;

public class Demo3 {
    //  O(n) Time
    //  O(1) Space

    public static int circularSubarraySum(int []arr){
        int n=arr.length;
        int totalSum=0;
        int currMaxSum=0;
        int currMinSum=0;
        int maxSum=arr[0];
        int minSum=arr[0];
        for (int i=0;i<n;i++){
            currMaxSum=Math.max(currMaxSum+arr[i],arr[i]);
            maxSum=Math.max(maxSum,currMaxSum);

            currMinSum=Math.min(currMinSum+arr[i],arr[i]);
            minSum=Math.min(minSum,currMinSum);

            totalSum+=arr[i];
        }
        int normalSum=maxSum;
        int circularSum=totalSum-minSum;
        if (minSum==totalSum)
            return normalSum;
        return Math.max(normalSum,circularSum);
    }
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(circularSubarraySum(arr));
    }
}
