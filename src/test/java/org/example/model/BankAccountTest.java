package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void test_bankAccount(){

        BankAccount bankAccount1 =
                new BankAccount(100_000, new Customer(
                        "Rodi",
                        "Ad",
                        "rodi@mail.com"));

        System.out.println(bankAccount1);

        assertEquals(bankAccount1.getId(),BankAccount.getBankAccountIdSequencer());
        assertEquals(bankAccount1.deposit(20),100_020);
        assertEquals(bankAccount1.withdraw(10_000), 90_020);


    }

}