public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jasper", "Lemon", new CreditCard(100));
        customer.printName();


        Customer customer2 = new Customer("Nikola", "Tesla", new CreditCard(200));
        customer2.printName();

        customer2.getCreditCard().pay(10);
        System.out.println(customer2.getCreditCard().getDebt());
    }
}
