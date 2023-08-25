public class Programpat4 {
    public static void main(String[] args) {
        int i = 4, j = 1;
        int val = 4, str = 67;
        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) str + " ");

                } else {
                    System.out.print(val + " ");
                }
            }
            System.out.println();

            if (i % 2 != 0) {
                str = str - 2;
            } else {
                val = val - 2;
            }

        }

    }

}
