/*
1. this()
Purpose: Calls another constructor of the same class.

Rules:
    - Must be the first statement in the constructor.
    - Helps with constructor chaining within the same class.

2. super()
Purpose: Calls the constructor of the immediate parent class.

Rules:
    - Must be the first statement in the constructor (if present).
    - f you don’t explicitly call it, Java automatically inserts super() to call the parent’s no-arg constructor.
*/

class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("In A with int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        this();
        System.out.println("In B with int");
    }
}

public class thisAndsuper {
    public static void main(String[] args) {
        B obj = new B(4);
    }
}
