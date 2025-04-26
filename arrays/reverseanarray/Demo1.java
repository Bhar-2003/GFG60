package reverseanarray;

public class Demo1 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(n)
    static void reverseAnArray(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[n-1-i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        reverseAnArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
