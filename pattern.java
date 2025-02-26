 class Pattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Ek line mein stars print karega
            }
            System.out.println(); // New line ke liye
        }
    }
}