package net.company.zad9;

class Employee {

    private String firstName;
    private String lastName;
    private int salary;

    {
        salary = 3000;
    }

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        salary = 4500;
    }

    public int getSalary() {
        return salary;
    }
}
