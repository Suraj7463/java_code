public class Programpat5 {
    public static void main(String[] args) {
        int i = 5, j = 1;
        int val = 5, str = 68;
        int tstr = str;
        int temp = 0;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) str + " ");
                    str = str - 1;
                } else {
                    System.out.print(val + " ");
                    val = val - 1;
                    temp++;

                }
            }
            System.out.println();
            if (i % 2 == 0) {
                str = tstr - 2;
            } else {

                val = temp - 2;
                temp = 0;

            }
        }

    }

}
