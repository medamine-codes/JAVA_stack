import java.util.ArrayList;
public class Order{
    String name ;
    double total ;
    boolean ready ;
    ArrayList<Item> items ;

    public void intializeOrder(String orderName){
        name = orderName ;
        total = 0 ;
        ready = false ;
        items = new ArrayList<>();
    }
    public void addItem (Item item){
    if (items != null) {
            items.add(item);
            total += item.price;
        }
    }
    public void markReady(){
        ready = true ;
    }
    
}