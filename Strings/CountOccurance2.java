package Strings;

public class CountOccurance2 {
    public static void main(String[] args) {
        String s = "Maharashtra";
        s.toLowerCase();
        char[] c = s.toCharArray();
        boolean[] b = new boolean[c.length];

        for (int i = 0; i < c.length; i++) {
            if (b[i] == false) {
                int count = 1;
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                        b[j] = true;
                    }

                }
                System.out.println(c[i] + " " + count);
            }
        }
    }
}
// wap to find all the dublicate charaters int he string