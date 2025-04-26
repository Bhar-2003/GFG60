package stockbuyandsell_withnolimits;

public class Demo1 {
    // Exponential Time
    static int maximumProfit(int []arr,int start,int end){
        int result=0;
        for (int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if (arr[j]>arr[i]){
                    int curr=(arr[j]-arr[i])+
                            maximumProfit(arr,start,i-1)+
                            maximumProfit(arr,j+1,end);
                    result=Math.max(result,curr);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        for (int arr:prices)
            System.out.print(arr+" ");
        System.out.println();
        int n=prices.length;
        System.out.println(maximumProfit(prices,0,n-1));
    }
}
