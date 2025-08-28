/*
1. Inner Class (Non-static inner class)
    - A class defined inside another class.
    - Has access to the outer class’s members (even private ones).
    - Usually used when a class is closely related to another and is not useful alone.

class Outer {
    private String msg = "Hello from Outer";

    // Inner class
    class Inner {
        void show() {
            System.out.println(msg); // can access private field of Outer
        }
    }
}

public class demo5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // create inner class object
        inner.show();
    }
}


2. Static Inner Class (Nested Static Class)
    - Declared with static keyword inside another class.
    - Does not need outer class object to be created.
    - Can only access static members of the outer class directly.


class Outer {
    static String msg = "Hello from Outer (static)";

    // Static Inner Class
    static class Inner {
        void show() {
            System.out.println(msg); // can access static members of Outer
        }
    }
}

public class demo5 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // no outer object needed
        inner.show();
    }
}

3. Anonymous Inner Class
    - A class without a name.
    - Declared and instantiated in one step.
    - Used for quick one-time use, often when implementing an interface or overriding a 
      method without creating a separate class file.
    
interface Greeting {
    void sayHello();
}

public class demo5 {
    public static void main(String[] args) {
        // Anonymous inner class
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        g.sayHello();
    }
}

    
4. Abstract + Anonymous Inner Class
    - When you have an abstract class, you can create an anonymous subclass on the spot 
      to implement its abstract methods.
    - This avoids creating a separate concrete class.

*/

abstract class Animal {
    abstract void sound();
}

public class demo5 {
    public static void main(String[] args) {
        // Anonymous inner class extending abstract class
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Woof Woof!");
            }
        };

        dog.sound();
    }
}

