package basic;

import java.time.LocalDate;
import java.util.Scanner;

public class DisplayDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int a = sc.nextInt();
        System.out.print("Enter day: ");
        int b = sc.nextInt();
        System.out.print("Enter year: ");
        int c = sc.nextInt();
        sc.close();
        
        System.out.println("Day on "+b+"/"+a+"/"+c+" is: " + findDay(a, b, c));
        
    }

    public static String findDay(int month, int day, int year) {
        LocalDate l = LocalDate.of(year, month, day);
        return l.getDayOfWeek().name();
    }
}
