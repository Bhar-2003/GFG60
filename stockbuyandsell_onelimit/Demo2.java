package stockbuyandsell_onelimit;

public class Demo2 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static int maxProfit(int []arr){
        int result=0;
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            result=Math.max(result,arr[i]-min);
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
