/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Access Modifiers in Java>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Access modifiers in Java are keywords that define the scope (visibility) of classes, methods, and variables. 
They control where these members can be accessed from:
    - Same class
    - Same package
    - Subclasses
    - Different packages

Java provides four access modifiers: private, default, protected, and public.

1. private
     - Accessible only within the same class.
     - Not visible to subclasses or other classes, even in the same package.

2. default (no modifier)
    - If you don’t specify any modifier → it becomes package-private.
    - Accessible within the same package only.
    - Not accessible from outside the package (even for subclasses).

3. protected
Accessible in:
    - same class 
    - same package (all classes in that package) 
    - different package but only through subclass 
    - NOT accessible in different package non-subclass.

4. public
    - Accessible from anywhere (same class, same package, subclass, different package).


<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Definition of Polymorphism>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Polymorphism in Java means "one name, many forms"
It allows a single method, operator, or object to behave in different ways depending on the context.

There are two main types:
    - Compile-time polymorphism (Static Binding / Early Binding) → Method Overloading.
    - Runtime polymorphism (Dynamic Binding / Late Binding) → Method Overriding

1. Compile-Time Polymorphism (Method Overloading)
    - Achieved by method overloading.
    - Same method name but different parameter lists (different number or type of arguments).
    - Decision about which method to call is made at compile time.

Example:
class Calculator {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));       // calls int version
        System.out.println(calc.add(5.5, 10.5));  // calls double version
    }
}

2. Runtime Polymorphism (Method Overriding / Dynamic Method Dispatch)
Achieved by method overriding.
    - A child class provides its own implementation of a method already defined in the parent class.
    - Which method is called is decided at runtime, based on the object being referred to.
    This mechanism is called Dynamic Method Dispatch because the JVM decides at runtime 
    which overridden method to execute.
*/
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();   // reference of parent, object of child
        a.sound();       // Output: Dog barks

        a = new Cat();   // reference of parent, object of child
        a.sound();       // Output: Cat meows
    }
}


