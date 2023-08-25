import java.io.*;
import java.util.*;

public class ProTokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter input:");

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, ",");

        String token1 = st.nextToken();
        String token2 = st.nextToken();
        String token3 = st.nextToken();
        String token4 = st.nextToken();
        String token5 = st.nextToken();

        int x = Integer.parseInt(token1);
        int y = Integer.parseInt(token2);

        int sum = x + y;
        System.out.println(sum);

        System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);
        System.out.println(token4);
        System.out.println(token5);

    }

}
