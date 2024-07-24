import jdk.jshell.Snippet;

public class Order {
    public User user;
    public Restaurant restaurant;
    public String item;
    public String status;

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", restaurant=" + restaurant +
                ", item='" + item + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Order(User user, Restaurant restaurant, String item, String status){
        this.user=user;
        this.restaurant=restaurant;
        this.item=item;
        this.status=status;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }
    public Restaurant getRestaurant(){
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant){
        this.restaurant=restaurant;
    }
    public String getItem(){
        return item;
    }
    public void setItem(String item){
        this.item=item;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status){
        this.status="status";
    }
}
