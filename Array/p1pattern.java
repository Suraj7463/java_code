import java.io.*;

public class p1pattern {
    public static void main(String[] ram) throws IOException {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            char ch1 = 'A';
            char ch2 = 'a';
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    if (j % 2 != 0) {
                        System.out.print(ch1 + " ");
                        ch1++;
                        ch2++;
                    } else {
                        System.out.print(ch2 + " ");
                        ch1++;
                        ch2++;
                    }
                }
            }
            System.out.println(" ");
        }

    }
}
/*
 * A b C d
 * A b C
 * a B
 * A
 * 
 */