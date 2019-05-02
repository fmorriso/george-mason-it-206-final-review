import javax.swing.JOptionPane;

public class DriverVehicle {

    private static final String title = "Sedans";
    public static void main(String[] args) {
        DialogHelper.makeDialogsEasierToSee(33);

        // Following is polymoprhic because the "declaring type"
        // (the one on the left of the = sign) is the more generic
        // type and, at the same time, the "actual type"
        // (the one to the right of the = sign) is a "specific type".
        Vehicle camry = new Sedan("Toyota", "Camry", 2014);
        
        String message = camry.toString();
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

        
    }
}