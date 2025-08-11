/*
class computer {
    public void playmusic(){
        System.out.println("Music Buzzing!!");
    }

    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
        
        return "Nothing!!";
    }
}*/


/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<METHOD OVERLOADING>>>>>>>>>>>>>>>>>>>>>>>>>>
Method overloading: is a feature in Java that allows a class to have more than one method with 
                    the same name, as long as their parameter lists are different. This can be 
                    achieved by changing the number of parameters, the type of parameters, or 
                    both. It is a way to implement compile-time polymorphism, allowing methods 
                    to perform similar tasks but with different types or numbers of inputs.
/*
class calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2){
        return num1 + num2;
    }
}

public class demo {
    
    public static void main(String[] args) {
        /*
        computer obj = new computer();
        obj.playmusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);
        */

        /*
        //Method Overloading
        calculator obj = new calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
        
    }

}
*/

/* <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Stack and Heap>>>>>>>>>>>>>>>>>>>>>>>>>>
1. Stack Memory
    - Follows the Last-In-First-Out (LIFO) principle.
    - Stores method call frames, including local variables and method parameters.
    - Memory in the stack is automatically freed once a method finishes execution.
    - Each thread has its own stack.

2. Heap Memory
    - Used to store objects and instance variables.
    - It is dynamically allocated and shared across all threads.
    - Managed by Java’s Garbage Collector, which automatically frees memory of unused objects.
        🔹 For example, if you create an object inside a method, the reference is stored in the 
            stack, but the actual object is stored in the heap.

*/

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Code>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/*
class calculator{
    int num = 5;

    public int add(int num1, int num2){

        System.out.println("Instance varible in add method: " + num);
        return num1 + num2;
    }
}

class demo{
    public static void main(String[] args) {

        int data  = 10;

        calculator obj = new calculator();
        calculator obj1 = new calculator();
        int r1 = obj.add(4, 5);

        obj.num = 8;

        System.out.println("Result: " + r1);
        System.out.println("Obj check: " + obj.num);
        System.out.println("Obj1 check: " +obj1.num);
    }
}
*/


