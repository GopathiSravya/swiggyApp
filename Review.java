public class Review {
    public User user;
    public Restaurant restaurant;
    public int rating;
    public String comment;

    @Override
    public String toString() {
        return "Review{" +
                "user=" + user +
                ", restaurant=" + restaurant +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Review(User user, Restaurant restaurant, int rating, String comment){
        this.user = user;
        this.restaurant=restaurant;
        this.comment=comment;
        this.rating=rating;
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
    public int getRating(){
        return rating;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment=comment;
    }
}
