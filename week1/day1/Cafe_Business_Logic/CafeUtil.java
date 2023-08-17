import java.util.ArrayList;
public class CafeUtil{
    public int GetStreakGoal(int numweeks){
        int sum = 0 ;
        for (int i = 1 ; i < numweeks+1 ; i++){
            sum += i ;
        } 
        return sum ;
    }

    public static double getOrderTotal(double[] prices){
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public static void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String menuItem = menuItems.get(i);
            System.out.println(i + " " + menuItem);
        }
    }
    public static void addCustomer(ArrayList<String> customers){
        System.out.println ("Please enter your name:");
        String userName = System.console().readLine();

        System.out.println("Hello, " + userName + "!");

        int numAhead = customers.size();
        System.out.println("There are " + numAhead + " people in front of you");

        customers.add(userName);
        System.out.println(customers);
    
    }
}