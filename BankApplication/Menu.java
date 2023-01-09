package BankApplication;

import java.util.Scanner;

public class Menu extends Accounts {

    Menu(String name, double balance, String email) {
        super(name, balance, email);
    }

    @Override
    public void menu() {
        System.out.println();
        System.out.println("\t Welcome " + getName());
        
        Scanner sc = new Scanner(System.in);
        int option = -1;
        int y = 0;
        do {
            System.out.println(
                "Choose any one option to perform: \n\t 1.Deposite \n\t 2.Withdraw \n\t 3.Check Balance \n\t 4.Previous Transactions \n\t 5.Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount to be deposited.");
                    double amountD = sc.nextDouble();
                    Deposite(amountD);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn.");
                    double amountW = sc.nextDouble();
                    Withdraw(amountW);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + getBalance());
                    break;
                case 4:
                    System.out.println("Your previous Transactions are: ");
                    for (String x : trans) {
                        System.out.println(x);
                    }

                    break;
                case 5:
                    System.out.println("\t Thankyou for the transaction..");
                    y = 1;
                    break;
                default:
                    System.out.println("\t Incorrect option!");
            }

        } while (y == 0);
        sc.close();
    }

}
