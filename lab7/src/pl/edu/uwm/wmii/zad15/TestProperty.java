package pl.edu.uwm.wmii.zad15;

import java.awt.*;

class TestProperty {

    public static void main(String[] args) {
        Property p1 = new Property("Olsztyn", 200, 300044.45);
        System.out.println(p1);
        Apartment a1 = new Apartment("Olsztyn", 200, 300044.45, 6);
        System.out.println(a1);
        Property p2 = new Property("Olsztyn", 200, 300044.45);
        Property p3 = null;
        Property p4 = new Property(null, 200, 300044.45);
        Property p5 = new Property(new String("Olsztyn"), 200, 300044.45);
        System.out.println(p1.equals(p1)); //true
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.equals(p3)); //false
        System.out.println(p1.equals(p4)); //false
        System.out.println(p1.equals(p5)); // true
        System.out.println(p1.equals(a1)); // false
    }
}