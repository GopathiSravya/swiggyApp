public class Payment {
    public Order order;
    public double amount;

    @Override
    public String toString() {
        return "Payment{" +
                "order=" + order +
                ", amount=" + amount +
                '}';
    }

    public Payment(Order order, double amount){
        this.order=order;
        this.amount=amount;
    }
    public Order getOrder(){
        return order;
    }
    public void setOrder(Order order){
        this.order=order;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
}
