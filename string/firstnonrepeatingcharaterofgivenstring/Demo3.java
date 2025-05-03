package string.firstnonrepeatingcharaterofgivenstring;

import java.util.Arrays;

public class Demo3 {
    // O(n) Time
    // O(MAX_CHAR ) Space
    public static final int MAX_CHAR=26;
    public static char nonRep(String s){
        int vis[]=new int[MAX_CHAR];
        Arrays.fill(vis,-1);
        for (int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(vis[index]==-1){
                vis[index]=1;
            }
            else {
                vis[index]=-2;
            }
        }
        int idx=-1;
        for (int i=0;i<s.length();i++){
            if(vis[i]>=0 && (idx==-1 || vis[idx]>vis[i]))
                idx=i;
        }
        return (idx==-1)?'$':s.charAt(vis[idx]);
    }
    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println(s);
        System.out.println(nonRep(s));
    }
}
