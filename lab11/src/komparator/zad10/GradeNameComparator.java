package komparator.zad10;

import java.util.Comparator;

public class GradeNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student obj1, Student obj2) {
       int base = Double.compare(obj2.getAverageGrade(), obj1.getAverageGrade());
       if (base !=0)
           return  base;
       return obj1.getName().compareTo(obj2.getName());
    }
}
