package reverseanarray;

public class Demo4 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(n)
    public static void reverseAnArray(int arr[],int left,int right){
        if(left>=right)
            return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseAnArray(arr,left+1,right-1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        int n=arr.length;
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        reverseAnArray(arr,0,n-1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
