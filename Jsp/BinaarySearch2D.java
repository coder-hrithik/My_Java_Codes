package Jsp;

import java.util.Arrays;

public class BinaarySearch2D {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 4, 5, 7 } };

        int target = 6;
        // System.out.println(arr.length);
        int[] n = new int[arr.length-1];
        for (int row = 0; row < arr.length; row++) {
            for (int i = 0; i < arr[row].length; i++) {
                n = arr[i];
                
                int start = 0;
                int end = n.length-1;

                while(start < end){
                    int mid = start + (end - start) / 2;
                    if(target == mid){
                        
                    }
                }
            }
        }
        System.out.println(Arrays.toString(n));

    }
}
