public class Programpat2 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int val = 1;
        int temp = val;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(val + " ");

                val = temp * (j + 1);
            }
            System.out.println();
            val = i + 1;
            temp = val;

        }
    }

}
