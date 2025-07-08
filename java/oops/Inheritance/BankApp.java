package Inheritance;

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showBasicInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        showBasicInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        showBasicInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int durationInMonths;

    public FixedDepositAccount(String accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        showBasicInfo();
        System.out.println("Duration: " + durationInMonths + " months");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Savings Account
        System.out.println("Enter details for Savings Account:");
        System.out.print("Account Number: ");
        String saNumber = sc.nextLine();
        System.out.print("Balance: ");
        double saBalance = sc.nextDouble();
        System.out.print("Interest Rate (%): ");
        double saInterest = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.println("\nEnter details for Checking Account:");
        System.out.print("Account Number: ");
        String caNumber = sc.nextLine();
        System.out.print("Balance: ");
        double caBalance = sc.nextDouble();
        System.out.print("Withdrawal Limit: ");
        double caLimit = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.println("\nEnter details for Fixed Deposit Account:");
        System.out.print("Account Number: ");
        String fdaNumber = sc.nextLine();
        System.out.print("Balance: ");
        double fdaBalance = sc.nextDouble();
        System.out.print("Duration (months): ");
        int fdaDuration = sc.nextInt();

        SavingsAccount sa = new SavingsAccount(saNumber, saBalance, saInterest);
        CheckingAccount ca = new CheckingAccount(caNumber, caBalance, caLimit);
        FixedDepositAccount fda = new FixedDepositAccount(fdaNumber, fdaBalance, fdaDuration);

        System.out.println("\n Account Details \n");
        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fda.displayAccountType();

        sc.close();
    }
}
