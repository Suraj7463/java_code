public class Propat1 {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1;
        int p = 7;
        for (i = 1; i <= 4; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print(" ");

            }
            for (j = i; j <= p; j++) {
                System.out.print(j);
            }
            System.out.println();
            p = p - 1;
        }
    }

}
