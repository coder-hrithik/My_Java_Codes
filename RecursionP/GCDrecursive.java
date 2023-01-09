package RecursionP;

public class GCDrecursive {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        int g = FindGcd(a, b);
        System.out.println(g);
    }

    private static int FindGcd(int a, int b) {
        if (a % b == 0)
            return b;
        else 
            return FindGcd(b, b % a); 
    }
}
