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