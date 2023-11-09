package pl.people.zad1;

class TestPerson {

    public static void main(String[] args) {
        System.out.println(Person.getCounter());
        Person p1 = new Person();
        System.out.println(Person.getCounter());
    }
}
