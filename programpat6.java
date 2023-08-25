public class programpat6 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int val = 2;
        int c = 0;
        int t = 0;
        /*
         * for (i = 2; i <= 23; i++) {
         * if (val % i == 0) {
         * c = c + 1;
         * }
         * if(c==2)
         * {
         */
        for (i = 2; i <= 23; i++) {
            if (val % i == 0) {
                c = c + 1;
                val = val + 1;
            }
            if (c == 1) {
                System.out.print(val);
                t = t + 1;
                c = 0;
                val = val + 1;
            }
            if (t == 3) {
                System.out.println();
                c = 0;
                val = val + 1;
            }
            val = val + 1;

        }

    }

}
