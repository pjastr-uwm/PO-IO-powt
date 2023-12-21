package kopiowanie.zad19;

public class TestCar {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1= new Car("AA", "XX", new Engine(3,4, "TT"));
        Car c2 = c1.clone();
        System.out.println(c1 == c2);
    }
}
