package zlozone.zad3lt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private ArrayList<Double> ratings;

    public ComputerGame(String title, String producer, ArrayList<Double> ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings == null ? new ArrayList<>() : new ArrayList<>(ratings);
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

    public ArrayList<Double> getRatings() {
        return new ArrayList<>(ratings);
    }

    public void setRatings(ArrayList<Double> ratings) {
        if (ratings != null)
            this.ratings = new ArrayList<>(ratings);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                ": title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", ratings=" + ratings ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerGame that = (ComputerGame) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(producer, that.producer)) return false;
        return Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + Objects.hashCode(ratings);
        return result;
    }

    public void addRating(double newValue){
        ratings.add(newValue);
    }

    public void removeLast(){
        if(!ratings.isEmpty()){
            ratings.remove(ratings.size()-1);
        }
    }
}

