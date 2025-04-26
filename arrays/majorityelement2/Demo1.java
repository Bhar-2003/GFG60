package arrays.majorityelement2;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    // O(n^2) Time
    // O(1) Space
    public static List<Integer> findMajority(int []arr){
        int n=arr.length;
        List<Integer> res=new ArrayList<>();
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=i;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>(n/3)){
                if(res.size()==0 || arr[i]!=res.get(0)){
                    res.add(arr[i]);
                }
            }
            if(res.size()==2){
                if(res.get(0)>res.get(1)){
                    java.util.Collections.swap(res,0,1);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        for (int ar: arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        List<Integer> res = findMajority(arr);
        for (int ele : res)
            System.out.print(ele + " ");
    }
}
