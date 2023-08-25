import java.util.Scanner;

public class arradd {
    public static void main(String[] args) {
        int i,n,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];

        for(i=0;i<n;i++)
        {
            System.out.println("enter no:");
            arr[i]=sc.nextInt();
            
        }
        System.out.println("arr elements are:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for(i=0;i<n;i++)
        {
        
            for(j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        
        }
        System.out.println("largest value in array:");
        System.out.println(arr[1]);
        
        
    }

    
}
