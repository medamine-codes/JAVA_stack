import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.99 ;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.99;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.49;
        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 5.49;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.intializeOrder("Cindhuri");
        Order order2  = new Order();
        order2.intializeOrder("Jimmy");
        Order order3  = new Order();
        order3.intializeOrder("Noah");
        Order order4  = new Order();
        order4.intializeOrder("Sam");
         // Add items to orders
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);
        order1.markReady();
        order3.markReady();
        // Application Simulations  
        // Use this example code to test various orders' updates
        System.out.println("Name:"+ order4.name);
        System.out.println("Total:"+ order4.total);
        System.out.println("Ready:"+ order4.ready);
    }
}
