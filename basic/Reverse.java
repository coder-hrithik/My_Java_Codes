package basic;

public class Reverse {
    public static void main(String[] args) {
        int num = 1234;
        int ans = 0;

        // while (num != 0) {
        //     ans = ans * 10 + num % 10;
        //     num /= 10;
        // }

        StringBuilder str = new StringBuilder(String.valueOf(num));
        ans = Integer.parseInt(str.reverse().toString());
        System.out.println(str);
        System.out.println(ans);
    }

}
