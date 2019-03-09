package Assignment6.PartA;

import java.util.ArrayList;

//Three Constructors
public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> ratings;//list of ratings stored in store object

    public Mreview() {
        this.title = "";
        this.ratings = new ArrayList<Integer>();
    }

    public Mreview(String title) {
        this.title = title;
        this.ratings = new ArrayList<Integer>();
    }

    public Mreview(String title, int firstrating) {
        this.title = title;
        this.ratings = new ArrayList<Integer>();
        ratings.add(firstrating);
    }

    //methods
    public String getTitle() {
        return this.title;
    }

    public void addRating(int rating) {
        this.ratings.add(rating);
    }

    public double aveRating() {
        double avg = 0;
        for (int i = 0; i < ratings.size(); i++) {
            avg = avg+this.ratings.get(i);
        }
        return avg/numRatings();
    }

    public int numRatings() {
        return this.ratings.size();
    }

    @Override
    public int compareTo(Mreview obj) { //compares movie title
         return obj.getTitle().compareToIgnoreCase(this.title);
    }

    public boolean equals(Mreview obj) { // compares movie ratings
         return obj.aveRating()==this.aveRating();
    }

    public String toString() {
        String str="Movie " +this.title+ " has ratings: " +aveRating();
         return str;

    }
}
