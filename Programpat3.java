public class Programpat3 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int val = 17;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.print(val + " ");
                val = val - 2;
            }
            System.out.println();
            // val = val - 2;
        }
    }

}
