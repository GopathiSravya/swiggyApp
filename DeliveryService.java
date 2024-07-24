import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    public List<Delivery>deliveries=new ArrayList<>();
    public void scheduleDelivery(Delivery delivery){
        deliveries.add(delivery);
    }
    public List<Delivery>getDeliveries(){
        return deliveries;
    }
}
