package info.people.zad13;

class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Nowak", 33, "Olsztyn");
        p1.setAddress("Gdańsk");
        System.out.println(p1.getAddress());
        System.out.println(p1.introduceYourself());
    }
}
