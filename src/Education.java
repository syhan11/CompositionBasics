public class Education {
    private String schoolname;
    private int gradyear;
    private String degree;

    public Education () {
        schoolname = "";
        gradyear = 0;
        degree = "";
    }

    public Education (String name, int year, String degree) {
        schoolname = name;
        gradyear = year;
        this.degree = degree;
    }



    @Override
    public String toString () {
        return "School: " + schoolname + " Year: " + gradyear + " Degree: " + degree;
    }

}
