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
        System.out.println(lastCustomer(customers).getName());
    }
    public static Customer lastCustomer(ArrayList<Customer> customers) {
        Customer lastCustomer;
        Collections.sort(customers);
        lastCustomer = customers.getLast();
        return lastCustomer;
    }
}