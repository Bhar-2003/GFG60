package stockbuyandsell_withnolimits;

public class Demo3 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static int maximumProfit(int []arr){
        int result=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                result+=(arr[i]-arr[i-1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        for (int arr:prices)
            System.out.print(arr+" ");
        System.out.println();
        System.out.println(maximumProfit(prices));
    }
}
