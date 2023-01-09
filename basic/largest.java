package basic;

public class largest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        // int large = a > b ? a : b;
        // large = c > large ? c : large;

        int large = c > (a > b ? a : b) ? c : (a > b ? a : b);
        System.out.println(large);
    }
}
