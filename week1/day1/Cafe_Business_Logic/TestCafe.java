import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil CafeUtil1 = new CafeUtil() ; 
        int sum = CafeUtil1.GetStreakGoal(10);
        System.out.println(sum);
        double[] itemPrices = { 10.99, 5.99, 8.49, 3.79 };
        double total = CafeUtil.getOrderTotal(itemPrices);
        System.out.println("Total Order Amount: $" + total);
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        CafeUtil.displayMenu(menuItems);
        ArrayList<String> customers = new ArrayList<>();
        CafeUtil.addCustomer(customers);
        CafeUtil.addCustomer() ;
    }
}
