public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
    }
}

class Dog{
    String name;
    String breed;
    int age;
    void bark()
    {
        System.out.println("Wow wow!");
    }
}
