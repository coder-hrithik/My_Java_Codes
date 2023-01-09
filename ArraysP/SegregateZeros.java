package ArraysP;
/*Write a Java program to segregate all 0s on left side and
all 1s on right side of a given array of 0s and 1s. */

import java.util.Arrays;

public class SegregateZeros {
    public static void main(String[] args) {
        int n[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int sb = 0;

        for (int i = 0; i < n.length; i++) {
            if(n[i] == 1){
                sb++;
            } else if(sb > 0){
                int temp = n[i];
                n[i] = 1;
                n[i - sb] = temp;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
