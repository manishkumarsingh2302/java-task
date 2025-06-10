// Main class
public class FunctionAdvanced {

    public static void main(String[] args) {
        // Creating object using constructor
        Person person1 = new Person("Manish", 22);

        // Displaying info using instance method
        person1.displayInfo();

        // Updating age using method (pass by value)
        int age = person1.getAge();
        increaseAge(age); // won't change original
        System.out.println("After method (pass by value): " + person1.getAge());

        // Returning object from a method
        Person person2 = person1.clonePerson();
        person2.displayInfo();

        // Demonstrate polymorphism (dynamic method dispatch)
        System.out.println("\n--- Polymorphism Example ---");
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();  // Circle's version
        s2.draw();  // Rectangle's version
    }

    // Method to increase age (pass by value in Java)
    public static void increaseAge(int age) {
        age = age + 1; // Only affects local copy
    }
}

// Person class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display data
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Getter method
    public int getAge() {
        return age;
    }

    // Method returning object
    public Person clonePerson() {
        return new Person(this.name + " Clone", this.age);
    }
}

// Base class
abstract class Shape {
    abstract void draw();  // abstract method
}

// Derived class Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
