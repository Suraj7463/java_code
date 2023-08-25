import java.util.Scanner;

public class accenture {

    private int i = 10;
    private static int y = 40;

    public void add() {
        int sum;
        accenture obj = new accenture();

        sum = obj.i + y;
        System.out.println(sum);
    }

    public void table() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no * i);

        }
    }

    public void even() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i + " even no");
            } else {
                System.out.println(i + "odd no");
            }
            i++;
        }

    }

    public static void main(String[] args) {

        accenture obj = new accenture();

        System.out.println(obj.i);
        System.out.println(y);
        obj.add();
        obj.table();
        obj.even();
    }

}
