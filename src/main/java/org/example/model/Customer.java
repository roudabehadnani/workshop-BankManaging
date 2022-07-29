package org.example.model;

public class Customer {

    private static int customerIdSequencer = 1000;

    private int id;
    private String firstname;
    private String lastname;
    private String email;


    public Customer(String firstname, String lastname, String email) {
        this.id = ++customerIdSequencer;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public static int getCustomerIdSequencer() {
        return customerIdSequencer;
    }

    public int getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
