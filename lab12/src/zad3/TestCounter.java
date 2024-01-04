package zad3;

public class TestCounter {

    public static void main(String[] args) {
        Counter<Integer> c1 = new Counter<>();
        c1.add(6);
        c1.add(34);;
        c1.add(12);
        System.out.println(c1.getCount());
        System.out.println(c1);

    }
}
