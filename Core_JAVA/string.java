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