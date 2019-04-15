// George Mason - IT 206 - Final Review
public abstract class Employee{

    private double salary;

    public double getSalary() { return this.salary;}

    public boolean setSalary(double salary){

        if(salary >= 0 && salary <= 1_000_000){
            this.salary = salary;
            return true;
        }

        return false;
    }

    public abstract String cut();
}