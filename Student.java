public class Student extends Person {
    private String classLevel;
    private String major;
    private static final int MAX_GRADES = 5;
    private int[] grades;

    public Student(String GNumber, String firstName, String lastName, String classLevel, String major) {
        super(GNumber, firstName, lastName);
        this.classLevel = classLevel;
        this.major = major;
        this.grades = new int[MAX_GRADES];
    }

    /**
     * @return the classLevel
     */
    public String getClassLevel() {
        return classLevel;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @param classLevel the classLevel to set
     */
    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    
    public String hello() {
        return "Hello, I'm a student.";
    }

   
    public String goodbye() {
        return "This student says goodbye.";
    }

}