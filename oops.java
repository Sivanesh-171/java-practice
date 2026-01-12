class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class oops {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student("Sivanesh", 20);
        s1.display();
    }
}
