/*
Inheritance in Java
Inheritance is one of the four pillars of OOP. It allows a class (child/subclass) to reuse the fields and methods 
of another class (parent/superclass), which helps in code reusability and reduces redundancy.

In Java, we achieve inheritance using the <extends> keyword.

Single-level inheritance → One parent class and one child class.
Multi-level inheritance → A chain of inheritance, e.g., Class A → Class B → Class C.

Java does not support multiple inheritance (a class having more than one direct parent) to avoid the 
diamond problem.
For example:
    - If Class C inherits from both Class A and Class B, and both A and B have a method with the same 
     name, C won’t know which one to use — this creates ambiguity.
    - To solve this, Java allows multiple inheritance only through interfaces, not through classes.

💡 One-liner for interviews:
Inheritance lets a child class reuse the code of a parent class using extends. Java supports single and 
multi-level inheritance but avoids multiple inheritance with classes to prevent ambiguity (diamond problem). 
*/


class Cal{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCal extends Cal{
    public int multi(int n1, int n2){
        return n1 * n2;
    }

    public int div(int n1, int n2){
        return n1 / n2;
    }
}

class VeryAdvCal extends AdvCal{
    public int mod(int n1, int n2){
        return n1 % n2;
    }

    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCal obj = new VeryAdvCal();
        int r1 = obj.add(2, 4);
        int r2 = obj.sub(2, 4);
        int r3 = obj.multi(2, 4);
        int r4 = obj.div(2, 4);
        int r5 = obj.mod(2, 4);
        double r6 = obj.power(2, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);
    }
}
