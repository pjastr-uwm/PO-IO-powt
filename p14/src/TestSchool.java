import education.School;
import education.University;

public class TestSchool {

    public static void main(String[] args) {
        School s1 = new School("SP 30","Pieczewska 10", 400);
        University u1 = new University("UWM", "Oczapowskiego 2", 2000,
                "university",50);
        School s2 = new School("SP 30","Pieczewska 10", 400);
        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        s1.recruitment(40);
        System.out.println(u1);
        System.out.println(u1.equals(s2));
        System.out.println(u1.hashCode());
        u1.recruitment(40);

    }
}
