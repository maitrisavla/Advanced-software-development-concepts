class Customer{
    public static void main(String[] args) {}
    public String name;
    public String phone;

    public Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public void placeOrder(Integer orderID, String item){
        OrderType pickup  = new PickupOrder(orderID);
        OrderType delivery = new DeliveryOrder(orderID);
        pickup.saveOrder(orderID, item);
        delivery.saveOrder(orderID, item);
    }
}