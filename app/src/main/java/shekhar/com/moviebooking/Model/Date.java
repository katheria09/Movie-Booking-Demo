package shekhar.com.moviebooking.Model;

/**
 * Created by shekh on 27-Jan-18.
 */

public class Date {

        private String date ,month;

    public Date() {
    }

    public Date(String date ,String month) {
        this.date = date;
        this.month = month;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}

