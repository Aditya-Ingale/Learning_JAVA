/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Encapsulation in Java:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Encapsulation is one of the four pillars of Object-Oriented Programming (OOP).
It is the practice of wrapping data (variables) and methods that operate on that data 
into a single unit (class), while restricting direct access to the data.

How It Works:
    - Declare variables as private to hide them from outside classes.
    - Provide public getter and setter methods to read and modify the data in a controlled way.

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Getters and Setters in Java:>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Getters and setters are public methods used to access (get) and modify (set) the values of private variables in a class.
They are part of encapsulation, allowing controlled access to the class’s fields.

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<This Keyword:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
"In setters, this is used to differentiate between the instance variable and the local parameter when they 
share the same name. It tells Java, ‘use the current object’s variable,’ not the method’s local one."

If they ask "Anything else about this?", you can add:
    - "It can also refer to the current object, call another constructor in the same class, or pass the current 
       object to another method."
*/

class Human{
    private String name;
    private int age;

    public Human(){
        age = 20;
        name = "Blanky";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

public class demo1 {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.setName("Aditya");
        // obj.setAge(20);
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
