import java.util.Scanner;

public class ProArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter no ");
            int t = Integer.parseInt(sc.nextLine());
            if (t % 2 != 0) {
                arr[i] = t;
            } else {

                arr[i] = 3;
            }
        }
        System.out.println("array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
