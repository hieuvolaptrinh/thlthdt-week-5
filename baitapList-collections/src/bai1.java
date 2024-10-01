import java.util.Scanner;

public class bai1 {
    public static void NhapMang(int[] a,int n){
        for (int i = 0; i < n; i++) {
            a[i] =new Scanner(System.in).nextInt();

        }
    }
    public static int Tong(int[] a,int n){
        int tong =0;
        for (int i = 0; i < n; i++) {
            tong=tong+a[i];
        }
        return tong;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n =sc.nextInt();
        int[] a=new int[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        NhapMang(a,n);
        System.out.println("Tong cac phan tu trong mang la: "+Tong(a,n));
    }
}
