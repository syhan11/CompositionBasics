import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;
    private ArrayList<Education> education;

    public Person() {

        this.job=new Job();
        this.education = new ArrayList<Education>();
    }


    public long getSalary() {
        return job.getSalary();
    }

    public void setSalary(long sal) {
        job.setSalary(sal);
    }

    @Override
    public String toString() {
        String msg = "";
        msg = job.toString() + "\n";

        for (Education school : education) {
            msg = msg + school.toString() + "\n";
        }
        return msg;
    }

    public void setEducation(String name, int year, String degree) {
        Education school = new Education(name, year, degree);
        education.add(school);
    }
}