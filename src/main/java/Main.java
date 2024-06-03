public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jasper", "Lemon", new VisaCard(100));
        customer.printName();
        customer.getCreditCard().pay(10);


        Customer customer2 = new Customer("Nikola", "Tesla", new MasterCard(200));
        customer2.printName();

        customer2.getCreditCard().pay(10);
        System.out.println(customer2.getCreditCard().getDebt());
    }
}
