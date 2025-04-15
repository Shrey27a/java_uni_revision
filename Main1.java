import inventory_management.Product;
import inventory_management.Store;

public class Main1 {
    public static void main(String[] args) {
        Store store = new Store();

        // Adding products
        store.addProduct(new Product("Pen", 10.0, 100));
        store.addProduct(new Product("Notebook", 50.0, 50));
        store.addProduct(new Product("Pencil", 5.0, 200));

        // Display inventory
        store.displayInventory();

        // Check stock
        store.checkStock("Pen");

        // Sell a product
        store.sellProduct("Pen", 10);

        // Check again after selling
        store.checkStock("Pen");

        // Final inventory display
        store.displayInventory();
    }
}
