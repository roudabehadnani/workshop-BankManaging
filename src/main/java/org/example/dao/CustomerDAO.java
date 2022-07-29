package org.example.dao;

import org.example.model.Customer;

import java.util.ArrayList;

public class CustomerDAO {


    private ArrayList<Customer> customers = new ArrayList<>();



    public void addCustomer(Customer customer){

            if (findCustomerByEmail(customer.getEmail()) == null){
                customers.add(customer);
                System.out.println(customers);
            }else {
                System.out.println("Customer by email " +
                        customer.getEmail() + " have already been used, enter another email!");
            }

    }


    public Customer findCustomerByEmail(String email){
        for (Customer c: customers) {
            if (c.getEmail().equals(email)){
                return c;
            }
        }
        return null;
    }


    public Customer findByCustomerId(int id){
        for (Customer c: customers) {
            if (c.getId() == id){
                return c;
            }

        }
        return null;

    }


    public boolean removeCustomer(Customer customer){
        return customers.remove(customer);
    }


    @Override
    public String toString() {
        return "CustomerDAO{" +
                "customers=" + customers +
                '}';
    }
}
