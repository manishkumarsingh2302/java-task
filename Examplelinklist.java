import java.util.LinkedList;

public class Examplelinklist {
    public static void main(String[] args) {
        // LinkedList बनाना
        LinkedList<String> list = new LinkedList<>();

        // Elements add करना
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("Start");   // शुरुआत में जोड़ना
        list.addLast("End");      // अंत में जोड़ना

        // Elements access करना
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Remove करना
        list.remove("B");    // value से हटाना
        list.removeFirst();  // पहला हटाना
        list.removeLast();   // आखिरी हटाना

        // Print पूरी list
        System.out.println("LinkedList: " + list);
    }
}
