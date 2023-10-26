import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> osoby = new ArrayList<>();
        osoby.add(null);
        System.out.println(osoby.get(0).name);
    }
}

class Person{
    public String name;
}
