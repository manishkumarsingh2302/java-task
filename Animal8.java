// Parent class
class Animal8 {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class 1
class Dog extends Animal8 {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child class 2
class Puppy extends Dog {
    void play() {
        System.out.println("Playing...");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited from Animal8 class
        puppy.bark(); // Inherited from Dog class
        puppy.play(); // Defined in Puppy class
    }
}
