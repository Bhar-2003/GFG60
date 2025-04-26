package reverseanarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo5 {
    // Time Complexity: O(n)
    // Auxiliary Space: O(1)
    public static void reverseAnArray(List<Integer> arr){
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,4,3,2,6,5));
        for (int i=0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        reverseAnArray(arr);
        for (int i=0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
