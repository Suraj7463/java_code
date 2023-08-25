public class pattern3 {
    public static void main(String[] args) {
        int var = 1;
        int i = 0, j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(var * var + " ");
                var = var + 1;

            }
            System.out.println();
        }

    }

}
