package komparator.zad1;

import java.util.Arrays;

public class TestOsoba {

    public static void main(String[] args) {
        Osoba[] tab = new Osoba[5];
        tab[0]  = new Osoba("AA", 34, 34.5);
        tab[1]  = new Osoba("BB", 27, 3.4);
        tab[2]  = new Osoba("RR", 34, 11.2);
        tab[3]  = new Osoba("TT", 11, 22.9);
        tab[4]  = new Osoba("ZZ", 68, 34.5);
        for(var elem: tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new WiekComparator());
        System.out.println("After sorting");
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
