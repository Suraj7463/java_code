public class pattern {
    public static void main(String[] args) {
        char var = 65;
        int i = 0, j = 0;
        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.print((char) var + " ");
                var++;

            }
            System.out.println();
        }

    }

}
