import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferred {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter value:");
        String x = br.readLine();
        System.out.println(x);
        System.out.println("enter value:");
        int y = Integer.parseInt(br.readLine());
        System.out.println(y);

    }

}
