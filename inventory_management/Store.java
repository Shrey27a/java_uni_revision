package inventory_management;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products = new ArrayList<>();

    // Add new product
    public void addProduct(Product p) {
        products.add(p);
    }

    // Check stock by name
    public void checkStock(String name) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Stock for " + name + ": " + p.quantity);
                return;
            }
        }
        System.out.println(name + " not found in inventory.");
    }

    // Sell a product
    public void sellProduct(String name, int qty) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                if (p.quantity >= qty) {
                    p.quantity -= qty;
                    System.out.println(qty + " " + name + "(s) sold.");
                } else {
                    System.out.println("Insufficient stock for " + name);
                }
                return;
            }
        }
        System.out.println(name + " not found in inventory.");
    }

    // Display full inventory
    public void displayInventory() {
        System.out.println("\nInventory Status:");
        for (Product p : products) {
            System.out.println("Name: " + p.name + ", Price: " + p.price + ", Quantity: " + p.quantity);
        }
    }
}
