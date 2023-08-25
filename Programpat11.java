public class Programpat11 {
    public static void main(String[] args) {
        int i = 4, j = 1, k = 1;
        int val = 1;
        int car = 98;
        int s = 2;
        for (i = 4; i >= 1; i--) {
            for (k = 1; k <= s; k++) {

                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    if (i == 4 && j == 4) {
                        System.out.print("d" + " ");
                        break;
                    }
                    System.out.print((char) car + " ");
                } else {
                    System.out.print(val + " ");
                    val = val + 1;
                }

            }
            System.out.println();
            s = s + 2;
            val = 1;

        }

    }
}
