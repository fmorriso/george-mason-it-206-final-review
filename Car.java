public class Car extends Vehicle {
    private int modelYear;

    public Car() {
        super();
        init(0);
    }

    public Car(String make, String model) {
        super(make, model);
        init(0);
    }

    public Car(String make, String model, int modelYear) {
        super(make, model);
        init(modelYear);
    }

    private void init(int modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * @return the modelYear
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * @param modelYear the modelYear to set
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

}