package zlozone.zad3;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings == null ? new double[0] : ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        if (ratings != null)
            this.ratings = ratings.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                ": title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", ratings=" + Arrays.toString(ratings) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerGame that = (ComputerGame) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(producer, that.producer)) return false;
        return Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }

    public void addRating(double newValue){
        double [] temp = new double[ratings.length+1];
        for(int i=0;i<ratings.length;i++){
            temp[i] =  ratings[i];
        }
        temp[ratings.length] = newValue;
        ratings = temp;
    }

    public void removeLast(){
        if( ratings.length >0){
            double [] temp = new double[ratings.length-1];
            for(int i=0;i<ratings.length-1;i++){
                temp[i] =  ratings[i];
            }
            ratings = temp;
        }
    }
}
