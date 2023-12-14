package porownywanie.zad1;

public class Student implements Comparable<Student>{
    private String name;
    private double averageGrade;
    private int yourOfBirth;

    public Student(String name, double averageGrade, int yourOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yourOfBirth = yourOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yourOfBirth=" + yourOfBirth +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        return Double.compare(obj.averageGrade, this.averageGrade);
    }
}
