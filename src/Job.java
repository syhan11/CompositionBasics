public class Job {
    private String role;
    private long salary;
    private int id;


    public Job() {
        role = "none";
        salary = 1000L;
        id = 0;
    }

    public Job(String role, long salary, int id) {
        this.role = role;
        this.salary = salary;
        this.id = id;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Role: " + role + "\t\t Salary: " + salary + "\n";
    }
}
