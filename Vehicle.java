public abstract class Vehicle {
    private String make;
    private String model;
    private int speed;

    public Vehicle() {
        this("", "");
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void decelerate(int speed) {
        this.speed -= speed;
        if (this.speed < 0)
            stop();
    }

    public void stop() {
        this.speed = 0;
    }

    public String toString(){
        return String.format("Make: %s | Model: %s | Speed: %d", make, model, speed);
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }
}