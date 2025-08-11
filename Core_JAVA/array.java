//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<ARRAY>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/*
Arrays in Java:
An array is a reference data type in Java that allows you to store multiple values of the 
same data type in a single variable. Arrays are stored in contiguous memory locations, and 
each element is accessed using an index, starting from 0.

Key Points:
    - Arrays are fixed in size — once declared, the size cannot be changed.
    - All elements must be of the same data type (e.g., all int, all String, etc.).
    - Arrays are stored in the heap memory, while the reference to the array may be stored 
    in the stack.
*/

/*
public class array {
    public static void main(String[] args) {
        int num[] = {9, 7, 2, 4};
        
        //for creating array with a size
        //int num1[] = new int[4]
        num[1] = 6;

        //printing whole array
        for(int i =0; i <= 3; i++){
            System.out.println(num[i]);
        }
    }
}
*/


/*
public class array{
    public static void main(String[] args) {
        
        //Multi-Dimentional Array
        //int nums[][] = new int[3][4]; 

        //Adding random values in array
        /*
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        */
        
        //Printing an multi-dimentional array
        /*
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        */

        //Enhance way of printing multi-dimensional array
        /*
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        */

        //jagged Array
        /*
        int nums[][] = new int[3][];

        nums[0] = new int[2];
        nums[1] = new int[4];
        nums[2] = new int[3];

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        */

        /*
        // 3-dimensional Array
        int nums[][][] = new int[3][2][5];

        // Fill the array with random numbers from 0 to 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        // Print the 3D array using enhanced for-loops
        int layer = 0;
        for (int[][] twoD : nums) {
            System.out.println("Layer " + layer + ":");
            for (int[] oneD : twoD) {
                for (int val : oneD) {
                    System.out.print(val + " ");
                }
                System.out.println(); // Newline after each 1D array
            }
            System.out.println(); // Newline between layers
            layer++;
        }
        
    }
}
*/


//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Array of Objects>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
class Student{
    int rollno;
    String name;
    int marks;
}


public class array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Aditya";
        s1.marks = 77;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "neha";
        s2.marks = 72;
        
        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "avi";
        s3.marks = 88;
        
        Student s4 = new Student();
        s4.rollno = 1;
        s4.name = "abhi";
        s4.marks = 66;

        Student student[] = new Student[4];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = s4;

        for(Student stud : student){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }    
} 



