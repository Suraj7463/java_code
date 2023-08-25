public class Programpat {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int val = 97;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print((char) val + " ");
                    // val = val + 1;
                } else {
                    val = val - 32;
                    System.out.print((char) val + " ");
                    val = val + 32;
                }
            }
            val = val + 1;
            System.out.println();
        }
    }

}
