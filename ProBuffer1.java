import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProBuffer1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two number");
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        int sum = x + y;
        System.out.println("sum of number is :" + sum);
    }

}
