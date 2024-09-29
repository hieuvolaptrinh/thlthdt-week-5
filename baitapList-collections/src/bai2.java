import java.util.Scanner;

public class bai2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] M = new int[n];
        int i;
        for( i=0; i<n; i++)
        {
            System.out.print("M[" +i +"]= ");
            M[i] = sc.nextInt();
        }
        System.out.println("Mảng vửa tạo ra là ");
        for( i=0;i<n;i++)
            System.out.println("M[" +i +"]= " +M[i]);
        System.out.println("Mảng sau khi đảo ngược:");
        for ( i = n-1 ; i >= 0; i--)
            System.out.println("M[" +i +"]= " +M[i]);
    }
}
