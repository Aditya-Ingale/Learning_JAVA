/*
Method Overriding (in Java)
Definition:
When a child class provides its own implementation of a method that is already defined in the parent class 
with the same method name, parameters, and return type, the child’s version overrides the parent’s version.

Key Points:
Which method executes?
    - It depends on the object’s runtime type (dynamic method dispatch / runtime polymorphism), not the 
     reference type.
    - If you override and call the method on a child object, the child’s version executes — not the parent’s.
    - If you still want to call the parent’s version inside the child’s method, you must explicitly use super.methodName().
*/

class Cal{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCal extends Cal{
    public int add(int n1, int n2){
        return n1 + n2 + 1;
    }
}

public class overridding {
    public static void main(String[] args) {
        AdvCal obj = new AdvCal();
        int r1 = obj.add(5, 5);

        System.out.println(r1);
    }
}
