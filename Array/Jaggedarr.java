public class Jaggedarr {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1 }, { 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

}
