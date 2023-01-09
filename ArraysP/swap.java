package ArraysP;
import java.util.*;

public class swap {
    public static void main(String[] args) {
        int [] a = {1, 10, 25, 35, 55};
        swapd(a, 0, 4);
        System.out.println(Arrays.toString(a));
    }
    static void swapd(int[] a, int s1, int s2){
        int temp = a[s1];
        a[s1] = a[s2];
        a[s2] = temp;
    }
}
