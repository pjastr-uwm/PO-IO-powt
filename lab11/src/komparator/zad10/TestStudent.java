package komparator.zad10;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(234, "AA", 4.5));
        list.add(new Student(111, "BB", 4.2));
        list.add(new Student(555, "BB", 3.2));
        list.add(new Student(333, "CC", 4.2));
        list.add(new Student(965, "XX", 5.0));
        for (var elem: list){
            System.out.println(elem);
        }
        list.sort(new GradeNameComparator());
        System.out.println("After sort");
        for (var elem: list){
            System.out.println(elem);
        }
    }
}
