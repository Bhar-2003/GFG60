package maximumproductsubarray;

public class Demo2 {
    // O(n) Time
    // O(1) Space
    public static int maxProduct(int []arr){
        int n=arr.length;
        int currMax=arr[0];
        int currMin=arr[0];
        int currProd=arr[0];
        for (int i=1;i<n;i++){
            int temp=Math.max(arr[i],Math.max(arr[i]*currMax,arr[i]*currMin));
            currMin=Math.min(arr[i],Math.min(arr[i]*currMax,arr[i]*currMin));
            currMax=temp;
            currProd=Math.max(currProd,currMax);
        }
        return currProd;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(maxProduct(arr));
    }
}
