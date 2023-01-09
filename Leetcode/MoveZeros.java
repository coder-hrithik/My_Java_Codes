package Leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] a = {0,0,1,0,3,0,5,0,6};

        int sb = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                sb++;
            }
            else if (sb > 0){
                int temp = a[i];
                a[i] = 0;
                a[i - sb] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
