import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class DriverEmployee {

    public static void main(String[] args) {
      
        DialogHelper.makeDialogsEasierToSee(42);
        
        List<Employee> allEmployees = new ArrayList<Employee>();

        Employee e1 = new Surgeon();        
        Employee e2 = new HairDresser();
        Actor e3 = new Actor();
        Employee e4 = new Tailor();

        allEmployees.add(e1);
        allEmployees.add(e2);
        allEmployees.add(e3);
        allEmployees.add(e4);

        String title = "DriverEmployee";
        String message = "Employee cuts:\n";
        for(Employee emp: allEmployees){
            message += emp.cut(); // < 
            message += "\n";
        }
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

    }
}