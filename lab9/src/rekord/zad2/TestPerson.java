package rekord.zad2;

public class TestPerson {

    public static void main(String[] args) {
        Address a1 = new Address("Słoneczna", 54, "10-710",
                "Olszyn");
        Person p1 = new Person("Jan", "Nowak", a1);
        System.out.println(p1);
        Person p2 = new Person("Jan", "Nowak",
                new Address("Słoneczna", 54, "10-710",
                "Olszyn"));
        System.out.println(p1.equals(p2));
    }
}
