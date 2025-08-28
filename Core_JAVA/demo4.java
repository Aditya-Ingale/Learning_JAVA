/*
Key Points about abstract in Java
1. Abstract Method
    - Declared using abstract keyword.
    - Has no body/implementation → only method signature.
    - Example:
        - abstract void display();

2. Abstract Class
    - Declared using abstract keyword.
    - Can have abstract methods and concrete (implemented) methods.
    - Cannot be instantiated (no objects allowed).
    - Can have constructors, fields, methods, and static members.

3. Concrete Class
    - A class that extends an abstract class.
    - Must provide implementations for all abstract methods.
    - Can be instantiated (we create objects of concrete classes).

4. Important Notes
    - If a subclass does not implement all abstract methods, it also becomes abstract.
    - An abstract class may or may not contain abstract methods. (So, having abstract methods is optional.)
    - We can have reference of abstract class pointing to an object of its concrete subclass (polymorphism).
*/

abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing Music!!!!!");
    }
}

abstract class Polo extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

class UpdatedPolo extends Polo{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class demo4 {

    public static void main(String[] args) {
        Car obj = new UpdatedPolo();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

}
