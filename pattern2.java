public class pattern2 {
    public static void main(String[] args) {
        int var = 65;
        int i = 0, j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (var % 2 != 0) {

                    System.out.print((char) var + " ");
                    var++;
                } else {
                    int c = var + 32;
                    System.out.print((char) c + " ");
                    var++;
                }
            }
            System.out.println();

        }
    }
}
