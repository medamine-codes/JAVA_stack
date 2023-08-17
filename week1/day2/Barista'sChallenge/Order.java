import java.util.ArrayList;
public class Order{
    private String name ;
    private boolean ready ;
    private ArrayList<Item> items ;

    //CONTRUCTOR
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<>();
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<>();
    }

    //METHODS
    public void addItem (Item item){
            items.add(item);
        }

    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }
    
    
    
    
    
    
    
    
    //GETTERS AND SETTERS
    public String getName(){
        return name ;
    }
    public void setName(String name){
        this.name = name ;
    }z
    public boolean getReady(){
        return ready ;
    }
    public void setReady(boolean ready){
        this.ready = ready ;
    }
    public ArrayList<Item> getItems(){
        return items ;
    }
    public void setName(ArrayList<Item> items){
        this.items = items ;
    }
}