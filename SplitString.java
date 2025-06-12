public class SplitString {
    public static void main(String[] args) {
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
