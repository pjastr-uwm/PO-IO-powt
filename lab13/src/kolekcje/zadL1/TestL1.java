package kolekcje.zadL1;

import java.util.TreeMap;

public class TestL1 {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("AA", 56);
        map.put("545", 22);
        map.put("fdgf", 33);
        map.put("ĄĄ", 44);
        map.put("y4", 12);
        System.out.println(map);
        TreeMap<String ,Integer> result = a1.subMapInRange(map, "EE", "y4");
        System.out.println(result);
    }
}
