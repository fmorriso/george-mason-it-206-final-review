public class Faculty extends Person {
    private String department;
    private double salary;

    public Faculty(String GNumber, String firstName, String lastName, String department, double salary){
        super(GNumber, firstName, lastName);
        this.department = department;
        this.salary = salary;
    }
    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

   
    public String hello() {
        return "Hello, I'm a member of the faculty.";
    }

   
    public String goodbye() {
        return "Goodbye from a faculty member.";
    }
}