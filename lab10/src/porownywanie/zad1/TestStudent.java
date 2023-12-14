package porownywanie.zad1;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Anna", 4.7, 2003));
        list.add(new Student("Olga", 4.6, 2005));
        list.add(new Student("Sylwia", 4.7, 2004));
        list.add(new Student("Antek", 4.3, 1990));
        list.add(new Student("Tomasz", 4.1, 2005));
        for(var elem: list){
            System.out.println(elem);
        }
        Collections.sort(list);
        System.out.println("After sort");
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
