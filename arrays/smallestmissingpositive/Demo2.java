package arrays.smallestmissingpositive;

public class Demo2 {
    // O(n) Time
    // O(n) Space
    public static int missingNumber(int []arr){
        int n=arr.length;
        boolean visit[]=new boolean[n];
        for (int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<n)
                visit[arr[i]-1]=true;
        }
        for (int i=1;i<=n;i++){
            if(!visit[i-1])
                return i;
        }
        return n+1;
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        for (int ar:arr)
            System.out.print(ar+" ");
        System.out.println();
        System.out.println(missingNumber(arr));
    }
}
