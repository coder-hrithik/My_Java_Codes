package Jsp;

public class LargestFromEachArray {
    public static void main(String[] args) {
        int[][] a = { { 120, 99, 300 }, { 2, 56, 600 }, { 550, 8, 9 } };
        for (int i = 0; i < a.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] > max){
                    max = a[i] [j];
                }
            }
            System.out.print(max);
            System.out.println();
        }
    }
}
