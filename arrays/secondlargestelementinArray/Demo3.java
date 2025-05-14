package arrays.secondlargestelementinArray;

public class Demo3 {
    // Time Complexity: O(n)
    // Auxiliary space: O(1)
    static int getLargestElement(int[]arr){
        int n=arr.length;
        int largest=arr[0];
        int second_largest=-1;
        for (int i=1;i<n;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
}
