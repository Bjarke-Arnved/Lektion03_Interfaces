package App;
import model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collections.*;
import java.util.List;
import static java.util.Collections.sort;

public class App {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>(Arrays.asList(
                new Customer("Hans", "Smit", 30),
                new Customer("Jalte", "Thybo", 27),
                new Customer("Naja", "Dalbo", 24),
                new Customer("Marie", "Harlev", 52),
                new Customer("Nadia", "Erlev", 40),
                new Customer("Krids", "Mougensen", 12),
                new Customer("Povel", "Rygesen", 55)
        ));
        // Printing all customers when sorted
        ArrayList<Customer> sortedCustomers = new ArrayList<Customer>(customers);
        Collections.sort(sortedCustomers);
        for (Customer customer : sortedCustomers) {
            System.out.println(customer.toString());
        }
        System.out.println("__________________________________________________________________________________________");

        // Printing last customer
        System.out.println(lastCustomer(customers).getName());
        System.out.println("__________________________________________________________________________________________");

        // Printing all customers after given customer
        for (Customer customer : afterCustomer(sortedCustomers, sortedCustomers.get(3))) {
            System.out.println(customer.toString());
        }
    }
    public static Customer lastCustomer(ArrayList<Customer> customers) {
        Customer lastCustomer;
        Collections.sort(customers);
        lastCustomer = customers.getLast();
        return lastCustomer;
    }
    public static ArrayList<Customer> afterCustomer(ArrayList<Customer> customers, Customer customer) {
        ArrayList<Customer> customersAfter = new ArrayList<Customer>();
        boolean found = false;
        for(Customer cust : customers) {
            if(cust.equals(customer)) found = true;
            if(found) {
                customersAfter.add(cust);
            }
        }
        return customersAfter;
    }
}
