
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public void display() {
        System.out.println(name + "\t" + price + "\t" + quantity + "\t" + getTotal());
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            products[i] = new Product(name, price, qty);
            grandTotal += products[i].getTotal();
        }

        System.out.println("\n===== GROCERY BILL RECEIPT =====");
        System.out.println("Item\tPrice\tQty\tTotal");

        for (Product p : products) {
            p.display();
        }

        System.out.println("--------------------------------");
        System.out.println("Grand Total = Rs. " + grandTotal);
        System.out.println("Thank You for Shopping!");

        sc.close();
    }
}