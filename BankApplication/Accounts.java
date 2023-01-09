package BankApplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts {
    private String name;
    private double balance;
    private String email;

    List<String> trans = new ArrayList<>();

    Accounts(String name, double balance, String email) {
        this.name = name;
        this.balance = balance;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public abstract void menu();

    protected void Deposite(double money) {
        balance += money;
        pTransaction(money);
    }

    protected void Withdraw(double money) {
        if (balance - money < 0) {
            System.out.println("Sorry insufficient balance");
        } else {
            balance -= money;
            pTransaction(-money);
        }
    }

    protected void pTransaction(double money) {
        if (money > 0) {
            String d = "Deposition of " + money;
            trans.add(d);
        } else if (money < 0) {
            String w = "Withdrawl of " + money;
            trans.add(w);
        }
    }

}
