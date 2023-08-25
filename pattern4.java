public class pattern4 {

    public static void main(String[] args) {
        char var = 97;
        int v = 1;
        int i = 1, j = 1;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                if (j % 2 == 0) {
                    System.out.print((char) var + " ");
                    var++;
                } else {
                    System.out.print(v + " ");
                    v++;
                }

            }
            System.out.println();
        }

    }

}
