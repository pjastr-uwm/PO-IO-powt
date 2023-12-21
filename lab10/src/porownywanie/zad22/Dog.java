package porownywanie.zad22;

public class Dog extends Animal implements Comparable<Animal>{

    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", breed=" + breed ;
    }

    @Override
    public int compareTo(Animal obj){
        if (obj instanceof Dog){
            Dog temp = (Dog) obj;
            int base = super.compareTo(temp);
            if (base!= 0)
                return  base;
            return this.breed.compareTo(temp.breed);
        }
        return super.compareTo(obj);
    }


}
