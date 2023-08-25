public class Programpat1 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int var = 97;
        for (i = 1; i <= 4; i++) {
            // var = var + 2;
            for (j = 1; j <= i; j++) {
                System.out.print((char) var + " ");
                var = var - 1;
            }
            System.out.println();
            var = var + i + 1;
        }
    }

}
