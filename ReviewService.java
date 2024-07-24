import java.util.ArrayList;
import java.util.List;
public class ReviewService {
    public List<Review>reviews=new ArrayList<>();
    public void addReview(Review review){
        reviews.add(review);
    }
    public List<Review>getReviews(){
        return reviews;
    }
}
