import java.util.ArrayList;
public class TestOrders {

    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 2.5);
        Item item3 = new Item("drip coffee", 1.5);
        Item item4 = new Item("capuccino", 3.5);

        // Order variables 
        Order order1 = new Order("Keanu");
        order1.addItem(item1);
        order1.addItem(item3);
        System.out.println(order1.getOrderTotal());

        Order order2 = new Order("Charlie");
        order2.addItem(item2);
        order2.addItem(item4);
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        Order order3 = new Order("Max");
        order3.addItem(item3);
        order3.addItem(item3);
        order3.display();
        
    }
}
