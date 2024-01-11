package proggeneryczna.zad23;

public class Test23 {

    public static void main(String[] args) {
        Pair<Animal> p1 = new Pair<>(new Animal(), new Animal());
        System.out.println(findMax(p1));
        Pair<Dog> p2 = new Pair<>(new Dog(), new Dog());
        System.out.println(findMax(p2));
        System.out.println(findMaxTwo(p2));
    }

    public static Animal findMax(Pair<? extends Animal> arg){
        return arg.getSecond();
    }

    public static Object findMaxTwo(Pair<? super Dog> arg){
        return arg.getSecond();
    }
}
