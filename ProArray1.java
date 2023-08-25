import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProArray1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array size:");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter no ");
            int t = Integer.parseInt(br.readLine());
            if (t % 2 != 0) {
                arr[i] = br.read();
            } else {
                arr[i] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
