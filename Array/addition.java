import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("enter two no:");
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of no is:" + sum);

    }

}
