package model;

public class Customer implements Comparable<Customer> {
    private String name;
    private String sirName;
    private int age;
    public Customer(String name, String sirName, int age) {
        this.name = name;
        this.sirName = sirName;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSirName() {
        return sirName;
    }
    public void setSirName(String sirName) {
        this.sirName = sirName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Customer otherCustomer) {
        int result = 0;
        // compares sirnames
        // if they are the same age is compared
        if(sirName.compareTo(otherCustomer.sirName) == 0) {
            if(name.compareTo(otherCustomer.name) == 0) {
                // if sirname, name and age is the same it is the same person
                if(age == otherCustomer.age) {
                    result = 0;
                }
                else if (age < otherCustomer.age) {
                    result = -1;
                }
                else {
                    result = 1;
                }
            }
            else if(name.compareTo(otherCustomer.name) < 0) {
                result = -1;
            }
            else {
                result = 1;
            }
        }
        else if(sirName.compareTo(otherCustomer.sirName) < 0) {
            result = -1;
        }
        else {
            result = 1;
        }
        return result;
    }
}