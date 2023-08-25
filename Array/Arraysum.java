import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, sum = 0;
        int n = 0;
        System.out.println("enter array size:");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("enter no: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("array elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("sum of elements are:" + sum);
    }

}
