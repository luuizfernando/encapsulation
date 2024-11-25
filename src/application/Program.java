package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHold = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char confirmation = sc.next().charAt(0);

        if (confirmation == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNum, accountHold, initialDeposit);
        } else {
            account = new Account(accountNum, accountHold);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();

        account.increaseBalance(value);

        System.out.println("Updated data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.decreaseBalance(value);

        System.out.println("Updated data: ");
        System.out.println(account);

        sc.close();
    }
}
