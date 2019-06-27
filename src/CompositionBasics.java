/*
 * Create an Education class and make an instance of the Education class a member of the
 * Person class. Your education class should include a list of last 10 schools attended.
 * Create a toString() override for both Job and Education that outputs the information
 * in the class to the console. The toString() override for Person should use the
 * toString() methods for the Job and Education member objects.
 */


public class CompositionBasics {

    public static void main(String[] args) {
        Person bobby = new Person();
        System.out.println(bobby.getSalary());

        bobby.setEducation("UMCP", 1990, "BA");
        bobby.setEducation("UMBC", 1991, "BS");
        bobby.setEducation("George Town", 1992, "Associates");
        bobby.setEducation("UDC", 1993, "Associates");
        bobby.setEducation("UVA", 1994, "BS");
        bobby.setEducation("George Washington", 1995, "BA");
        bobby.setEducation("George Town", 1996, "MA");
        bobby.setEducation("George Mason", 1997, "MS");
        bobby.setEducation("UDC", 1998, "MS");
        bobby.setEducation("UMCP", 1999, "MBA");

        bobby.setSalary(50000L);
        System.out.println(bobby.toString());

    }
}
