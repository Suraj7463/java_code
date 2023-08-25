import java.io.*;

public class Bufferreder {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter value you want to show tabale that value:");
        int x = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(x * i);
        }

    }

}
