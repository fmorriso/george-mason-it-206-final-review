import javax.swing.JOptionPane;

public class DriverPerson {
    public static void main(String[] args) {
        DialogHelper.makeDialogsEasierToSee(42);
        // double x = 3.14159;
        //int i = (int) x;
        //String xyz = "ABCDEFG";
        //xyz = "Naria"; // makes an "orphan" out of "ABCDEFGH" until garbage collected
        //ILLEGAL : Person p = new Person("a", "b", "c", "d");
        Person naira = new Student("123456", "Naira", "Ali", "Sophomore", "Information Technology");
        String message = naira.hello();
        //naira.getClassLevel();
        message += "\n";
        message += "I am a " + ( (Student)naira ).getClassLevel(); // <--- NOTICE THE EXTRA PARENTHESES
        message += "\n";
        message += "My major is " + ( (Student)naira ).getMajor();  // <--- NOTICE THE EXTRA PARENTHESES
        message += "\n";
        message += naira.goodbye();
        //JOptionPane.showMessageDialog(null, message, "Person Demo", JOptionPane.INFORMATION_MESSAGE);

        Faculty morrison = new Faculty("987654", "Frederick", "Morrison", "Tutoring", 0);
        message = morrison.hello();
        message += "\n";
        message += "My department is " + morrison.getDepartment();
        message += "\n";
        message += "I make a salary of " + morrison.getSalary();
        message += "\n";
        message += morrison.goodbye();
        //JOptionPane.showMessageDialog(null, message, "Person Demo", JOptionPane.INFORMATION_MESSAGE);

        Student s2 = new Student("14567", "Mary", "Smith", "Freshman", "Art History");


        Person[] people = new Person[3];
        people[0] = naira;
        people[1] = morrison;
        people[2] = s2;
       
        message = "List of people:\n";
        for(int i = 0; i < people.length; i++){
            
            message += people[i].getLastName();
            message += ", ";
            message += people[i].getFirstName();
            message += "\n";
            if(people[i] instanceof Faculty){
                Faculty f = (Faculty) people[i];
                message += "I teach in department " + f.getDepartment();
                message += "\n";
            }
            else if (people[i] instanceof Student){
                Student s = (Student) people[i];
                message += "I am class level " + s.getClassLevel();
                message += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, message, "People List", JOptionPane.INFORMATION_MESSAGE);
    }
}