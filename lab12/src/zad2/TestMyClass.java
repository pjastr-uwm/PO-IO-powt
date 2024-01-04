package zad2;

public class TestMyClass {

    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        System.out.println(m1.isEqual("Hello", "Hello"));
        System.out.println(m1.isEqual("Hello", new String("Hello")));
        System.out.println(m1.isEqual(1.2, 1.1+0.1));
        System.out.println(m1.isEqual(1.2, 1.2));
    }
}
