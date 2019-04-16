public class Sedan extends Car {
    public Sedan(){
        super();
    }

    public Sedan(String make, String model){
        super(make, model);
    }

    public Sedan(String make, String model, int modelYear){
        super(make, model, modelYear);
    }

    public String toString(){
        return String.format("Sedan: %s", super.toString() );
    }
}