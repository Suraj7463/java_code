import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Programpat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many row to print:");
        int k = sc.nextInt();
        int j = 1;
        int val = 3;
        int car = 98;
        for (int i = k; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i == 4) {
                    if (j % 2 != 0) {
                        System.out.print(val + " ");
                        val = val - 1;
                    } else {
                        System.out.print((char) car + " ");
                        car = car + 2;
                    }
                }
                if (i == 3) {
                    if (j == 2) {
                        System.out.print("2 ");
                    } else {
                        System.out.print((char) car + " ");
                        car = car + 2;
                    }
                }
                if (i == 2) {
                    if (j == 1) {
                        System.out.print("1");
                    } else {
                        System.out.print(" d ");
                    }
                }
                if (i == 1) {
                    System.out.print("d");
                }

            }
            System.out.println();
            car = 98;
        }
    }

}
