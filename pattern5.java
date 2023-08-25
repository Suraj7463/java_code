public class pattern5 {
    public static void main(String[] args) {
        int var = 1;
        int i = 1, j = 1;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                if (var % 2 == 0) {
                    System.out.print(var * var + " ");
                    var++;
                } else {
                    System.out.print(var + " ");
                    var++;
                }

            }
            System.out.println();
        }

    }

}
