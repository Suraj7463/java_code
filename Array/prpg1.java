import java.io.*;

public class prpg1 {
    public static void main(String[] ram) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter array size");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int arr2[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}