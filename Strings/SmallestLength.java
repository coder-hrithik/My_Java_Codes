package Strings;

import java.util.Arrays;

public class SmallestLength {
    public static void main(String[] args) {
        String[] s = { "goa", "maharashtra", "maldives" };

        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].length() > s[j].length()) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
        System.out.println("Smallest string is: " + s[0]);
    }

}
// wap to find all the duplicate words present int he string 
// along with total dublicates in the string