import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void NhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = new Scanner(System.in).nextInt();
        }
    }
    public static void SX(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu trong mang: ");
        NhapMang(a, n);
        System.out.println("Cac phan tu trong mang sau khi sap xep theo thu tu tang dan la: ");
        SX(a);
    }
}
