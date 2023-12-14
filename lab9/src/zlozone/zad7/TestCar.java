package zlozone.zad7;

public class TestCar {

    public static void main(String[] args) {
        Engine e1 = new Engine(3.4, "AA", "BB");
        Car c1 = new Car("XX","YY", e1);
        System.out.println(c1);
        Car c2 = new Car("XX", "YY", new Engine(3.4, "AA", "BB"));
        System.out.println(c1.equals(c2));
    }
}
