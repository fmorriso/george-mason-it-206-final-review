// George Mason University - IT 206 - Final Review
public class DriverAB {
    
    public static void main(String[] args) {
        
    
		DialogHelper.makeDialogsEasierToSee(32);
        
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