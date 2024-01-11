package kolekcje.zadE2;

import java.util.HashSet;

public class TestE2 {

    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(56);
        set.add(12);
        set.add(33);
        set.add(44);
        HashSet<Integer> set2= new HashSet<>();
        set2.add(22);
        set2.add(11);
        set2.add(30);
        set2.add(77);
        Alg a1 = new Alg();
        System.out.println(a1.hasCommonElements(set, set2));

    }
}
