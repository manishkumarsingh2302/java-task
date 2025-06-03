public class Main1 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello";

        System.out.println(str1 == str2);             // false
        System.out.println(str1.intern() == str2);    // true
    }
}
