package org.example.model;

public class BankAccount {

    private static int bankAccountIdSequencer = 20;

    private int id;
    private double balance;
    private Customer customer;

    public BankAccount(double balance, Customer customer) {
        this.id = ++bankAccountIdSequencer;
        this.balance = balance;
        this.customer = customer;
    }

    public static int getBankAccountIdSequencer() {
        return bankAccountIdSequencer;
    }

    public double deposit(double money){

        if (money > 0){
            balance = balance + money;
            return balance;
        }
        throw new IllegalArgumentException("Invalid deposit");
    }


    public double withdraw(double money){

        if (money > 0 && money < balance){
            balance = balance - money;
            return balance;
        }
        throw new IllegalArgumentException("Invalid withdraw");
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
