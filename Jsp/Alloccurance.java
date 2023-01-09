package Jsp;

// All ocurrance of the given number
// WAP to find all the pairs of a number who's sum is eqaul to a given number
public class Alloccurance {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int ans = 5;

        for (int i = 0; i < a.length; i++) {
            for (int j = i +1; j < a.length; j++) {
                if (a[i] + a[j] == ans) {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
