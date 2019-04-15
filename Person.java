public abstract class Person {
    private String GNumber;
    private String firstName;
    private String lastName;

    public Person(String GNumber, String firstName, String lastName){
        this.GNumber = GNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
     * @return the gNumber
     */
    public String getGNumber() {
        return GNumber;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param gNumber the gNumber to set
     */
    public void setGNumber(String gNumber) {
        this.GNumber = gNumber;
    }

    public abstract String hello();
    public abstract String goodbye();
}