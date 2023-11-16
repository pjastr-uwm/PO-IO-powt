package pl.edu.uwm.d1;

public class Person {

    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
