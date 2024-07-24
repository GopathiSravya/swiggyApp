import java.util.ArrayList;
import java.util.List;

public class OrderService {
    public List<Order>orders=new ArrayList<>();
    public void placeOrder(Order order){
        orders.add(order);
    }
    public List<Order>getOrders(){
        return orders;
    }
}
