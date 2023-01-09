package RecursionP;

public class PowerRecursive {
    public static int power(int x, int y) {
        if(y != 0) {
            return (x * power(x, y - 1));
        } else 
            return 1;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 2;

        System.out.println(power(x, y));
    }
}
