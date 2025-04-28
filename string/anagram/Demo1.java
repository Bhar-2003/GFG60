package string.anagram;

public class Demo1 {
    // Time Complexity: O(m + n)
    // Auxiliary Space: O(MAX_CHAR) = O(26) = O(1)
    static final int MAX_CHAR=26;
    public static boolean areAnagrams(String s1,String s2){

        int []freq=new int[MAX_CHAR];
        for (int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for (int j=0;j<s2.length();j++){
            freq[s2.charAt(j)-'a']--;
        }
        for (int count:freq){
            if(count!=0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        System.out.println(areAnagrams(s1, s2));
    }
}
