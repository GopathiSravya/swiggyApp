import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private List<Restaurant>restaurants=new ArrayList<>();
    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
    public List<Restaurant>getRestaurants(){
        return restaurants;
    }
}
