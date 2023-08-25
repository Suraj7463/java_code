import java.util.*;

public class Threearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0, k = 0;
        System.out.println("enter no of plane:");
        n = sc.nextInt();
        System.out.println("enter no of row:");
        m = sc.nextInt();
        System.out.println("enter no of col:");
        k = sc.nextInt();

        int arr[][][] = new int[n][m][k];
        int i = 0, j = 0, r = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                for (r = 0; r < k; r++) {
                    System.out.println("enter no:");
                    arr[i][j][r] = sc.nextInt();
                }
            }
            System.out.println();

        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                for (r = 0; r < k; r++) {
                    System.out.print(arr[i][j][r] + " ");
                }
            }
            System.out.println();
        }

    }

}
