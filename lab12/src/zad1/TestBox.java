package zad1;

public class TestBox {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(12);
        System.out.println(b1.get());
        System.out.println(b1);
        Box<Integer> b2 = new Box<>(-22);
        System.out.println(b2.get());
        Box<String> b3 = new Box<>("Hello");
        System.out.println(b3.get());
    }
}
