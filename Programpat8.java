public class Programpat8 {
    public static void main(String[] args) {
        int lower = 1, upper = 23;
        int c = 0, t = 0;

        for (int i = lower; i <= upper; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.print(i + " ");
                t++;
            }
            if (t == 3) {
                System.out.println();
                t = 0;
            }
            c = 0;
        }

    }
}
