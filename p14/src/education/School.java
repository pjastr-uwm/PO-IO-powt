package education;

import java.util.Objects;

public class School {

    private String name;
    private String address;
    private int students;


    public School(String name, String address, int students){
        this.name = name;
        this.address = (address == null || address.isEmpty())
                ? "ul. Słoneczna 54, 10-710 Olsztyn" :address;
        this.students = students >0 ? students : 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty())
            this.address = address;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        if (students >0)
            this.students = students;
    }

    @Override
    public String toString(){
        if (name == null || name.isEmpty()){
            return getClass().getSimpleName()+": Address: "+address
                    +". Number of students: "
                    +students+".";
        }
        return getClass().getSimpleName()+": Name: "
                +name+". Address: "+address+". Number of students: "
                +students+".";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        School school = (School) obj;
        return address.equals(school.address);
    }

    @Override
    public int hashCode(){
        return 31* address.hashCode();
    }

    public void recruitment(int arg){
        students += arg;
        if(students > 500){
            students = 500;
        }
    }
}
