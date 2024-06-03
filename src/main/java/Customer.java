public class Customer {
    String name;
    String lastName;
    int customerNumber;
    CreditCard creditCard;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Customer (String name, String lastName, int customerNumber) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    public Customer (String name, String lastName, CreditCard debt) {
        this.name = name;
        this.lastName = lastName;
        this.creditCard = debt;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }
}
