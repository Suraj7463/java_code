public class Programpat10 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int val = 2;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = val + 1;
            }
            System.out.println();
        }
    }

}
