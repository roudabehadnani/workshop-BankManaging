package org.example;

import org.example.dao.BankAccountDAO;
import org.example.dao.CustomerDAO;
import org.example.model.BankAccount;
import org.example.model.Customer;



public class Main {
    public static void main(String[] args) {

        Customer customer1 =
                new Customer("Rodi", "Ad", "rodi@mail.com");

        Customer customer2 =
                new Customer( "Sara", "Challis", "sara@mail.com");

        Customer customer3 =
                new Customer( "Sandra", "Bali", "sara@mail.com");


        BankAccount bankAccount1 =
                new BankAccount(100_000, customer1);

        BankAccount bankAccount2 =
                new BankAccount(50_000, customer2);


//        System.out.println(customer2);
//        System.out.println(bankAccount2);


//        System.out.println(bankAccount1.deposit(100));
//        System.out.println(bankAccount1.deposit(200));
//        System.out.println(bankAccount1.withdraw(5000));
//

        CustomerDAO customerDAO = new CustomerDAO();

        customerDAO.addCustomer(customer1);
        customerDAO.addCustomer(customer2);
        customerDAO.addCustomer(customer3);
        System.out.println(customerDAO.findCustomerByEmail("rodi@mail.com"));
        System.out.println(customerDAO.findByCustomerId(1002));
        System.out.println(customerDAO.removeCustomer(customer1));



        BankAccountDAO bankAccountDAO = new BankAccountDAO();

        bankAccountDAO.addBankAccount(bankAccount1);
        bankAccountDAO.addBankAccount(bankAccount2);
        System.out.println(bankAccountDAO);
        System.out.println(bankAccountDAO.findById(21));
        System.out.println(bankAccountDAO.removeBankAccount(bankAccount1));

    }
}