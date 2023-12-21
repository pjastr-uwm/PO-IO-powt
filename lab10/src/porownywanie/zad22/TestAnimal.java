package porownywanie.zad22;

import java.util.ArrayList;

public class TestAnimal {

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("AA", 45));
        list.add(new Animal("BB", 45));
        list.add(new Animal("AA", 32));
        list.add(new Dog("AA", 45, "XX"));
        list.add(new Dog("CC", 22, "YY"));
        list.add(new Dog("EE", 45, "RR"));
        list.add(new Animal("AA", 45));
        for(var elem: list){
            System.out.println(elem);
        }
        list.sort(null);
        System.out.println("Aftrer sorting");
        for(var elem: list){
            System.out.println(elem);
        }

    }
}
