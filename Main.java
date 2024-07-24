public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService();
        RestaurantService restaurantService=new RestaurantService();
        OrderService orderService=new OrderService();
        DeliveryService deliveryService=new DeliveryService();
        User user=new User("sravya","s@gmail.com");
        userService.addUser(user);
        Restaurant restaurant=new Restaurant("pizzahut","kdd");
        restaurantService.addRestaurant(restaurant);
        Order order=new Order(user,restaurant,"KFC","delivered");
        orderService.placeOrder(order);
        Delivery delivery=new Delivery(order);
        deliveryService.scheduleDelivery(delivery);
        System.out.println(user);
        System.out.println(restaurant);
        System.out.println(order);
        System.out.println(delivery);
    }
}