package Strings;

import java.util.Arrays;

public class DupInString {
    public static void main(String[] args) {
        String s = "java is a programming language it is used for programming";

        String[] c = s.split(" ");
        boolean[] b = new boolean[c.length];
        int countOfDup = 0;

        System.out.println(Arrays.toString(c));

        for (int i = 0; i < c.length; i++) {
            if (b[i] == false) {
                int count = 1;
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i].equals(c[j])) {
                        count ++;
                        b[j] = true;
                    }
                }
                if(count > 1){
                    System.out.println(c[i]);
                    countOfDup ++;
                }
            }
        }
        System.out.println("Total duplicate words: " + countOfDup);
    }
}
