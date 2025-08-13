//Strings in Java:
/*
In Java, a String is a reference data type used to store a sequence of characters. Strings are immutable, 
meaning once created, their value cannot be changed. If you modify a string, a new object is created in 
memory, and the old one remains unchanged.

Memory Management:
    - String objects are stored in heap memory.
    - String literals are stored in a special area called the String Constant Pool (SCP) within the heap.
    - The reference variable (name of the string) is stored in the stack, pointing to the object in the heap.
    - If a new string literal is created and an identical one already exists in the SCP, Java will reuse the existing 
      object (memory optimization).

Mutable vs Immutable:
    - Immutable: String class — cannot change value after creation.
    - Mutable: StringBuffer (thread-safe) and StringBuilder (non-thread-safe but faster) allow modification 
    without creating new objects.
*/

/*
public class string{
    public static void main(String[] args) {
        String name = "Aditya";
        name = name + " Ingale";
        System.out.println("Hello " + name);

        String s1 = "Aditya";                      //Stored in SCP
        String s2 = "Aditya";                     //Reuse the same object from SCP
        String s3 = new String("JAVA");  // Creates a new object in heap

        System.out.println(s1 == s2);
    }
}
*/


/*
StringBuffer in Java:
StringBuffer is a mutable class in Java used to create and modify strings without creating new objects
 for each change. Unlike the immutable String class, changes to a StringBuffer object affect the same 
 memory location.

Key Points:
    - Default Capacity: 16 characters (before any resizing).
    - If initialized with a string, capacity = initial string length + 16.
        Example: "Aditya" → length = 6, so capacity = 22.
    - Thread-safe: All methods in StringBuffer are synchronized, making it safe to use in multi-threaded 
      environments.
    - Capacity increases automatically if exceeded: newCapacity = (oldCapacity * 2) + 2.
 */
/*
public class string{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aditya");
        sb.append(" Ingale");
        sb.insert(13, " learning JAVA");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
*/

/*
Static Variables in Java:
A static variable in Java is a variable that belongs to the class rather than any specific object. This means:
    - Only one copy of the variable exists, regardless of how many objects are created.
    - All objects share the same static variable.
    - Static variables are stored in the Method Area (MetaSpace).

Key Points:
    - Declared using the static keyword inside a class.
    - Can be accessed using class name or an object reference (class name is recommended).
    - Useful for constants, counters, and values common to all objects.
*/

/*
class Mobile{
    String name;
    int price;
    static String type;

    public void show(){
        System.out.println(name + " : " + price + " : " + type);
    }
}


public class string{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.name = "Samsung";
        obj1.price = 1500;
        Mobile.type = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.name = "Apple";
        obj2.price = 1600;
        Mobile.type = "Smartphone";

        obj1.show();
        obj2.show();
    }
}
*/

/*
Static Methods in Java:
A static method is a method that belongs to the class rather than any specific object.
    - Declared using the static keyword.
    - Can be called without creating an object, using the class name.
    - Can only access static variables and other static methods directly.
    - Cannot use this or super keywords because they are related to object instances.
*/

/*
 class Mobile{
    String name;
    int price;
    static String type;

    public void show(){
        System.out.println(name + " : " + price + " : " + type);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.name + " : " + obj.price + " : " + type);
    }
}

public class string{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.name = "Samsung";
        obj1.price = 1500;
        Mobile.type = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.name = "Apple";
        obj2.price = 1600;
        Mobile.type = "Smartphone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}
*/

/*
Static Block
A static block in Java is a block of code inside a class that runs only once when the class is loaded into 
memory by the JVM.

Key Points:
    - Declared using static { ... }
    - Runs before the main() method and before any object of the class is created.
    - Commonly used to initialize static variables or run setup code.


Constructor
A constructor is a special method in Java used to initialize objects when they are created.

Key Points:
    - Name of the constructor is same as the class name.
    - Has no return type (not even void).
    - Called automatically when you create an object with new.
    - Used to set initial values for instance variables.
    - Can be overloaded (different parameter lists).
*/

class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class string {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Mobile");
		
//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//		
//		Mobile obj2=new Mobile();

	
	}
}
