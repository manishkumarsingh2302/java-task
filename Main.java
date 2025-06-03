public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Builder");
        sb.append(" Test");
        System.out.println(sb); // Output: Builder Test

        StringBuffer sbf = new StringBuffer("Buffer");
        sbf.append(" Test");
        System.out.println(sbf); // Output: Buffer Test
    }
}
