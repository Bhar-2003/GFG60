package arrays.majorityelement2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {
    // O(n) Time
    // O(n) Space
    public static List<Integer> findMajority(int []arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for (Map.Entry<Integer,Integer> it:map.entrySet()){
            int element=it.getKey();
            int count =it.getValue();
            if(count>n/3){
                list.add(element);
            }
            if (list.size()==2 && list.get(0)>list.get(1)){
                int temp=list.get(0);
                list.set(0,list.get(1));
                list.set(1,temp);
            }
        }
        return list;
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
