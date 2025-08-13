/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Default Constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
- A constructor is not exactly a method (it has no return type, not even void), but it runs automatically 
when an object is created.
- If we don’t explicitly write one, Java automatically creates a default constructor with no parameters, 
which assigns default values:
    - 0 for numbers, false for booleans, null for objects (including String).
- If we create our own constructor, Java does not add the default one automatically — we must explicitly 
write it if we still want it.
- Yes — if you create 2 objects, the constructor runs once for each object.

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Parameterized Constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
- These are constructors with parameters that let you initialize object values at the time of creation, 
instead of setting them manually later.
- They provide flexibility to assign different values to different objects when they’re created.
*/

class Human{
    private String name;
    private int age;

    public Human(){
        age = 20;
        name = "Blanky";
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
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

public class demo2 {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(23, "Ghost");
        System.out.println(obj.getAge() + " : " + obj.getName());
        System.out.println(obj1.getAge() + " : " + obj1.getName());
        // obj.setName("Aditya");
        // obj.setAge(20);
        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}