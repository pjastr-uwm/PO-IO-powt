package kolekcje.zadK1;

import java.util.HashMap;

public class TestAlg {

    public static void main(String[] args) {
        HashMap<String, Double> map= new HashMap<>();
        map.put("AA", 5.6);
        map.put("t", 1.3);
        map.put("4344", 1.5);
        map.put("kk", 5.6);
        map.put("gDEwdf", 5.6);
        System.out.println(map);
        Alg a1 = new Alg();
        HashMap<Double, Integer> result = a1.countValueOccurrences(map);
        System.out.println(result);
    }
}
