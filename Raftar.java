import java.util.*;

public class Raftar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int count = 0;
            boolean happy = false;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ("aeiou".indexOf(ch) != -1) {
                    count++;
                    if (count > 2) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(happy ? "Happy" : "Sad");
        }
    }
}