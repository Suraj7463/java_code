import java.util.Scanner;

public class ProArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 1;
        int temp = 0;
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("enter no:");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            // System.out.println(arr[i]);
            for (j = 1; j < n; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            // System.out.println(arr[i]);
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("largest elemment in array:" + arr[n - 1]);
        System.out.println("second largest number is:" + arr[n - 2]);
    }
}
