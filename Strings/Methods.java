package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String n = "Hrithik";
        System.out.println(Arrays.toString(n.toCharArray()));
        System.out.println(n.length());
        System.out.println(n.toLowerCase());
        System.out.println(n.indexOf('h'));
        System.out.println("   Hrithik   ".strip());
    }
}
