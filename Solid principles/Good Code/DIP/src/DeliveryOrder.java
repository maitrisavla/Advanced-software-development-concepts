import java.util.ArrayList;
import java.util.HashMap;

public class DeliveryOrder implements OrderType {

    public Integer orderID;
    public String ordertype;
    HashMap<Integer, ArrayList<String>> orderDetails;
    ArrayList<String> order;

    public DeliveryOrder(Integer orderID){
        this.orderID = orderID;
        this.orderDetails = new HashMap<>();
        this.order = new ArrayList<>();
        this.ordertype = "Delivery";
    }

    @Override
    public void saveOrder(Integer OrderID, String item) {
        order.add(item);
        order.add(ordertype);
        orderDetails.put(orderID,order);
    }
}