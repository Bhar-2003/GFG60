package stockbuyandsell_withnolimits;


public class Demo2 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static int maximumProfit(int []arr) {
        int n = arr.length;
        int result = 0;
        int local_max ;
        int local_min ;
        int i = 0;
        while (i < n - 1) {
            while (i<n-1 && arr[i] >= arr[i + 1]) {
                i++;
            }
            local_min = arr[i];
            while (i<n-1 && arr[i] <= arr[i + 1]) {
                    i++;
            }
            local_max = arr[i];
            result += local_max - local_min;
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
