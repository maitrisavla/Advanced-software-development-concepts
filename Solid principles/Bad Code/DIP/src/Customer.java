class Customer{
    public static void main(String[] args) {}
    public String name;
    public String phone;

    public Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public void placeOrder(Integer orderID, String item){
        Order order = new Order(orderID);
        order.saveOrder(item);
    }
}
