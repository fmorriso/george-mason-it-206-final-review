import java.awt.Font;

import java.util.*;

import javax.swing.JDialog;
//import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class DriverAB {
    
    public static void main(String[] args) {
        
    
		DialogHelper.makeDialogsEasierToSee(64);
        
        /*
        A first = new A();

        first.method1();
        first.method2();
        */

        B second = new B();

        second.method1(); // calls method1 in class A
        second.method2();
        second.method3();
    }

    
}