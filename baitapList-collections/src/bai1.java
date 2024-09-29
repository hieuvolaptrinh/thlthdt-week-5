import java.util.Scanner;

public class bai1 {
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
        int tong = 0;
        for ( i = 0; i < n; i++)
            tong = tong + M[i];
        System.out.print("Tổng các phẩn tử trong mảng là "+tong);
    }
}
