import java.util.HashMap;

public class Order {
        public Integer orderID;
        HashMap<Integer, String> orderDetails;

    public Order(Integer orderID) {
            this.orderID = orderID;
            this.orderDetails = new HashMap<>();
        }

        public void saveOrder (String item){
            orderDetails.put(orderID, item);
        }

}