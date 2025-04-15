package Moveallzerostoendofarray;

public class Demo3 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static void pushArrayToLast(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
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
