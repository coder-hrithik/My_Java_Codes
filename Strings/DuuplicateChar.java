package Strings;

public class DuuplicateChar {
    public static void main(String[] args) {
        String s = "ababcdde";

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length -1 ; i++) {
            int count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if(c[i] == c[j]){
                    count ++;
                }
            }

            if(count == 1){
                System.out.println(c[i]);
            }
        }
    }
}
