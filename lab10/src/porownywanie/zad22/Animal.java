package porownywanie.zad22;

public class Animal implements Comparable<Animal>{

    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": species=" + species +
                ", age=" + age ;
    }

    @Override
    public int compareTo(Animal obj) {
        int base = Integer.compare(this.age, obj.age);
        if (base !=0)
            return base;
        return this.species.compareTo(obj.species);
    }
}
