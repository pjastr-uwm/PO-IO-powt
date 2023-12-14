package porownywanie.zad14;

public class Course implements Comparable<Course>{

    private String name;

    private int numberOfHours;
    private double price;

    public Course(String name, int numberOfHours, double price) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfHours=" + numberOfHours +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Course obj) {
        int hourComparison = Integer.compare(this.numberOfHours, obj.numberOfHours);
        if (hourComparison!=0)
            return hourComparison;
        return Double.compare(obj.price, this.price);
    }
}
