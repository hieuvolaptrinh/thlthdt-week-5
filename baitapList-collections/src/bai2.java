import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void NhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = new Scanner(System.in).nextInt();
        }
    }

    public static void Dao(int[] a) {
        for (int i = 0,j=a.length-1; i < j; i++,j--) {
            int tg=a[i];
            a[i]=a[j];
            a[j]=tg;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        NhapMang(a, n);
        System.out.println("Cac phan tu trong mang sau khi dao la: ");
        Dao(a);
        System.out.println(Arrays.toString(a));
    }
}

