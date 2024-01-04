package zad14;

public class TestPerson {

    public static void main(String[] args) {
        Person[] tab = new Person[4];
        tab[0] = new Person("AA", 12);
        tab[1] = new Person("BB", 22);
        tab[2] = new Person("FF", 7);
        tab[3] = new Person("TT", 33);
        System.out.println(Algorithm.minVale(tab));
    }
}
