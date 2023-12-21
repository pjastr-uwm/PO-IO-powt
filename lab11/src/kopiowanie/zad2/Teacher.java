package kopiowanie.zad2;

public class Teacher implements Cloneable{

    private String name;

    private String subject;

    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public Teacher clone() throws CloneNotSupportedException {
        return (Teacher) super.clone();
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
