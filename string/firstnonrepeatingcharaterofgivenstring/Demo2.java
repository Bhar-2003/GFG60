package string.firstnonrepeatingcharaterofgivenstring;

public class Demo2 {
    // O(2*n) Time
    // O(MAX_CHAR ) Space
    public static final int MAX_CHAR=26;
    public static char nonRep(String s){
        int freq[]=new int[MAX_CHAR];
        for (int ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for (int c:s.toCharArray()){
            if(freq[c-'a']==1)
                return (char) c;
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(s);
        System.out.println(nonRep(s));
    }
}
