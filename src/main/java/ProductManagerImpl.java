import java.util.List;
import java.util.Queue;

public class ProductManagerImpl implements ProductManager{

    List<Product> products;
    Queue<Product> orders;

    // ----------------------------------------------------------------------------------------------------

    // FUNCTIONS RELATED WITH PRODUCTS.

    // > Function 1.
    @Override
    public List<Product> productsByPrice() { return null; }

    // > Function 2.
    @Override
    public List<Product> productsBySales() { return null; }

    // > Function 3.
    @Override
    public void addProduct(String productId, String name, double price) {}

    // > Function 4.
    @Override
    public Product getProduct(String productId) { return null; }

    // > Function 5.
    @Override
    public int numProducts() { return 0; }

    // ----------------------------------------------------------------------------------------------------

    // FUNCTIONS RELATED WITH ORDERS.

    // > Function 6.
    @Override
    public void addOrder(Order order) {}

    // > Function 7.
    @Override
    public Order processOrder() {
        return null;
    }

    // > Function 8.
    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    // > Function 9.
    @Override
    public int numOrders() { return 0; }

    // > Function 10.
    @Override
    public int numSales(String b001) { return 0; }

    // ----------------------------------------------------------------------------------------------------

    // FUNCTIONS RELATED WITH USERS.

    // > Function 11. public void addUser(String s, String name, String surname);
    @Override
    public void addUser(String s, String name, String surname) {}

    // > Function 12. public int numUsers();
    @Override
    public int numUsers() {
        return 0;
    }

    // ----------------------------------------------------------------------------------------------------

}
