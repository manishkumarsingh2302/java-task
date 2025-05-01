// Parent class
class Animal7 {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class
class Dog extends Animal7 {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class
    }
}
