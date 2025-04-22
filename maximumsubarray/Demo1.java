package maximumsubarray;

public class Demo1 {
    // O(n^2) Time
    // O(1) Space
    public static int maxSubarraySum(int[] arr){
        int result=arr[0];
        for(int i=0;i<arr.length;i++){
            int currSum=0;
            for (int j=i;j<arr.length;j++){
                currSum+=arr[j];
                result=Math.max(result,currSum);
            }
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
