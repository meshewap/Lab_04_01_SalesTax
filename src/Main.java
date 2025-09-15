public class Main {
    public static void main(String[] args) {
        // Hard coded purchase price
        double purchasePrice = 200.00;
        double salesTaxRate = 0.05;

        // Calculate sales tax
        double salesTax = purchasePrice * salesTaxRate;
        double totalPrice = purchasePrice + salesTax;

        // Output
        System.out.println("The purchase price is: $" + purchasePrice);
        System.out.println("The sales tax (5%) is: $" + salesTax);
        System.out.println("The total price is: $" + totalPrice);
    }
}