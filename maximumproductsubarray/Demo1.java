package maximumproductsubarray;

public class Demo1 {
    // Time Complexity: O(n^2)
    // Auxiliary Space: O(1)
    public static int maxProduct(int []arr){
        int n=arr.length;
        int result=arr[0];
        for (int i=0;i<n;i++){
            int mul=1;
            for (int j=i;j<n;j++){
                mul*=arr[j];
                result=Math.max(result,mul);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(maxProduct(arr));
    }
}
