import java.util.Scanner;

public class Programpat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        int t = 0;
        int c = 0;
        System.out.println("enter no:");
        int val = sc.nextInt();
        int j = 2;
        for (i = 2; i <= j; i++) {
            if (val % i == 0) {
                c++;
                j++;
                val++;
            }
            if (val == 23) {
                break;
            }
            if (c == 1) {
                System.out.println("value is prime no:" + val);
                j++;
            }

        }
        if (c == 1) {
            System.out.println("value is prime no:" + val);
        }

    }

}
