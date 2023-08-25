public class progpat1 {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1;
        int val = 65;
        int count = 0;
        for (i = 4; i >= 1; i--) {
            for (k = 1; k <= 4; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (i == 2 && j == 1 || i == 2 && j == i) {
                    if (j == i) {
                        System.out.print("B");
                    } else {
                        System.out.print("a");
                    }
                } else if (j == 1 || j == i) {
                    if (j == 4) {
                        System.out.print("D");
                    } else {
                        System.out.print((char) val);
                    }
                } else {
                    val = val + 33;
                    System.out.print((char) val);
                    count++;
                    val = 65 + count;
                }

            }
            System.out.println();
            val = 65;
            count = 1;
        }
    }
}

/*
 * A b c D
 * A b C
 * a B
 * A
 * 
 */