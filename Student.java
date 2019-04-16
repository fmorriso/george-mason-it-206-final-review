public class Student extends Person {
    private String classLevel;
    private String major;
    private static final int MAX_GRADES = 5;
    private int[] grades;

    @SuppressWarnings("unused")
    private Student() {
        /* prevent uninitialized instances */
    }

    public Student(String GNumber, String firstName, String lastName, String classLevel, String major) {
        setLastName(GNumber);
        setFirstName(firstName);
        setLastName(lastName);

        this.classLevel = classLevel;
        this.major = major;
        this.grades = new int[MAX_GRADES];
        
        clearGrades();
    }

    private void clearGrades() {
        for(int i = 0; i < grades.length; i++){
            grades[i] = 0;
        }
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