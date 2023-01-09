package HackerRank;

import java.util.Arrays;

public class WeightedUniformStrings {
    public static void main(String[] args) {
        String s = "abccddde";

        int[] a = new int[s.length()];
        char c = 0;
        for(int i = 0 ; i < s.length(); i++){
            a[i] = s.charAt(i) - 96;
            if(s.charAt(i) == c){
                a[i] += a[i - 1]; 
            }
            c = s.charAt(i);
        }
        System.out.println(Arrays.toString(a));
    }
}
