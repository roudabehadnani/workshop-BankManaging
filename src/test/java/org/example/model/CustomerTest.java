package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    public void test_customer() {


        Customer customer1 =
                new Customer("Rodi", "Ad", "rodi@mail.com");

        System.out.println(customer1);

        assertEquals(customer1.getFirstname(),"Rodi");
        assertEquals(customer1.getLastname(), "Ad");
        assertEquals(customer1.getEmail(), "rodi@mail.com");
        assertEquals(customer1.getId(),Customer.getCustomerIdSequencer());


    }
}