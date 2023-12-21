package komparator.zad10;

public class Student {

    private int id;

    private String name;

    private double averageGrade;

    public Student(int id, String name, double averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
