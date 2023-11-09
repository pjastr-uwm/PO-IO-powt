package pl.people.zad1;

class Person {

    private static int counter;
    private String name;

    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
