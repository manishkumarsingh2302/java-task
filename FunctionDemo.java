// Main class
public class next {

    // Static method (no return type)
    public static void printWelcome() {
        System.out.println("Welcome to Java Function Demo!");
    }

    // Static method (with return type)
    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading - same method name, different parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Recursive method - factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Instance method
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! Have a great day!");
    }

    // Calling one method from another
    public void processUser(String name) {
        greetUser(name);  // method call
        System.out.println("Process completed.");
    }

    public static void main(String[] args) {

        // Call static methods
        printWelcome();

        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        int product1 = multiply(4, 5);
        double product2 = multiply(2.5, 3.5);
        System.out.println("Int Multiply: " + product1);
        System.out.println("Double Multiply: " + product2);

        int fact = factorial(5);
        System.out.println("Factorial of 5: " + fact);

        // Instance methods need object
        FunctionDemo obj = new FunctionDemo();
        obj.processUser("Manish");

        // Method Overriding Example
        System.out.println("\n--- Method Overriding ---");
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding sound()
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
