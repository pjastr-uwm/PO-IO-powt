package education;

public class University extends School{

    private String type;
    private int studies;

    public University(String name, String address, int students,
                      String type, int studies){
        super(name, address, students);
        this.type = type.isEmpty() ? "university of technology" : type;
        this.studies = studies >= 0 ?studies : 10;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.isEmpty())
            this.type = type;
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if(studies >=0)
            this.studies = studies;
    }

    @Override
    public String toString(){
        return super.toString() +"\n"
                + "Type: "+type+".  Number of fields of study: "+studies+".";
    }

    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)) return false;
        University university = (University) obj;
        return studies == university.studies;
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result = 31 * result + studies;
        return result;
    }

    @Override
    public void recruitment(int arg){
        //super.recruitment(arg);
        setStudents(getStudents()+arg);
        if (getStudents() > 500)
            setStudents(500);
        studies += (int) studies/10;
    }
}
