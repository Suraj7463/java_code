import java.util.Scanner;

public class TwoDarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0, sum = 0, sum1 = 0;
        System.out.println("enter no of row:");
        n = sc.nextInt();
        System.out.println("enter no of col:");
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        int i = 0, j = 0, k = 0, s = 2;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("enter no:");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
                if (j == s) {
                    sum1 = sum1 + arr[i][j];
                    s = s - 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("sum of digonal is:" + sum);
        System.out.println("sum of digonal is:" + sum1);

    }

}
