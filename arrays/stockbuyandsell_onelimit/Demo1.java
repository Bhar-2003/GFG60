package arrays.stockbuyandsell_onelimit;

public class Demo1 {
    // O(n^2) Time
    // O(1) Space
    public static int maxProfit(int []arr){
        int n=arr.length;
        int result=0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                result=Math.max(result,arr[j]-arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        for (int i:prices)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(maxProfit(prices));
    }
}
