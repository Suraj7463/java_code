import java.lang.Math;

public class armstrong {
    public static void main(String[] args) {
        int num1 = 153, count = 0, rem = 0, arm = 0;
        int z = 0;

        int temp = num1;
        int flag = num1;
        while (temp > 0) {
            rem = temp % 10;
            z = z + rem;
            z = z * 10;

            temp = temp / 10;
        }
        z = z / 10;
        System.out.println(z);

        if (flag == z) {
            System.out.println("Armstrong number" + z);
        } else {
            System.out.println("Not Armstrong number");

        }
    }
}
