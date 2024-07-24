public class Delivery {
    public Order order;
    public String status;

    @Override
    public String toString() {
        return "Delivery{" +
                "order=" + order +
                ", status='" + status + '\'' +
                '}';
    }

    public Delivery(Order order){
        this.order=order;
        this.status="scheduled";
    }
    public Order getOrder(){
        return order;
    }
    public void setOrder(Order order){
        this.order=order;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
