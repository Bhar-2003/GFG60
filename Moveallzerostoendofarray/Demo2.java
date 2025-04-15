package Moveallzerostoendofarray;

public class Demo2 {
    public static void pushArrayToLast(int []arr){
        // Time Complexity: O(n)
        // Auxiliary Space: O(1)
        int n= arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while (count<n){
            arr[count]=0;
            count++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        for (int ar:arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        pushArrayToLast(arr);
        for (int ar:arr){
            System.out.print(ar+" ");
        }
    }
}
