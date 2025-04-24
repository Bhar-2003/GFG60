package maximumcircularsubarray;

public class Demo1 {
    // O(n^2) Time
    // O(1) Space
    public static int circularSubarraySum(int []arr){
        int n=arr.length;
        int result=arr[0];
        for (int i=0;i<n;i++){
            int currSum=0;
            for (int j=0;j<n;j++){
                int idx=(i+j)%n;
                currSum+=arr[idx];
                result=Math.max(result,currSum);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(circularSubarraySum(arr));
    }
}
