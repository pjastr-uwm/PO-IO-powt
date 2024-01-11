package kolekcje.zadA1;

import java.util.ArrayList;
import java.util.Collection;

public class TestA1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-12);
        list.add(7);
        list.add(4);
        list.add(11);
        list.add(4);
        //System.out.println(list);
        printUnique(list);
    }

    public static <T> void printUnique(Collection<T> items){
        ArrayList<T> temp = new ArrayList<>();
        for(var elem: items){
            if (!temp.contains(elem)){
                System.out.println(elem);
                temp.add(elem);
            }
        }
    }
}
