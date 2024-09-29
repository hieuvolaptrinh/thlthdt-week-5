import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
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
        for( i= 0; i < n; i++)
            for(int j=0; j<n-1;j++)
                if(M[j] > M[j+1])
                {
                    int tam = M[j];
                    M[j]=M[j+1];
                    M[j+1]= tam;
                }
        System.out.println("Mảng tăng dần là ");
        for(i =0 ; i < n ; i++)
            System.out.println("M[" +i+"]= " +M[i]);
    }
}
