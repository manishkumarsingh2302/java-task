import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // total test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // length of string
            String S = sc.next(); // the actual string

            // Set of vowels
            String vowels = "aeiou";

            int count = 0; // to count consecutive consonants
            boolean hard = false;

            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);

                if (vowels.indexOf(ch) == -1) {
                    count++; // it's a consonant
                    if (count >= 4) {
                        hard = true;
                        break; // no need to check further
                    }
                } else {
                    count = 0; // reset count if it's a vowel
                }
            }

            if (hard) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
