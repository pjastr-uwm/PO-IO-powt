package kopiowanie.zad2;

public class TestTeacher {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t1 = new Teacher("AA", "XX", 12);
        Teacher t2 = t1;
        System.out.println(t1 == t2);
        t2.setExperience(20);
        System.out.println(t1);
        System.out.println(t2);
    }
}
