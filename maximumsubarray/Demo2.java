package maximumsubarray;

public class Demo2 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static int maxSubarraySum(int [] arr){
        int result=arr[0];
        int maxSubArr=arr[0];
        for (int i=1;i<arr.length;i++){
            maxSubArr=Math.max(maxSubArr+arr[i],arr[i]);
            result=Math.max(result,maxSubArr);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(maxSubarraySum(arr));
    }
}
