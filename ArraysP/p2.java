package ArraysP;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        char[] c = new char[5];

        for (int i = 0; i < c.length; i++) {
            c[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(c));
        char find = sc.next().charAt(0);
        int count=0;
        for (int i = 0; i < c.length; i++) {
            if(find == c[i]){
                count++;
            }
        }
        if(count>0){
            System.out.println("present " + count + " times");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }    
}
