package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount("Dev Parmar", 1000, 100);
        System.out.println("Account number: " + account1.generateAccountNumber(6, 24));
        account1.deposit(500);
        try {
            account1.withdraw(800);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current balance: " + account1.getBalance());

        CurrentAccount account2 = new CurrentAccount("Ankit", 6000, "ABC123");
        System.out.println("Account number: " + account2.generateAccountNumber(6, 27));
        account2.deposit(2000);
        try {
            account2.withdraw(7000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current balance: " + account2.getBalance());

        SavingsAccount account3 = new SavingsAccount("Bob", 5000, 5, 1000);
        System.out.println("Account number: " + account3.generateAccountNumber(6, 30));
        account3.deposit(1000);
        try {
            account3.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current balance: " + account3.getBalance());
        System.out.println("Simple interest after 2 years: " + account3.getSimpleInterest(2));
        System.out.println("Compound interest after 2 years: " + account3.getCompoundInterest(12, 2));

        StudentAccount account4 = new StudentAccount("Akhil", 200, "XYZ University");
        System.out.println("Account number: " + account4.generateAccountNumber(6, 12));
        account4.deposit(50);
        try {
            account4.withdraw(300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Current balance: " + account4.getBalance());
        System.out.println("Institution name: " + account4.getInstitutionName());
    }


}