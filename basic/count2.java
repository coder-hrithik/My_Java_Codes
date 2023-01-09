package basic;

import java.util.Scanner;

public class count2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inp = in.nextInt();

        int even_count = 0;
        int odd_count = 0;

        while(inp > 0){
            int rem = inp % 10;

            if (rem % 2 == 0)
            even_count ++;
            else
            odd_count ++;

            inp = inp /10;
        }
        System.out.println(even_count+" even digits");
        System.out.println(odd_count+" odd digits");
        in.close();
    }
}
