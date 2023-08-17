import java.util.ArrayList;
public class CafeTester {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("cappuccino", 3.50);
        // Order variables 
        Order order1 = new Order();
        Order order2  = new Order("Cindhuri");
        Order order3  = new Order("Jhon");

         // Add items to orders
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item1);
        order2.addItem(item2);
        order3.addItem(item1);
        order3.addItem(item2);

        order2.setReady(true);
        order3.setReady(true);

        // Application Simulations  
        // Use this example code to test various orders' updates
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        System.out.println("Order 3 Total: $" + order3.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
    }
    }

