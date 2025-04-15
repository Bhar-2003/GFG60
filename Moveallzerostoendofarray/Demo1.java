package Moveallzerostoendofarray;

public class Demo1 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(n)
    static void pushArrayToLast(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        int track=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[track]=arr[i];
                track++;
            }
        }
        while(track<n){
            temp[track]=0;
            track++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
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
