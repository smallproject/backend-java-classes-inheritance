public class Customer {
    String name;
    String lastName;
    int customerNumber;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Customer (String name, String lastName, int customerNumber) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }
}
