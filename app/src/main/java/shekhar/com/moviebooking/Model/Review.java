package shekhar.com.moviebooking.Model;

/**
 * Created by shekh on 25-Jan-18.
 */

public class Review {
    private String name, rating, title , review;

    public Review() {
    }

    public Review(String name, String rating, String title,String review ) {
        this.name = name;
        this.rating = rating;
        this.title = title;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
