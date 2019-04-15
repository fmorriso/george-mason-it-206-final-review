import javax.swing.JOptionPane;

public class DriverPerson {
    public static void main(String[] args) {
        DialogHelper.makeDialogsEasierToSee(42);

        Person naira = new Student("123456", "Naira", "Ali", "Sophomore", "Information Technology");
        String message = naira.hello();
        message += "\n";
        message += "I am a " + ( (Student)naira ).getClassLevel(); // <--- NOTICE THE EXTRA PARENTHESES
        message += "\n";
        message += "My major is " + ( (Student)naira ).getMajor();  // <--- NOTICE THE EXTRA PARENTHESES
        message += "\n";
        message += naira.goodbye();
        JOptionPane.showMessageDialog(null, message, "Person Demo", JOptionPane.INFORMATION_MESSAGE);

        Faculty morrison = new Faculty("987654", "Frederick", "Morrison", "Tutoring", 0);
        message = morrison.hello();
        message += "\n";
        message += "My department is " + morrison.getDepartment();
        message += "\n";
        message += "I make a salary of " + morrison.getSalary();
        message += "\n";
        message += morrison.goodbye();
        JOptionPane.showMessageDialog(null, message, "Person Demo", JOptionPane.INFORMATION_MESSAGE);
    }
}