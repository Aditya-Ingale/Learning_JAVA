/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<final Keyword in Java>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
The final keyword in Java is a non-access modifier. It can be applied to variables, methods, and classes to 
restrict their modification.

1. final with Variables (Constant)  
    - Once a variable is declared final, its value cannot be changed.
    - It becomes a constant.

2. final with Methods (Cannot be Overridden)
    - A final method cannot be overridden in a subclass.

3. final with Classes (Cannot be Inherited)
    - A final class cannot be extended (no inheritance).

Tip: -
    - The final keyword in Java is used to restrict modification.
    - With variables, it makes them constants (value can’t change).
    - With methods, it prevents overriding.
    - With classes, it prevents inheritance. 
*/

final class A{                                                  //Final keyword with class
    public void show(){
        System.out.println("In show A");
    }
}

class B {
    public final void show(){                                   //Final Keyword with method
        System.out.println("In show B");
    }
}

public class demo3 {
    public static void main(String[] args) {
        final int a = 100;                                      //Final Keyword with variable
        System.out.println(a);

        A obj = new A();
        obj.show();
    }
}
