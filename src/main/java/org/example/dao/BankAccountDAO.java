package org.example.dao;

import org.example.model.BankAccount;

import java.util.ArrayList;

public class BankAccountDAO {

    ArrayList<BankAccount> bankAccounts = new ArrayList<>();


    public void addBankAccount(BankAccount account){
        bankAccounts.add(account);

    }

    public BankAccount findById(int id){
        for (BankAccount b: bankAccounts) {
            if (b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public boolean removeBankAccount(BankAccount account){
        return bankAccounts.remove(account);
    }

    @Override
    public String toString() {
        return "BankAccountDAO{" +
                "bankAccounts=" + bankAccounts +
                '}';
    }
}
