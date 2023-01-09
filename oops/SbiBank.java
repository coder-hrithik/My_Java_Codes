package oops;

import java.util.Scanner;

class SbiBank {

    static float balance = 10000;

    public static void main(String[] args) {
        int pin = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin");
        int q = sc.nextInt();

        if (q == pin) {
            int x = 1;
            while (x == 1) {
                System.out.println("\n \t1.Withdraw \n\t2.Deposit\n\t3.Check Balance\n\t4.Exit");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter Amount");
                        float w = sc.nextFloat();
                        if (w < balance && w > 0) {
                            balance = balance - w;
                            System.out.println("Balance: " + balance);
                        } else {
                            System.out.println("Insufficent Balance");
                        }
                        break;

                    case 2:
                        System.out.println("Enter Amount");
                        float d = sc.nextFloat();
                        if (d > 0)
                            balance += d;
                        else
                            System.out.println("Enter valid amount");

                    case 3:
                        System.out.println("Balance: " + balance);
                        break;

                    case 4:
                        System.out.println("Thank You !");
                        x = 0;
                }
            }
        } else {
            System.out.println("Wrong Pin");
        }
        sc.close();
    }
}
