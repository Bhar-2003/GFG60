package majorityelement2;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    // O(n) Time
    // O(n) Space
    public static List<Integer> findMajority(int []arr){
        int n=arr.length;
        int ele1=-1,ele2=-1;
        int ctn1=0,ctn2=0;

        for(int ele:arr) {
            if (ele == ele1) {
                ctn1++;
            } else if (ele == ele2) {
                ctn2++;
            } else if (ctn1 == 0) {
                ele1 = ele;
                ctn1++;
            } else if (ctn2 == 0) {
                ele2 = ele;
                ctn2++;
            } else {
                ctn1--;
                ctn2--;
            }
        }
            List<Integer> list=new ArrayList<>();
            ctn1=0;
            ctn2=0;
            for (int ele:arr){
                if(ele==ele1) ctn1++;
                if (ele==ele2) ctn2++;
            }
            if(ctn1>n/3) list.add(ele1);
            if (ctn2>n/3 && ele2!=ele1) list.add(ele2);

            if(list.size()==2 && list.get(0)>list.get(1)){
                int temp= list.get(0);
                list.set(0,list.get(1));
                list.set(1,temp);
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
