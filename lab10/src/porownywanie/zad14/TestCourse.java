package porownywanie.zad14;

import java.util.Arrays;

public class TestCourse {

    public static void main(String[] args) {
        Course[] list = new Course[4];
        list[0] = new Course("AA", 5, 34.5);
        list[1] = new Course("BB", 5, 12.5);
        list[2] = new Course("CC", 6, 34.5);
        list[3] = new Course("DD", 4, 55.8);
        for(var elem: list){
            System.out.println(elem);
        }
        Arrays.sort(list);
        System.out.println("After sort");
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
